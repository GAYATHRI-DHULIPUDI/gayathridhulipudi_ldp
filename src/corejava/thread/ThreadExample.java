package corejava.thread;
//thread is a lightweight process . which is used for multitasking .
//threads can be created in two ways 1. extending thread class 2. implementing runnable interface
class A extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            if(i==2){
                Thread.yield();
            }
            System.out.println("A Thread :"+i);
        }

    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            if(i==3){
                try{
                    sleep(500);
                }
                catch (Exception e){
                    System.out.println(e);
                }
            }
            System.out.println("B Thread :"+i);
        }
    }
}
//using runnable interface
class C implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("C thread : "+i);
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();
        Thread t=new Thread(c);//pass obj to thread default constructor
        t.start();
        a.start();
        b.start();
    }

}
//        A Thread :0
//        A Thread :1
//        B Thread :0
//        B Thread :1
//        B Thread :2
//        C thread : 0
//        C thread : 1
//        C thread : 2
//        C thread : 3
//        C thread : 4
//        A Thread :2
//        A Thread :3
//        A Thread :4
//        A Thread :5
//        A Thread :6
//        A Thread :7
//        A Thread :8
//        A Thread :9
//        B Thread :3
//        B Thread :4