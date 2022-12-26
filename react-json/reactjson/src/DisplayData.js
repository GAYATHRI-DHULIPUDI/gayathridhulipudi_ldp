import React,{useEffect, useState} from 'react'
import axios from 'axios'
import { Card, Typography,Grid } from '@mui/material'
// npx json-server --watch data/database.json
const DisplayData =() => {
    const [data,setData]=useState([])
    useEffect(()=>{
      const Update=async ()=>{
          const getData=await axios.get("http://localhost:8000/data")
          setData(getData.data)
        }
        Update()
      },[])
  return (
    <div>
        <Card sx={{width:500,height:400}}>
          <Grid container alignItems="flex-start" justifyContent="flex-start" marginTop="100px">
          <Grid item>
        {data.length>0?<><Typography variant='h6'>Name : {data[data.length-1].name}</Typography>
        <Typography variant="h6">Phone : {data[data.length-1].phone}</Typography>
        <Typography variant="h6">Email : {data[data.length-1].email}</Typography>
        <Typography variant="h6">Gender : {data[data.length-1].gender}</Typography></>:<></>
        }
        </Grid>
        </Grid>
        </Card>
    </div>
  )
}

export default DisplayData