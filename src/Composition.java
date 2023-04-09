class Kitchen{
    public String Food;
    Kitchen(String food){
        this.Food=food;
    }
    public String getFood(){
        return this.Food;
    }
}
 class House{
    Kitchen kitchen;
    House(String food){
        kitchen=new Kitchen(food);
    }
    public String getFood(){
        return kitchen.getFood();
    }
}
public class Composition {
    public static void main(String[] args) {
        House house=new House("pizza");
        System.out.println(house.getFood());
    }
}
