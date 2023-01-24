import MuiGrid2 from '.';
import { ComponentStory, ComponentMeta } from '@storybook/react';
export default{
    title:"Molecule/Grid2",
    component:MuiGrid2
} as ComponentMeta<typeof MuiGrid2>;
const Template: ComponentStory<typeof MuiGrid2>= () => <MuiGrid2/>
export const Primary = Template.bind({});