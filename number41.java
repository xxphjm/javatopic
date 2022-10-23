package javatopic;
import java.util.Scanner;
public class number41 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("搭了幾次電梯：");
        int Class=scanner.nextInt(); 
        int dollar=0;
        int lof=1;
        for (int i = 0; i < Class; i++) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println(" ");
            int floor=scanner2.nextInt(); 
            if(floor>lof){
                dollar+=(floor-lof)*20;
                
            }
            else{
                dollar+=(lof-floor)*10;
                
            }
            lof=floor;
        }  
        System.out.println(dollar);
    }
}
