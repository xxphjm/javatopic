package javatopic;
import java.util.*;
public class number66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請输入string a：");
        String str=scanner.nextLine();    
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("請输入string b：");
        String str2=scanner2.nextLine(); 
        String [] arr1= str.trim().split(""); 
        String [] arr2= str2.trim().split(""); 

       String str3="";
        for(String arr : arr1){
            for(String ar : arr2){
              
             if (arr.contains(ar)&&!str3.contains(ar)) {
                str3+=ar;
          
             }
            }
        }
        char[] chars = str3.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
     
      
    }
}
