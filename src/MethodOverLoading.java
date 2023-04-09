class ParentAddition{

    public void sum(int a,int b) {
        System.out.println("sum of 2 is :" + a + b);
    }
    public void sum(char a,char b){
        System.out.println("sum of 2 is :"+(a+b));
    }
    public void sum(double a,double b){
        System.out.println("sum of 2 in double :"+(a+b));
    }
//    public void sum(float a,float b){
//        System.out.println("sum of 2 in float :"+(a+b));
//    }
}

public class MethodOverLoading {
    public static void main(String[] args) {
        ParentAddition p=new ParentAddition();
        p.sum(1.0f,1);
    }
}
