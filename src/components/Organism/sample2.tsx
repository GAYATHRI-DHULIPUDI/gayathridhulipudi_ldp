import React,{useState} from 'react'
import Createtable from './createtable'
import WatchList from './Watchlist'
import MuiAllassets from '../Molecule/MuiAllassets'
import MuiDropdown from '../Molecule/MuiDropdown'
import MuiTextField from '../Molecule/MuiTextField'
import {Box,Typography,Toolbar,Button,InputAdornment,Stack} from '@mui/material'
const Sample2 = () => {
  const [active,setActive]=useState("all")
  return (
    <div>
    <Toolbar>
        <Stack spacing={90} direction="row">
          <Stack direction="row">
          <Button variant='text' onClick={()=>setActive("all")} disableRipple>All Assets</Button> 
          <Button variant='text' onClick={()=>setActive("watch")} disableRipple>WatchList</Button> 
          </Stack>
          <Stack spacing={2} direction="row">
            <MuiTextField/>
            <MuiDropdown/>
            <MuiAllassets/>
          </Stack>
        </Stack>
    </Toolbar>
    <div>
      {active==="all" && <Createtable/>}
      {active==="watch" && <WatchList/>}
    </div>
    </div>
  )
}
export default Sample2