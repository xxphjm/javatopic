package midexam;
import java.util.Scanner;
public class number73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請输入時間1(時：分：秒)：");
        String str=scanner.nextLine();    
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("請翰入時問 2(秒)：");
        int str2=scanner2.nextInt(); 
        String [] arr1= str.trim().split(":"); 
        int hour=(int)Math.ceil(str2/3600); 
        int minute=(int)Math.ceil((str2-hour*3600)/60);
        int second=(int)Math.ceil((str2-hour*3600-minute*60));
        System.out.println(Integer.parseInt(arr1[0])*3600+Integer.parseInt(arr1[1])*60+Integer.parseInt(arr1[2])); 
        System.out.println(hour+":"+minute+":"+second);
   
    }
    
}
