package javatopic;
import java.util.*;
public class number60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入一小串英文：");
        String str=scanner.next();
        String [] v={"a","e","i","o","u"};
        for (int i = 0; i < v.length; i++) {
           str= str.replace(v[i],".");
            
        }
        System.out.println(str); 
      
    }
    
}
