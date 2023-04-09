package assignments.assignment7.five;
class One{
    class First{
        String message;
        First(String s){
            this.message=s;
        }
        public void show(){
            System.out.println(message);
        }
    }
}
class Second{
    class Two extends One.First{
        String message;
        Two(One one,String msg,String msg2){
            one.super(msg2);
            this.message=msg;
        }
        public void show2(){
            System.out.println(message);
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        One one=new One();
        One.First first=one.new First("inner class");
        Second second=new Second();
        Second.Two two=second.new Two(one,"inner class","second inner class");
        two.show2();
        two.show();



    }
}
