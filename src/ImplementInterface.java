public class ImplementInterface implements InterfaceDemo{
        @Override
        public void getDetails() {
            System.out.println("user in child class "+userName);
        }

    public static void main(String[] args) {
        ImplementInterface imp=new ImplementInterface();
        imp.printDetails();
        System.out.println(imp.a);
        InterfaceDemo.staticMethod();
    }
}
