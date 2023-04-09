class BankDetails{
    private double balance=200000.00;
    private String user="gayathri";
    private String pwd="password";
    public double getBalance(String user,String pwd){
        if(this.user.equals(user) && this.pwd.equals(pwd)) {
            System.out.println(this.user);
            return balance;
        }
        return 0.00;
    }
}

public class DataHiding {
    public static void main(String[] args) {
        BankDetails obj=new BankDetails();
        System.out.println(obj.getBalance("gayathriii","password"));
    }
}
