import MuiIcon from '.';
import { ComponentStory, ComponentMeta } from '@storybook/react';
export default{
    title:"Atom/Icon",
    component:MuiIcon
} as ComponentMeta<typeof MuiIcon>;
const Template: ComponentStory<typeof MuiIcon>= () => <MuiIcon/>;

export const Primary = Template.bind({});