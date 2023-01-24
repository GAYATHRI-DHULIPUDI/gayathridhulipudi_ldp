import React from 'react'
import {Grid} from '@mui/material'
import RandomTypo from '../../Atoms/Typo'
const MuiGrid = () => {
  return (
    <Grid container sx={{pl:"10px"}}>
        <Grid item>
          <RandomTypo v="subtitle1">Bitcoin</RandomTypo>
          <RandomTypo v="body2" className='gray'>BTC</RandomTypo>
        </Grid>
    </Grid>
  )
}

export default MuiGrid