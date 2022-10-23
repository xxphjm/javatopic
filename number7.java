package javatopic;
import java.util.Scanner;

public class number7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入度數：");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        if (a==186){
            b*=0.09;
            if (b>=a && b<2*a){

                b*=0.9;
            }
            else if (b>=2*a){

                b*=0.8;
            }
        }  
    else if (a==386){

        b*=0.08;
        System.out.println("通話費為："+b);
        if (b>=a && b<2*a){

            b*=0.8;
        }
        else if (b>=2*a){

            b*=0.7;
          

        }
    }

    else if (a==586){

        b*=0.07;
       
        if( b>=a && b<2*a){
            b*=0.7;
        }
        else if (b>=2*a){

            b*=0.6;
        }
    }

    else if (a==986){

        b*=0.06;
        if (b>=a && b<2*a){
            b*=0.6;
        }
        else if (b>=2*a){

            b*=0.5;
        }
    }
    System.out.println("通話費為："+b);

     
 
        }
        



        
    }
