//interface Worker{
//    public void work();
//    public void sleep();
//}
//class Human implements Worker{
//
//    @Override
//    public void work() {
//        System.out.println("At work");
//    }
//
//    @Override
//    public void sleep() {
//        System.out.println("Sleeping");
//    }
//}
//class Robot implements Worker{
//
//    @Override
//    public void work() {
//        System.out.println("At work");
//    }
//
//    @Override
//    public void sleep() {
//        System.out.println("Sleeping");
//    }
//}
interface Worker{
    public void work();
}
interface Sleep{
    public void sleep();
}
class Human implements Worker,Sleep{

    @Override
    public void work() {
        System.out.println("working");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }
}
class Robot implements Worker{

    @Override
    public void work() {
        System.out.println("working");
    }
}
public class PrincipleInterfaceSeggregation {
    public static void main(String[] args) {
        Human human=new Human();
        human.sleep();
        Robot robot=new Robot();
        robot.work();
    }

}
