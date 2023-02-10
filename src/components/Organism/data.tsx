import image1 from "../Resources/bitcoin-coin.png"
import image2 from "../Resources/etherum.png"
import image3 from "../Resources/etherum2.jpg"
import image4 from "../Resources/tether.png"
import image5 from "../Resources/image5.png"
import image6 from "../Resources/image6.png"
import image7 from "../Resources/image7.png"
import image8 from "../Resources/image8.png"
import image9 from "../Resources/image9.png"
export type DetailedType={
    icon:string,
    list:{first:string,second:string},
    price:string,
    change:string,
    markercap:string,
    state:boolean,
}
const details:DetailedType[]=[
    {icon:image1,list:{first:"Bitcoin",second:"BTC"},price:"$3,285,553.73",change:"+1.06%",markercap:"$60.1T",state:false},
    {icon:image2,list:{first:"Ethereum",second:"ETH"},price:"$216,678.10",change:"-5.49%",markercap:"$25.4T",state:false},
    {icon:image3,list:{first:"Ethereum 2",second:"ETH2"},price:"$216,678.10",change:"-5.49%",markercap:"$25.4T",state:false},
    {icon:image4,list:{first:"Tether",second:"USDT"},price:"$74.31",change:"+0.11%",markercap:"$4.6T",state:false},
    {icon:image5,list:{first:"Bitcoin Coin",second:"BNB"},price:"$24,942.54",change:"-3.69%",markercap:"$4.2T",state:false},
    {icon:image6,list:{first:"Cardano",second:"ADA"},price:"$104.52",change:"-1.82%",markercap:"$3.4T",state:false},
    {icon:image7,list:{first:"XRP",second:"XRP"},price:"$57.21",change:"+1.11%",markercap:"$2.7T",state:false},
    {icon:image8,list:{first:"Dodge Coin",second:"XRP"},price:"$17.64",change:"-6.96%",markercap:"$2.3T",state:false},
    {icon:image9,list:{first:"USD Coin",second:"XRP"},price:"$74.26",change:"+1.01%",markercap:"$2.1T",state:false},
]
export default details;