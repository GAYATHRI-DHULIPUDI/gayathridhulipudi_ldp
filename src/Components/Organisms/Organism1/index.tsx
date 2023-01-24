import React from 'react'
import MuiGrid from '../../Molecules/Molecule1'
import MuiGrid2 from '../../Molecules/Molecule2'
import MuiIcon from '../../Atoms/Icon'
import {Grid } from '@mui/material'
const MuiOrganism = () => {
  return (
        <Grid container >
            <Grid item>
                <MuiIcon></MuiIcon>
            </Grid>
            <Grid item>
                <MuiGrid></MuiGrid>
            </Grid>
            <Grid item>
                <MuiGrid2></MuiGrid2>
            </Grid>
        </Grid>
  )
}

export default MuiOrganism