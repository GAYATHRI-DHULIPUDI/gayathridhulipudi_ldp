import RandomTypo from ".";
import { ComponentStory, ComponentMeta } from '@storybook/react';
export default{
    title:"Atom/Typo",
    component:RandomTypo
} as ComponentMeta<typeof RandomTypo>;
const Template: ComponentStory<typeof RandomTypo>= (args) => <RandomTypo {...args}/>;

export const Primary = Template.bind({});
Primary.args={
    v:"body1",
    children:"welcome to storybook",
    className:"green"
}