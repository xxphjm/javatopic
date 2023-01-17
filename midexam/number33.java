package javatopic;
import java.util.*;
public class number33 {
    public static void main(String[] args) {
    
        String [] object={"國文","英文","微積分","體育","程式設計"};
        int [] num= new int[5];
        int total=0;
        for (int i=0; i<5;i++){
            Scanner scanner = new Scanner(System.in);
            System.out.print(object[i]+"：");
            int str=scanner.nextInt();   
            num[i]=str;
            total+=str;
        }
        
        int min=100;
        int minl=0;
        for(int i =1;i<num.length;i++) {
        if(num[i]<min) {
            min=num[i];
            minl=i;
        }
        System.out.println(i);
        }
        int maxl=0;
        int max=0;
        for(int i =1;i<num.length;i++) {
        if(num[i]>max) {
            max=num[i];
            maxl=i;
        }
        }


        System.out.println("平均分數:"+(float)(total/5));
        System.out.println("最低分科目:"+object[minl]+min+"分"); 
        System.out.println("最高分科目:"+object[maxl]+max+"分"); 


    }
}
