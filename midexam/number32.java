package midexam;
import java.util.Scanner;
public class number32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("小明身上有幾元：");
        int in=scanner.nextInt();   
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("版責幾有幾種饮料：");
        int Class=scanner2.nextInt(); 
        int count=0;
        for (int i = 0; i < Class; i++) {
            Scanner scanner3 = new Scanner(System.in);
            System.out.println(" ");
            int dollar=scanner3.nextInt(); 
            if(in/dollar>1){
                
              count++;
            }
        }  
        System.out.println(count);
    }
}
