package javatopic;
import java.util.*;
public class number47 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入：");
        int count=scanner.nextInt(); 
        String [] tablet=new String[count];
        String [] pen=new String[count];
        for (int i = 0; i < count; i++) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println(" ");
            String number=scanner2.next(); 
            String number2=scanner2.next(); 
            tablet[i]=number;
            pen[i]=number2;
            
        }  
       for (int i = 0; i < count; i++) {
           

           System.out.println(tablet[i]+"牌得到"+pen[i]+"面");
       }

        
    }
}
