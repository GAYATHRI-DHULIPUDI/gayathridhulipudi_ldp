import React from 'react'
import {MenuItem,Paper,TextField,Typography } from '@mui/material'
const MuiDropdown = () => {
  return (
    <Paper sx={{width:50}} elevation={2}>
        <TextField select variant='standard' defaultValue="24h">
            <MenuItem value="24h">24h</MenuItem>
        </TextField>
    </Paper>
  )
}

export default MuiDropdown