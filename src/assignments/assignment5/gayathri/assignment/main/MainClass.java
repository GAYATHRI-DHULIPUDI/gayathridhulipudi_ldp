package assignments.assignment5.gayathri.assignment.main;

import assignments.assignment5.gayathri.assignment.data.First;
import assignments.assignment5.gayathri.assignment.singleton.Second;

public class MainClass {
    public static void main(String[] args) {
        First firstObject=new First();
        firstObject.printVariables();
        firstObject.printLocalVariables();
        Second secondObject=Second.initalize("yes");
        secondObject.printString();
    }
}
