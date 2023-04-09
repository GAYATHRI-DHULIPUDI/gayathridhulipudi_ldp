package assignments.assignment3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Assignment {
    public void pingHost(String Address)
                throws UnknownHostException, IOException
    {
        long end = 0;
        long start = new GregorianCalendar().getTimeInMillis();
        InetAddress geek = InetAddress.getByName(Address);
        if (geek.isReachable(5000)) {
            end = new GregorianCalendar().getTimeInMillis();
            System.out.println("Host is reachable "+"in "+(end-start)/2+"ms(median)");
        }
        else {
            System.out.println("host is unreachable");
        }
    }
    public static void main(String[] args)throws UnknownHostException, IOException {
        Scanner inputIp = new Scanner(System.in);
        String ipAddress = inputIp.nextLine();
        Assignment obj = new Assignment();
        obj.pingHost(ipAddress);
        //124.6.7.2 not reachable
        //127.0.0.1 reachable
    }
}
