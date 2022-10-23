package javatopic;
import java.util.*;
public class number57 {
    public static void main(String[] args) {
        Dictionary dict = new Hashtable();
        dict.put("1", 72);
        dict.put("2", 62);
        dict.put("3", 82);
        dict.put("4", 44);
        dict.put("5", 60);
        Scanner scanner = new Scanner(System.in);
        System.out.print("請選择主餐及升級的套餐：");
        String str=scanner.nextLine();
        String[] strIn = str.trim().split(""); 
       
        int dollar =(int) dict.get(strIn[0]);
        if (strIn[1].contains("A")) {
            dollar+=55;
        }
        else{
            dollar+=68;
        }
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("是否升級成大杯飲料：");
        String update=scanner2.nextLine();
        if (update.contains("是")) {
            dollar+=7; 
        }
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("是否換成大薯：");
        String update2=scanner3.nextLine(); 
        if (update2.contains("是")) {
            dollar+=13; 
        }
        System.out.println("總共為"+dollar+"元"); 

    }
}
