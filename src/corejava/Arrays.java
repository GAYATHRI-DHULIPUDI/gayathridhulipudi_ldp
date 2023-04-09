package corejava;

import java.util.Scanner;
class TwoDimensionalArray{
    int array[][];
    int rows;
    int columns;
    TwoDimensionalArray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        rows=sc.nextInt();
        System.out.println("Enter number of columns");
        columns=sc.nextInt();
        array=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
               array[i][j]=sc.nextInt();
            }
        }
    }
    public int[] find(int ele){
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(array[i][j]==ele){
                    int a[]={i,j};
                    return a;
                }
            }
        }
        int a[]={-1,-1};
        return a;
    }
}

public class Arrays {
    int s[];
    public Arrays(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int size=sc.nextInt();
        s=new int[size];
        System.out.println("Enter elements");
        for(int i=0;i<size;i++){
            s[i]=sc.nextInt();
        }
    }
    public int find(int ele){
        for(int i=0;i<s.length;i++){
            if(s[i]==ele){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        Arrays obj=new Arrays();
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter element to find");
//        int findElement=sc.nextInt();
//        System.out.println(obj.find(findElement));
        TwoDimensionalArray two=new TwoDimensionalArray();
        int[] a=two.find(10);
        System.out.println(a[0]+""+a[1]);
    }
}
