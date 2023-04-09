public interface InterfaceDemo {
    String userName="gayathri";
    public int a=10;
    int year=4;
    public void getDetails();
    static void staticMethod(){
        System.out.println("static method in interface");
    }
    default void printDetails(){
        System.out.println("user Name"+userName);
        System.out.println("year"+year);
    }
}

