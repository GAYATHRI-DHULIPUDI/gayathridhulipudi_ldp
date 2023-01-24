import MuiGrid from '.';
import { ComponentStory, ComponentMeta } from '@storybook/react';
export default{
    title:"Molecule/Grid1",
    component:MuiGrid
} as ComponentMeta<typeof MuiGrid>;
const Template: ComponentStory<typeof MuiGrid>= () => <MuiGrid/>
export const Primary = Template.bind({});
