package midexam;
import java.sql.Array;
import java.util.*;
public class number58 {
    public static void main(String[] args) {
       int [] number = new int[10];
        for (int i = 0; i <10; i++) {
            Scanner scanner2 = new Scanner(System.in); 
            System.out.print("請输入第"+(i+1)+"個数字:" );
            int n=scanner2.nextInt();
            number[i]=n;
    
        }  
        Arrays.sort(number);
        System.out.println("最大的3個数字為:"+number[9]+","+number[8]+","+number[7]); 
        System.out.println("最小的3個数字為:"+number[2]+","+number[1]+","+number[0]); 
       } 
}
