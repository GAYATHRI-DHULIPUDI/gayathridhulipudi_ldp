package assignments.assignment4;

import java.util.Calendar;
import java.util.*;
//------------------------------
class Assignment {
    public static String DateFormatter(Date d){
        String date=String.format("%02d",d.getDate());
        String  month=String.format("%02d",d.getMonth()+1);
        int year=d.getYear()+1900;
        return date+"-"+month+"-"+year;
    }
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        Scanner sc=new Scanner(System.in);
        int numberOfTimes=sc.nextInt();
        sc.nextLine();
        while(numberOfTimes>0){
            numberOfTimes--;

            String[] s=sc.nextLine().split(" ");
            String signUpDate=s[0];
            String currentDate=s[1];
            String[] signUpArr=signUpDate.split("-");
            String[] currentDateArr=currentDate.split("-");
            cal.set(Calendar.DATE,Integer.parseInt(signUpArr[0]));
            cal.set(Calendar.MONTH,Integer.parseInt(signUpArr[1])-1);
            cal.set(Calendar.YEAR,Integer.parseInt(signUpArr[2]));
            Date anniversary=cal.getTime();
            cal.setTimeInMillis(System.currentTimeMillis());
            cal.set(Calendar.DATE,Integer.parseInt(currentDateArr[0]));
            cal.set(Calendar.MONTH,Integer.parseInt(currentDateArr[1])-1);
            cal.set(Calendar.YEAR,Integer.parseInt(currentDateArr[2]));
            Date current=cal.getTime();
            if(current.before(anniversary)){
                System.out.println("No Range");
            }
            else {
                int years = cal.get(Calendar.YEAR) - Integer.parseInt(signUpArr[2]);
                cal.setTimeInMillis(anniversary.getTime());
                cal.add(Calendar.YEAR, years);
                cal.add(Calendar.DATE, -30);
                Date start = cal.getTime();
                cal.add(Calendar.DATE, 60);
                Date end = cal.getTime();
                if (end.after(current)) {
                    System.out.println(DateFormatter(start) + " " + DateFormatter(current));
                } else {
                    System.out.println(DateFormatter(start) + " " + DateFormatter(end));
                }
            }
        }

    }
}

//        5
//        16-07-1998 27-06-2017
//output       16-06-2017 27-06-2017
//        04-02-2016 04-04-2017
//output        05-01-2017 06-03-2017
//        04-05-2017 04-04-2017
//output        No Range
//        04-04-2015 04-04-2016
//output        05-03-2016 04-04-2016
//        04-04-2015 15-03-2016
//output        05-03-2016 15-03-2016