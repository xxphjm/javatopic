package javatopic;
import java.util.*;
public class number76 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("請輸入字串：");
     String data=scanner.nextLine(); 
     String [] arr= data.trim().split(""); 
     String pass="";   
     for(String str : arr){
        pass+=(Integer.parseInt(str)*7);
     }
    }
}
