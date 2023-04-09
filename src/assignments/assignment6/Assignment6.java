package assignments.assignment6;

class OverloadConstructor{
    String first,second;
    OverloadConstructor(String first){
        this(first,"yes");
    }

    public OverloadConstructor(String first, String yes) {
        this.first=first;
        this.second=second;
    }
}
class Third{
    Third(String msg){
        System.out.println("message "+msg);
    }
}

class Vampire{
    int c=0;
    public boolean CountRun(long n){
        long len=(int)Math.log10(n)+1;
        long a=(int)Math.pow(10,(len/2)-1);
        long b=(int)Math.pow(10,(len/2));
        for(long i=a;i<b-1;i++){
            if(n%i==0){
                long j=n/i;
                if(j<(long)Math.pow(10,len/2)){
                    if(i%10!=0 || j%10!=0){
                        boolean f=isVampire(i*b+j,n);
                        if(f==true){
//                            System.out.println(n);
//                            System.out.println(i+" "+j);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    public boolean isVampire(long num,long n){

        for(long k=n;k>0;k=k/10){
            int count1=0,count2=0;
            for(long original=n;original>0;original=original/10){
                if(k%10==original%10){
                    count1++;
                }
            }
            for(long vampire=num;vampire>0;vampire=vampire/10){
                if(k%10==vampire%10){
                    count2++;
                }
            }
            if(count1!=count2)
                return false;
        }
        return true;
    }
}

public class Assignment6 {
    public static void main(String[] args) {
//        Vampire v=new Vampire();
//        int c=0;
//        for(long i=1000;;i++) {
//            if (c < 100) {
//                if (v.CountRun(i)) {
//                    c++;
//                    System.out.print(i + "  ");
//                }
//            } else {
//                break;
//            }
//        }
        Third three[]=new Third[2];// doesn't print anything
        three[0]=new Third("first object");
        three[1]=new Third("second object");
    }
}
