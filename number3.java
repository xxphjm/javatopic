package javatopic;
import java.util.Scanner;

public class number3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入年份：");
        int year=scanner.nextInt();
        String[] zo={"猴" ,"雞" ,"狗" ,"豬" ,"鼠" ,"牛" ,"虎" ,"兔" ,"龍" ,"蛇" ,"馬" ,"羊"};
        System.out.println(zo[year%12]);

      
    


        
    }
  }