package midexam;
import java.util.*;
public class number63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("請輸入正整數:");
        int n=scanner.nextInt(); 
        int [] numbers = new int[n]; 
        for (int i=1; i<n; i++){
            if (n%i==0) {
                numbers[i-1]=i;
            }
        }
        int total=0;
         for (int i=0; i<numbers.length; i++){
           total+=numbers[i];
         }
         if(n==total){
          System.out.println("perfect");
         }
        else if(n<total){
          System.out.println("abundent");
         }
         else{
          System.out.println("deficicent"); 
         }

    }
}
