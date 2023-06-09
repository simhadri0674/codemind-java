import java.util.*;
public class demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Map<Integer, Integer> map= new HashMap<>();
        int n,x[];
        int c=0;
        n=sc.nextInt();
        x=new int[n];
        for (int i=0;i<n;i++){
            x[i]=sc.nextInt();
            if (map.containsKey(x[i])){
                map.put(x[i],map.get(x[i])+1);
            }
            else{
                map.put(x[i],1);
            }
        }
        for(int i:x){
            if(map.get(i)==1){
                System.out.print(i+" ");
                c+=1;
            }
        }
        if (c<=0) System.out.println("-1");
    }
}