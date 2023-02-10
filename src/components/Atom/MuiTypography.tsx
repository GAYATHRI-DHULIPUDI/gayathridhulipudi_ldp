import React from 'react'
import { Typography } from '@mui/material'
interface Typo{
    children:string,
    v:"h3"|"h4"|"h6"|"subtitle1"|"subtitle2"|"body1"|"body2",
}
const MuiTypography = (a:Typo) => {
  return (
    <Typography variant={a.v} style={a.children.charAt(0)==='+'?{color:"green"}:a.children.charAt(0)==='-'?{color:"red"}:{color:"black"}}>{a.children}</Typography>
  )
}

export default MuiTypography