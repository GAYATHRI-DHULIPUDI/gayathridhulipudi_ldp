package isp.violation;

public class Paytm implements Payment{
    @Override
    public void payAmount() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackAsCreditBalance() {
// this method is not applicable for paytm it violates isp.
    }
}
