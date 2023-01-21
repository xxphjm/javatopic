package midexam;
import java.util.*;
public class number62 {
    public static void main(String[] args) {
        Dictionary dict = new Hashtable();
        dict.put("蘋果","紅色");
        dict.put("香蕉","黃色" );
        dict.put("葡萄","紫色");
        dict.put("藍莓","藍色");
        dict.put("橘子","橘色");
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("請输入水果：");
        String update2=scanner.nextLine(); 
        System.out.println(dict.get(update2));

        

    }
}
