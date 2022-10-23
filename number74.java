package javatopic;
import java.util.Arrays;
import java.util.Scanner;
public class number74 {
    public static void main(String[] args) {

     String [] color={"red","blue","red","green"};
     Scanner scanner = new Scanner(System.in);
     System.out.print("請輸入字串：");
     String data=scanner.nextLine(); 
     String [] arr= data.trim().split(" "); 
     int i=0;
   
     while (i<=11){
        if (i==11) {
            System.out.println("挑戰失敗");
            break;
        }
        String st="";
      for (int j=0; j <arr.length; j++) {
            if (arr[j].contains(color[j])) {
                st+="1";
            }
           else if (Arrays.asList(color).contains(arr[j])) {
                st+="2";
            }
            else {
              st+="3";
            }
      }
      if (st.contains("1111")) {
         System.out.println("正確答案"); 
         break;
      }
      else{
       System.out.println(st);
      }
      i+=1;
    }
    }
}
