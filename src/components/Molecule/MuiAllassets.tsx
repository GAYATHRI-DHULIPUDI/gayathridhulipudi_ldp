import React from 'react'
import {MenuItem,Paper,TextField,Typography } from '@mui/material'
const MuiAllassets = () => {
  return (
    <Paper sx={{width:100}} elevation={2}>
    <TextField select variant='standard' defaultValue="All Assets">
        <MenuItem value="All Assets">All Assets</MenuItem>
    </TextField>
</Paper>
  )
}

export default MuiAllassets