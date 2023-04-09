package assignments.assignment7.second;

public class Cycle {
}
class Bicycle extends Cycle{
    public void balance(){
        System.out.println("bicycle method");
    }
}
class Unicycle extends Cycle{
public void balance(){
    System.out.println("unicycle method");
}
}
class Tricycle extends Cycle{

}
class MainClass{
    public static void main(String[] args) {
        Cycle[] cycle=new Cycle[3];
        Cycle c1=new Bicycle();
        Cycle c2=new Unicycle();
        Cycle c3=new Tricycle();
        cycle[0]=c1;
        cycle[1]=c2;
        cycle[2]=c3;
//        for(Cycle c:cycle){
//            if(c instanceof Bicycle || c instanceof Unicycle){
//                c.balance();
//            }
//        }
        Cycle c=new Bicycle();
//        BiCycle b=new Cycle();
        Bicycle b=(Bicycle) c;
        b.balance();

    }
}
