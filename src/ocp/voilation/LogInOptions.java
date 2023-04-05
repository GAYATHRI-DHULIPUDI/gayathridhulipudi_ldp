package ocp.voilation;
class Email{
    String userName;
    String pwd;
    Email(String user,String pwd){
        this.userName=user;
        this.pwd=pwd;
    }
}
class MobileNumber{
    int mobileNumber;
    String pwd;
    MobileNumber(int mobileNumber,String pwd){
        this.mobileNumber=mobileNumber;
        this.pwd=pwd;
    }
}
public class LogInOptions {
    Object validate;
    public void validateUser(Object validate){
        if(validate instanceof Email){
            //code for validating through email
        }
        if(validate instanceof MobileNumber){
            //code for validating through mobile
        }
    }
}
// here in the above if we want to add new login option we need to modify the class and test overall function which is time taking.
