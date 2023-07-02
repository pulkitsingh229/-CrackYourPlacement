import java.util.*;
public class p9{
    public static void main(String args[]){
     int arr[]={7,3,2,4,9,12,56};
     int n=arr.length;
     int m=3;
     int minDiff=Integer.MAX_VALUE;

     if(m==0 || n==0){
        System.out.println(0);
     }

     Arrays.sort(arr);

     if(n<m){
        System.out.println("Invalid Condition");
     }

     for(int i=0;i+m-1<n;i++){
        int diff=arr[i+m-1]-arr[i];
        if(diff<minDiff){
            minDiff=diff;
        }
     }

     System.out.println(minDiff);

    }
}