
class Fan{
    public boolean isOn;
    public static int StaticVar;
    public Fan(boolean isOn) {
        this.isOn = isOn;
    }

    public void turnOn(){
        isOn=true;
        StaticVar=20;
        System.out.println(StaticVar+"....");
        System.out.println("fan is spinning");
    }
    public void turnOff(){
        isOn=false;
        System.out.println("fan is stop");
    }
}
class Addition {
    public static int value=10;
    public static int get(){
        value=20;
        return value;
    }
}
class Substraction{
    public void subtarct(int a,int b){
        System.out.println(a-b);
    }
}
public class Basic {
    public static void main(String[] args) {
        System.out.println(Fan.StaticVar);
        Fan fan1=new Fan(false);
        fan1.turnOn();
        fan1.turnOff();
        System.out.println(Fan.StaticVar);//static variable can only be used by class
       // Fan.StaticVar=20;
        fan1.turnOn();
        System.out.println("Addition class has get value"+Addition.value);
        int getValue=Addition.get();
        System.out.println("get value is "+getValue);
    }
}
