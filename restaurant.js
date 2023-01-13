let list=document.getElementsByClassName("item");
           document.getElementById("searchitem").addEventListener('input',filter)
            function filter(){
                var v=document.getElementById("searchitem").value;
                v=v.toLowerCase();
                if("snacks".includes(v) || "rice".includes(v) || "breakfast".includes(v)){
                    let lists=("snacks".includes(v))?document.getElementsByClassName("snacks"):("rice".includes(v))?document.getElementsByClassName("rice"):document.getElementsByClassName("breakfast")
                    let attributeOfP=new Array();
                    for(var i of lists){
                        attributeOfP.push(i.getAttribute('id'))
                    }
                    for(var item of list){
                        var f=0;
                        for(var i of attributeOfP){
                            if(item.getAttribute('id')==i){
                                f=1
                                break;
                            }
                        }
                        if(f==1){
                            item.style.display="";
                        }
                        else{
                            item.style.display="none";
                        }
                    }
                }
                else{
                    for(var item of list){
                        var s=item.firstElementChild;
                        s=s.innerText;
                        s=s.toLowerCase();
                        if(s.includes(v.toLowerCase())){
                            item.style.display="a";
                        }
                        else{
                            item.style.display="none"
                         }
                     }
                }
            }
            /*---------------------------search function in table----------------------------------------*/
            let listoftables=document.getElementsByClassName("tab");
            //console.log(list[0].innerHTML)
            document.getElementById("searchtable").addEventListener('input',filterTables)
            function filterTables(){
                var v=document.getElementById("searchtable").value;
                v=v.toLowerCase();
                for(var item of listoftables){
                    let it=item.firstElementChild;
                    var s=it.innerText;
                    s=s.toLowerCase();
                    if(s.includes(v.toLowerCase())){
                        item.style.display="";
                    }
                    else{
                        item.style.display="none"
                    }
                }
            }
            /*--------------On Drag Updating Values -----------------*/
            let map=new Map();
            map.set("table1",{"totalcost":0,"totalitems":0,"details":new Map(),"cost":[]})
            map.set("table2",{"totalcost":0,"totalitems":0,"details":new Map(),"cost":[]})
            map.set("table3",{"totalcost":0,"totalitems":0,"details":new Map(),"cost":[]})
            let source=0;
            let destination=0;
            function DragOver(e){
                e.preventDefault();
            }
            function dragstarted(e){
                source=e.target.getAttribute('id');
            }
            function DragEnter(e){
                e.preventDefault();
                destination=e.target.getAttribute('id');
                let ele=document.getElementById(source);//getting source id
                let str=(ele.innerText).split("\n")//splitting source text0
                let itemname=str[0]//item name
                let itemcost=parseInt(str[2])//item value
                //let c=m.get(source)
                let table=map.get(destination)//getting respective table ||  destination="table1"
                //let c=table["cost"]
                table["totalcost"]=table["totalcost"]+itemcost//updating total cost
                table["totalitems"]=table["totalitems"]+1//updating total items
                let detailMap=table["details"]//for storing item name and value
                if(detailMap.has(itemname)){
                    detailMap.set(itemname,detailMap.get(itemname)+1);
                }
                else{
                    detailMap.set(itemname,1);
                    table["cost"].push(itemcost)
                //console.log(map.get(destination))
                }
                let ch=document.getElementById(destination).children;
                ch[1].innerHTML=table["totalitems"];
                ch[2].innerHTML=table["totalcost"];
            }
            /*-----------------------------------------------------------*/
            function createtable(){
                let table=document.createElement("table");
                var tr=document.createElement('tr');
                var th=document.createElement('th');
                th.innerHTML=`<th>S.No</th>`
                tr.appendChild(th);
                var th=document.createElement('th');
                th.innerHTML=`<th>ItemName</th>`
                tr.appendChild(th);
                var th=document.createElement('th');
                th.innerHTML=`<th>Cost</th>`
                tr.appendChild(th);
                var th=document.createElement('th');
                th.innerHTML=`<th>Count</th>`
                tr.appendChild(th);
                table.appendChild(tr);
                document.getElementById('popup').appendChild(table);
            }
            async function funon(e){
                await createtable()
                console.log(e.target);
                var g=e.target.getAttribute('id');//get destination id
                console.log("in funon       "+g);
                b=g.toUpperCase()
               document.getElementById("gayathri").innerHTML=b;
               let d=map.get(g)
               let s=d["cost"]
               let it=d["details"]
               var i=1;
               for(let [key,value] of it){
                let tr=document.createElement('tr');
                tr.setAttribute("id","delete");
                var td=document.createElement('td');
                td.innerHTML=`<td>${i}</td>` 
                td.setAttribute("no",i) //serial number
                tr.appendChild(td)
                var td=document.createElement('td');
                td.innerHTML=`<td>${key}</td>` //item name
                tr.appendChild(td)
                var td=document.createElement('td');
                td.innerHTML=`<td>${s[i-1]}</td>`   //item cost
                tr.appendChild(td)
                var td=document.createElement('td');
                /*---------number of servings-------*/
                var inpt=document.createElement('input');
                inpt.setAttribute("min",value);
                inpt.onchange=async(event)=>{
                    await changed(event,key,value,g);
                }
                inpt.setAttribute('type','number');
                inpt.setAttribute('min',"1");
                inpt.setAttribute('value',value);
                td.appendChild(inpt)
                /*td.setAttribute("id",value);*/
                tr.appendChild(td)
                var td=document.createElement('td');
                td.innerHTML=`<td>delete</td>`
                td.setAttribute("id","delete");
                td.onclick=async(event)=>{
                    await crossclick(key,value,g);
                }
                tr.appendChild(td)
                document.querySelector("table").appendChild(tr); 
                i+=1;
               }
               var tr=document.createElement('tr');
               var td=document.createElement('td');
                td.innerHTML=`<td>Toatl Cost  ${d["totalcost"]}</td>`
                td.setAttribute("id","tc");
                td.setAttribute('colspan',"2")
                tr.appendChild(td)
                td=document.createElement('button');
                td.innerHTML=`<td>Generate Bill</td>`
                td.setAttribute("id","button");
                td.setAttribute('colspan',"3")
                tr.appendChild(td)
                document.querySelector("table").appendChild(tr);
                document.getElementById("popup").style.display="block";
                document.getElementById("button").onclick=()=>{
                    console.log("yes");
                    alert("Total Items "+d["totalcost"]+"\nTotal Items "+d["totalitems"]);
                }
            }
            /*--------------on change at no.of servings update map------------*/
            function changed(e,k,v,dest){   //k means current changed key
                let d=parseInt(e.target.value);//current input value;
                console.log(d+"input value")
                var l=map.get(dest)//des is current table l has value of table object
                var i=0;
                console.log(k+"    "+l["details"].get(k));
                for(let key of l["details"].keys()){
                    if(key!=k){i+=1}
                    else{
                        break;
                    }
                }
                var co=l["cost"][i]//get cost of each item
                var t=d-l["details"].get(k);
                console.log(t+"difference")
               // console.log(v)
                co=co*t;//updating totalcost
                //l[k]=t//updating total items
                l["totalitems"]+=t;
                l["totalcost"]+=co;
                l["details"].set(k,d);
                let ch=document.getElementById(dest).children;
                ch[1].innerHTML=l["totalitems"];
                ch[2].innerHTML=l["totalcost"];
                document.getElementById("tc").innerHTML="Total Cost "+l["totalcost"]
                //console.log(document.getElementById(d).innerText);
            }
            function crossclick(k,v,g){
                let obj=map.get(g);
                let i=0;
                for(let key of obj["details"].keys()){
                    if(key!=k){
                        i+=1
                    }
                    else{
                        break;
                    }
                }
                obj["totalitems"]=obj["totalitems"]-v;
                console.log(i)
                console.log(obj["cost"][i])
                obj["totalcost"]=obj["totalcost"]-parseInt(v*(obj["cost"][i]))
                obj["cost"].splice(i,1);
                obj["details"].delete(k);
                let ch=document.getElementById(g).children;
                ch[1].innerHTML=obj["totalitems"];
                ch[2].innerHTML=obj["totalcost"];
                document.getElementById("tc").innerHTML=obj["totalcost"]
                console.log(obj);
                anothercreatetable(g);
            }
            function off(){
                document.querySelector('table').remove();
                document.getElementById("popup").style.display="none";
            }
            async function anothercreatetable(g){
                off();
                await createtable();
                let d=map.get(g)
               let s=d["cost"]
               let it=d["details"]
               var i=1;
               for(let [key,value] of it){
                let tr=document.createElement('tr');
                tr.setAttribute("id","delete");
                var td=document.createElement('td');
                td.innerHTML=`<td>${i}</td>` 
                td.setAttribute("no",i) //serial number
                tr.appendChild(td)
                var td=document.createElement('td');
                td.innerHTML=`<td>${key}</td>` //item name
                tr.appendChild(td)
                var td=document.createElement('td');
                td.innerHTML=`<td>${s[i-1]}</td>`   //item cost
                tr.appendChild(td)
                var td=document.createElement('td');
                var inpt=document.createElement('input');
                inpt.setAttribute("min",value);
                inpt.onchange=async(event)=>{
                    await changed(event,key,value,g);
                }
                inpt.setAttribute('type','number');
                inpt.setAttribute('min',"1");
                inpt.setAttribute('value',value);
                td.appendChild(inpt)
                //td.setAttribute("id",value);
                tr.appendChild(td)
                var td=document.createElement('td');
                td.innerHTML=`<td>delete</td>`
                td.setAttribute("id","delete");
                td.onclick=async(event)=>{
                    await crossclick(key,value,g);
                }
                tr.appendChild(td)
                document.querySelector("table").appendChild(tr);
                i+=1
               }
               var tr=document.createElement('tr');
               var td=document.createElement('td');
                td.innerHTML=`<td>Total Cost  ${d["totalcost"]}</td>`
                td.setAttribute("id","tc");
                td.setAttribute('colspan',"2")
                document.querySelector("table").appendChild(tr);
                document.getElementById("popup").style.display="block";
                //console.log(g)
            }
