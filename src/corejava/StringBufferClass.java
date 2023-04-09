package corejava;
public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("hai");
        s.append("hello");
        System.out.println(s.insert(1,'A'));
        s.setCharAt(1,'a');
        System.out.println(s);
        System.out.println(s.reverse());
        System.out.println(s.delete(1,4));
    }
}
