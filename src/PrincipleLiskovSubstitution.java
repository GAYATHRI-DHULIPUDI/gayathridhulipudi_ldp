//class Bird{
//    public void fly(){
//        System.out.println("i'm flying");
//    }
//}
//class Sparrow extends Bird{
//
//}
//class Ostrich extends Bird{
//
//}
class Bird{
    public void info(){
        System.out.println("I'm a bird");
    }
}
class FlyingBird extends Bird{
    public void fly(){
        System.out.println("I'm flying");
    }
}
class Sparrow extends FlyingBird{}
class Ostrich extends Bird{}
public class PrincipleLiskovSubstitution {
    public static void main(String[] args) {
        Ostrich ost=new Ostrich();
        ost.info();
        Sparrow sp=new Sparrow();
        sp.info();
        sp.fly();
    }
}
