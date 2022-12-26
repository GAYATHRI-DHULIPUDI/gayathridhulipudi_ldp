import React,{useEffect,useState} from 'react'
import {Table,TableBody,TableCell,TableHead, TableRow} from '@mui/material'
import axios from "axios"
const First = () => {
    const [data,setData]=useState([])
    useEffect(()=>{
        axios.get("http://localhost:4000/data",{params:{_limit:2}}).then(res=>setData(res.data))
        // axios.patch("http://localhost:3000/data/3",{"name":"gayathri"}).then(res=>setData(res.data))
        // .catch(err=>console.log(err))

    },[])
  return (
    <div>
        <Table>
            <TableHead>
                <TableRow>
                    <TableCell>ID</TableCell>
                    <TableCell>Name</TableCell>
                </TableRow>
            </TableHead>
            <TableBody>
                {
                    data.map((item)=>(
                        <TableRow key={item.id}>
                            <TableCell>{item.id}</TableCell>
                            <TableCell>{item.name}</TableCell>
                        </TableRow>
                    ))
                }
            </TableBody>
        </Table>
    </div>
  )
}

export default First