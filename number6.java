package javatopic;
import java.util.Scanner;
import java.util.Arrays; 

public class number6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入字串：");
        String data=scanner.next();   
        String split[]  = data.split(","); 
        Arrays.sort(split);
        int min = Integer.parseInt(String.join("", split));
      
        String maxstr="";
        for(int i=split.length-1;i>=0;i--){

        
         maxstr+=split[i];
        }
        int max = Integer.parseInt(String.join("", maxstr));
        System.out.println(max-min);  
    }
}
