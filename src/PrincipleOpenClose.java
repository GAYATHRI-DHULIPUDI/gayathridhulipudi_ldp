class Calculate{
    Object operation;
    Calculate(Object obj){
        this.operation=obj;
    }
    public void calculate(){
        if(operation instanceof Add){
            Add add=(Add) operation;
            System.out.println("Addition of "+add.firstNumber+" "+add.secondNumber+" is "+(add.firstNumber+add.secondNumber));
        }
        if(operation instanceof Subtract){
            Subtract subtract=(Subtract) operation;
            System.out.println("Subtraction of "+subtract.firstNumber+" "+subtract.secondNumber+" is "+(subtract.firstNumber-subtract.secondNumber));
        }
    }
}
class Add{
    int firstNumber,secondNumber;
    Add(int firstNum,int secondNum){
        this.firstNumber=firstNum;
        this.secondNumber=secondNum;
    }
}
class Subtract{
    int firstNumber,secondNumber;
    Subtract(int firstNum,int secondNum){
        this.firstNumber=firstNum;
        this.secondNumber=secondNum;
    }
}
//abstract class Calculate{
//    public abstract void calculate();
//}
//class Add extends Calculate{
//    int firstNumber,secondNumber;
//    Add(int numOne,int numTwo){
//        this.firstNumber=numOne;
//        this.secondNumber=numTwo;
//    }
//
//    @Override
//    public void calculate() {
//        System.out.println("addition of "+firstNumber+" "+secondNumber+" is "+(firstNumber+secondNumber));
//    }
//}
//class Subtract extends Calculate{
//    int firstNumber,secondNumber;
//    Subtract(int numOne,int numTwo){
//        this.firstNumber=numOne;
//        this.secondNumber=numTwo;
//    }
//
//    @Override
//    public void calculate() {
//        System.out.println("subtraction of "+firstNumber+" "+secondNumber+" is "+(firstNumber-secondNumber));
//    }
//}
//class Calculator{
//    public void calculate(Calculate clac){
//        clac.calculate();
//    }
//}
public class PrincipleOpenClose {
    public static void main(String[] args) {
//        Calculator calc=new Calculator();
//        calc.calculate(new Add(10,20));
        Calculate cal=new Calculate(new Subtract(10,20));
        cal.calculate();
    }
}
