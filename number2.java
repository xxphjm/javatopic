package javatopic;
import java.util.Scanner;
import java.text.DecimalFormat;
public class number2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入度數：");
        int degree=scanner.nextInt();
        float s=0;
        float nos=0;
        for (int i=1; i<=degree; i++){
    
           if (i<=120) {
            s+=2.10;
            nos+=2.10;
           }
           else if (i>=121 && i<=330) {
             s+=3.02;
             nos+=2.68;
           }
           else if (i>=331 && i<=500) {
             s+=4.39;
             nos+=3.61;
           }
           else if (i>=501 && i<=700) {
             s+=4.97;
             nos+=4.01;
           }
           else if (i>=700) {
             s+=5.63;
             nos+=4.50;
           }
           
         
            }
         DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("夏季："+df.format(s));
        System.out.println("非夏季："+ df.format(nos));
        }
        



        
    }
