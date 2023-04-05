package ocp.correction;

public class Email implements LoginValidation {
    String userName;
    String pwd;
    Email(String user, String pwd){
        this.userName=user;
        this.pwd=pwd;
    }

    @Override
    public void validate() {
        // code for validation
    }
}
