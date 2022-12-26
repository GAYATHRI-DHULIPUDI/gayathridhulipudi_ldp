import React,{useState} from 'react'
import { FormControl, InputLabel,Input, Button,Card,Box,RadioGroup,FormControlLabel,Radio,Checkbox} from '@mui/material'
import axios from "axios"
import { flexbox } from '@mui/system'
import {useNavigate } from 'react-router-dom'
const Form = () => {
  const navigate=useNavigate()
  const [data,setData]=useState({
    name:"",
    phone:"",
    email:"",
    gender:"",
    skills:[],
    password:"",
    confirmpassword:"",
  })
  const HandleChange=async (e)=>{
    if(e.target.name==="skills"){
      // data.skills.push(e.target.value)
      if(data.skills.includes(e.target.value)){
        data.skills.splice(data.skills.indexOf(e.target.value),1)
        console.log(data.skills)
      }
      else{
        data.skills.push(e.target.value)
        setData({...data,[e.target.name]:data.skills})
        console.log(data.skills)
      }
    }
    else{
      setData({...data,[e.target.name]:e.target.value})
    }
  }
  const handlesubmit=()=>{
    if(data.password!==data.confirmpassword){
      alert("Password and confirm password doesn't match")
    }
    else{
      alert("success")
      axios.post(" http://localhost:8000/data",data);
      navigate("/login")
      // const id=c.data[-1]
      // console.log(id)
      // const b=axios.get("http://localhost:8000/data/id")
      // console.log(b)
    }
  }
  return (
    <Box>
        <Card sx={{width:400,mt:15,ml:20}}>
              <InputLabel>Name</InputLabel>
              <Input name="name" value={data.name} onChange={(e)=>HandleChange(e)} required type="text"/>
              <InputLabel>Phone</InputLabel>&nbsp;
              <Input name="phone" value={data.phone} onChange={(e)=>HandleChange(e)} required type="phone"/>
              <InputLabel>Email</InputLabel>&nbsp;
              <Input name="email" value={data.email}  onChange={(e)=>HandleChange(e)} required type="email"/>
              <RadioGroup onChange={(e)=>HandleChange(e)} sx={{display:flexbox,flexDirection:'row',justifyContent:'center'}}>
                <FormControlLabel value="female" name="gender" control={<Radio/>} label="Female"></FormControlLabel>
                <FormControlLabel value="male" name="gender" control={<Radio/>} label="Male"></FormControlLabel>
              </RadioGroup>
              <FormControl sx={{display:flexbox,flexDirection:'row',justifyContent:'center'}} onChange={(e)=>HandleChange(e)}>
                <FormControlLabel value="html" name="skills" control={<Checkbox/>} label="HTML" ></FormControlLabel>
                <FormControlLabel value="css" name="skills" control={<Checkbox/>} label="CSS" ></FormControlLabel>
                <FormControlLabel value="javascript" name="skills" control={<Checkbox/>} label="javascript" ></FormControlLabel>
              </FormControl>
              <InputLabel>Password</InputLabel>
              <Input name="password" value={data.password} onChange={(e)=>HandleChange(e)} required type="password"/>
              <InputLabel>Confirm Password</InputLabel>&nbsp;
              <Input name="confirmpassword" value={data.confirmpassword} onChange={(e)=>HandleChange(e)} required type="password"/><br/>
              <Button onClick={handlesubmit} type="submit">Submit</Button>
        </Card>
    </Box>
  )
}

export default Form