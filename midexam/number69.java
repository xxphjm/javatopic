package midexam;
import java.util.*;
public class number69 {
public static void main(String[] args) {
    Dictionary dict = new Hashtable();
    dict.put("----",0);
    dict.put(".----",1);
    dict.put("..---",2);
    dict.put("...--",3);
    dict.put("....-",4);   
    dict.put(".....",5);
    dict.put("-....",6);
    dict.put("--...",7);
    dict.put("---..",8);
    dict.put("----.",9);
    Scanner scanner = new Scanner(System.in);
        System.out.print("翰入摩斯電碼：");
        String str=scanner.nextLine();
        String[] strIn = str.trim().split(" "); 
    for (String str1 : strIn)  {
        
        System.err.print(dict.get(str1));
    }
  
}
}
