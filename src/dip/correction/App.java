package dip.correction;

public class App {
    BuyCourse buy;
    App(BuyCourse buy){
        this.buy=buy;
    }
    public void buyCourse(){
        buy.purchaseCourse();
    }

    public static void main(String[] args) {
        App myapp=new App(new BuyCart());
        myapp.buyCourse();
    }
}
