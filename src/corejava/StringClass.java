package corejava;
class StringExample{
    String one="hello";
    String obj=new String("hai");
    char s[]={'a','b','c'};
    public void upperCase(String s){
        System.out.println(s.toUpperCase());
    }
    public void lowerCase(String s){
        System.out.println(s.toLowerCase());
    }
    public void replace(String s,String oldString,String newString){
        System.out.println(s.replace(oldString,newString));
    }
    public void trim(String s){
        System.out.println(s.trim());
    }
    public void equals(String s,String m){
        System.out.println(s.equals(m));
    }
    public void equalsIgnoreCase(String s,String m){
        System.out.println(s.equalsIgnoreCase(m));
    }
    public void compareTo(String s,String m){
        System.out.println(s.compareTo(m));
    }
    public void compareToIgnoreCase(String s,String m){
        System.out.println(s.compareToIgnoreCase(m));
    }
}

public class StringClass {
    public static void main(String[] args) {
        StringExample obj=new StringExample();
        System.out.println(obj.one.substring(2));
        obj.replace("hai","H","H");
    }
}
