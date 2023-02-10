import React from 'react'
import { Avatar } from '@mui/material'
interface Images{
    link:string,
}
const MuiIcon = (a:Images) => {
  return (
    <Avatar src={a.link} sx={{width:40,height:40}}/>
  )
}

export default MuiIcon