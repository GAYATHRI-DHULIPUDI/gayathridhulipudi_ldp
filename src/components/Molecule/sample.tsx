import React from 'react'
import MuiTypography from '../Atom/MuiTypography'
import image from "../AllImages/bitcoin.png"
import MuiIcon from '../Atom/MuiIcon'
import { Stack } from '@mui/material'
const Sample = () => {
  return (
    <Stack spacing={2} direction="row">
        <MuiTypography v="h6">Bitcoin</MuiTypography>
        <MuiIcon link={image}/>
    </Stack>
  )
}

export default Sample