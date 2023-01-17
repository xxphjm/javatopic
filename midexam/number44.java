package javatopic;
import java.util.*;
public class number44 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入：");
        int Class=scanner.nextInt(); 
        int [] count=new int[Class];
        for (int i = 0; i < Class; i++) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println(" ");
            int number=scanner2.nextInt(); 
            count[i]=number;
        }  
        Arrays.sort(count);

        System.out.println(count[Class-1]);
        
    }
}
