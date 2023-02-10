import React,{useEffect, useState} from 'react'
import { Stack,TableContainer,Table,TableHead,TableBody,TableCell,TableRow, colors} from '@mui/material';
import MuiIcon from '../Atom/MuiIcon';
import IconButton from '@mui/material/IconButton';
import MuiTypography from '../Atom/MuiTypography';
import image1 from "../AllImages/bitcoin.png"
import image2 from "../AllImages/etherum.png"
import image3 from "../AllImages/etherum2.jpg"
import image4 from "../AllImages/tether.png"
import image5 from "../AllImages/image5.png"
import image6 from "../AllImages/image6.png"
import image7 from "../AllImages/image7.png"
import image8 from "../AllImages/image8.png"
import image9 from "../AllImages/image9.png"
import Staricon from '../Atom/staricon';
import { info } from 'console';
export type DetailedType={
    icon:string,
    list:{first:string,second:string},
    price:string,
    change:string,
    markercap:string
}
const Sampl1 = () => {
    const details:DetailedType[]=[
        {icon:image1,list:{first:"Bitcoin",second:"BTC"},price:"$3,285,553.73",change:"+1.06%",markercap:"$60.1T"},
        {icon:image2,list:{first:"Ethereum",second:"ETH"},price:"$216,678.10",change:"-5.49%",markercap:"$25.4T"},
        {icon:image3,list:{first:"Ethereum 2",second:"ETH2"},price:"$216,678.10",change:"-5.49%",markercap:"$25.4T"},
        {icon:image4,list:{first:"Tether",second:"USDT"},price:"$74.31",change:"+0.11%",markercap:"$4.6T"},
        {icon:image5,list:{first:"Bitcoin Coin",second:"BNB"},price:"$24,942.54",change:"-3.69%",markercap:"$4.2T"},
        {icon:image6,list:{first:"Cardano",second:"ADA"},price:"$104.52",change:"-1.82%",markercap:"$3.4T"},
        {icon:image7,list:{first:"XRP",second:"XRP"},price:"$57.21",change:"+1.11%",markercap:"$2.7T"},
        {icon:image8,list:{first:"Dodge Coin",second:"XRP"},price:"$17.64",change:"-6.96%",markercap:"$2.3T"},
        {icon:image9,list:{first:"USD Coin",second:"XRP"},price:"$74.26",change:"+1.01%",markercap:"$2.1T"},
    ]
    const [selecteditems,setSelecteditems]=useState<DetailedType[]>([]);
    useEffect(()=>{
        console.log("useeffect called")
        selecteditems.map((item)=>(
            console.log(item.change)
        ))
    },[selecteditems])
    let flag=0;
    const HandleClick=(item:number)=>{
        for(let i in selecteditems){
            if(selecteditems[+i].list.first===details[item].list.first){
                setSelecteditems([...selecteditems.slice(0,+i),...selecteditems.slice((+i)+1)])
                flag=1;
                break;
            }
        }
        if(flag===0){
            setSelecteditems([...selecteditems,details[item]])
        }
    }
  return (<>
    <TableContainer sx={{width:700,height:700}}>
        <Table>
            <TableHead>
                <TableRow>
                    <TableCell>Name</TableCell>
                    <TableCell>Price</TableCell>
                    <TableCell>Change</TableCell>
                    <TableCell>Marker</TableCell>
                    <TableCell>Watch</TableCell>
                </TableRow>

            </TableHead>
            <TableBody>
                
                    {details.map((detail)=>
                        (<TableRow key={detail.icon}>
                            <TableCell>
                            <Stack spacing={2} direction="row">
                                <MuiIcon link={detail.icon}/>
                                <Stack direction="column">
                                    <MuiTypography v="subtitle2">{detail.list.first}</MuiTypography>
                                    <MuiTypography v="body2">{detail.list.second}</MuiTypography>
                                </Stack>
                            </Stack>
                        </TableCell>
                        <TableCell>
                            <MuiTypography v="subtitle1">{detail.price}</MuiTypography>
                        </TableCell>
                        <TableCell>
                            <MuiTypography v="subtitle1">{detail.change}</MuiTypography>
                        </TableCell>
                        <TableCell>
                            <MuiTypography v="subtitle1">{detail.markercap}</MuiTypography>
                        </TableCell>
                        <TableCell>
                            <IconButton sx={{color:"blue"}} onClick={()=>HandleClick(details.indexOf(detail))}>{<Staricon/>}</IconButton>
                        </TableCell>
                        </TableRow> ))}
            </TableBody>
        </Table>
    </TableContainer>


    {/* <Stack spacing={5} direction="row" sx={{width:800}}>
        <Grid container>
            <Grid item>
                <MuiIcon link={details[0].icon}/>
            </Grid>
            <Grid item>
                <MuiTypography v="subtitle1">{details[0].list.first}</MuiTypography>
                <MuiTypography v="subtitle2">{details[0].list.second}</MuiTypography>
            </Grid>
            <Grid item>
                <MuiTypography v="subtitle1">{details[0].price}</MuiTypography>
            </Grid>
            <Grid item>
                <MuiTypography v="subtitle1">{details[0].change}</MuiTypography>
            </Grid>
            <Grid item>
                <MuiTypography v="subtitle1">{details[0].markercap}</MuiTypography>
            </Grid>
            <Grid item>
                <Button>{details[0].watch}</Button>
            </Grid>
        </Grid>
    </Stack> */}
    </>
  )
}

export default Sampl1