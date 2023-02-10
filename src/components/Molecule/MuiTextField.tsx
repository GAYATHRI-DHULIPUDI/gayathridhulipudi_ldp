import React from 'react'
import {Input,InputAdornment,Paper,TextField} from '@mui/material'
import SearchIcon from '@mui/icons-material/Search';
const MuiTextField = () => {
  return (<>
    <Paper elevation={2} sx={{width:200}}><Input disableUnderline={true} placeholder='Search all assets' endAdornment={<InputAdornment position="start"><SearchIcon/></InputAdornment>}></Input></Paper>
    </>
  )
}

export default MuiTextField