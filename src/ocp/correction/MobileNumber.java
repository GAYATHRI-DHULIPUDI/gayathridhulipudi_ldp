package ocp.correction;

public class MobileNumber implements LoginValidation{
    int mobileNumber;
    String pwd;
    MobileNumber(int mobileNumber,String pwd){
        this.mobileNumber=mobileNumber;
        this.pwd=pwd;
    }

    @Override
    public void validate() {
        // code for validation through mobile
    }
}
