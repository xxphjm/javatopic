package javatopic;
import java.util.*;
public class number49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入一行英文句子：");
        String str=scanner.nextLine();   
        String[] strIn = str.trim().split(" "); 
        Collections.reverse(Arrays.asList(strIn));
        System.out.println(Arrays.asList(strIn));
    }
}
