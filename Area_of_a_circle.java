import java.util.*;
public class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r;
        r=sc.nextInt();
        float f;
        float d=3.14f;
        //final float a=3.14f;
        f=d*r*r;
        System.out.format("%.2f",f);
        sc.close();
    }
}