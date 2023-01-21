package midexam;
import java.util.*;
public class number35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("sA：");
        String str=scanner.next();    
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("sB：");
        String str2=scanner2.next();    
        if (str2.contains(str)) {
            System.out.println("子字串判斷：YES");
        }
        else {
            System.out.println("子字串判斷：NO");
        }
    }
}
