package midexam;
import java.util.*;
public class number65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請输入A的好友：");
        String str=scanner.nextLine();    
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("請输入B的好友：");
        String str2=scanner2.nextLine(); 
        String [] arr1= str.trim().split(" "); 
        String [] arr2= str2.trim().split(" "); 
        int count=0;
        for(String arr : arr1){
            for(String ar : arr2){
          
             if (arr.contains(ar)) {
                 count+=1;
             }
            }
        }
        System.out.println(count);
      
    }
}
