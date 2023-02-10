import React,{useEffect,useState} from 'react'
import details from './data';
import { Stack,TableContainer,Table,TableHead,TableBody,TableCell,TableRow, colors} from '@mui/material';
import StarBorderIcon from '@mui/icons-material/StarBorder';
import StarRateIcon from '@mui/icons-material/StarRate';
import MuiIcon from '../Atom/MuiIcon';
import IconButton from '@mui/material/IconButton';
import MuiTypography from '../Atom/MuiTypography';
const WatchList = () => {
    const [active,setActive]=useState(false)
    const handleClick=(ele:typeof details[0])=>{
        ele.state=!(ele.state)
        setActive(!active)
    }
  return (
    <TableContainer sx={{height:700}}>
    <Table>
        <TableHead>
            <TableRow>
                <TableCell>Name</TableCell>
                <TableCell>Price</TableCell>
                <TableCell>Change</TableCell>
                <TableCell>Marker</TableCell>
                <TableCell>Watch</TableCell>
            </TableRow>

        </TableHead>
        <TableBody>
            
                {details.map((detail)=>
                    (detail.state&&
                    <TableRow key={detail.icon}>
                        <TableCell>
                            <Stack spacing={2} direction="row">
                                <MuiIcon link={detail.icon}/>
                                <Stack direction="column">
                                <MuiTypography v="subtitle2">{detail.list.first}</MuiTypography>
                                <MuiTypography v="body2">{detail.list.second}</MuiTypography>
                            </Stack>
                        </Stack>
                    </TableCell>
                    <TableCell>
                        <MuiTypography v="subtitle1">{detail.price}</MuiTypography>
                    </TableCell>
                    <TableCell>
                        <MuiTypography v="subtitle1">{detail.change}</MuiTypography>
                    </TableCell>
                    <TableCell>
                        <MuiTypography v="subtitle1">{detail.markercap}</MuiTypography>
                    </TableCell>
                    <TableCell>
                        <IconButton onClick={()=>handleClick(detail)}>{<StarRateIcon color='info'/>}</IconButton>
                    </TableCell>
                    </TableRow>
                    ))
                }
        </TableBody>
    </Table>
</TableContainer>

  )
}

export default WatchList;