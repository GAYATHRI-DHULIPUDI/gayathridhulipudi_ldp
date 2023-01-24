import React from 'react'
import { Typography } from '@mui/material'
import './index.css'
interface Props{
    v:"h3"|"h4"|"h5"|"h6"|"body1"|"subtitle1"|"body2",
    children:string,
    className?:string
}
const RandomTypo = (a:Props) => {
  return (
    <Typography variant={a.v} className={a.className}>{a.children}</Typography>
  )
}

export default RandomTypo;