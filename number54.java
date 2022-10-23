package javatopic;
import java.util.*;
import java.lang.Math;
public class number54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入路程公里數(km):");
        float n=scanner.nextFloat();
        n*=1000;
        int dollar=75;
        int over;
        if (n>1500){
         over=(int)Math.ceil((n-1500)/250);
         dollar+=over*5;
        }   
        System.out.println(dollar);
    }
}
