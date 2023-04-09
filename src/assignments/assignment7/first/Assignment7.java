package assignments.assignment7.first;
abstract class Rodents{
    public abstract void behaviour();
}
class Mouse extends Rodents{
    Mouse(){
        System.out.println("Mouse constructor");
    }

    @Override
    public void behaviour() {
        System.out.println("Mouse class");
    }
}
class Gerbil extends Rodents{
    Gerbil(){
        System.out.println("Gerbil constructor");
    }

    @Override
    public void behaviour() {
        System.out.println("Gerbil class");
    }
}
class Hamster extends Rodents{
    Hamster(){
        System.out.println("Hamster constructor");
    }

    @Override
    public void behaviour() {
        System.out.println("Hamster class");
    }
}
public class Assignment7 {
    public static void main(String[] args) {
        Rodents[] rodent= {new Mouse(),new Gerbil(),new Hamster()};
        for(Rodents rodents:rodent){
            rodents.behaviour();
        }
    }
}
