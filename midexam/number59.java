package midexam;
import java.util.*;
import java.lang.Math;
public class number59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = {100,50,10,5,1};
        System.out.print("請輸入金額:");
        int n=scanner.nextInt();  
        int tonum=0;
        for (int i=0; i<numbers.length; i++) {
            
            tonum+=(int)Math.floor(n/numbers[i]);
            n-=(int)Math.floor(n/numbers[i])*numbers[i];
        }
        System.out.println(tonum); 
    }
}
