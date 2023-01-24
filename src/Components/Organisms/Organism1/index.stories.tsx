import { ComponentStory, ComponentMeta } from '@storybook/react';
import MuiOrganism from '.';
export default{
    title:"Organism/organism1",
    component:MuiOrganism
} as ComponentMeta<typeof MuiOrganism>;
const Template: ComponentStory<typeof MuiOrganism>= () => <MuiOrganism/>
export const Primary = Template.bind({});