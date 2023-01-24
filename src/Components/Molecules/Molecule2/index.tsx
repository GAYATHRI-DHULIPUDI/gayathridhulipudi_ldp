import React from 'react'
import {Grid} from '@mui/material'
import RandomTypo from '../../Atoms/Typo'
const MuiGrid2 = () => {
  return (
    <Grid container sx={{pl:"40px"}}>
        <Grid item>
          <RandomTypo v="subtitle1">$ 0.00</RandomTypo>
          <RandomTypo v="body2" className='green'>+0.00%</RandomTypo>
        </Grid>
    </Grid>
  )
}

export default MuiGrid2