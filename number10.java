package javatopic;
import java.util.*;
public class number10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入兩字串：");
        int n=scanner.nextInt();
        int m=scanner.nextInt(); 
        String [][] p;
        p=new String[n][m];
        Scanner scanner2 = new Scanner(System.in);
        for (int i = 0; i <n; i++) {
            System.out.print("請輸入第"+(i+1)+"列：");
            String a=scanner2.nextLine();
            String[] aIn = a.trim().split(" "); 
            System.out.println(Arrays.toString(aIn));
            p[i]=aIn;
        }
        String [][] q;
        q=new String[m][n];
        for(int i=0;i<p.length;i++)
        {
            for(int j=0;j<p[i].length;j++)
            {
                q[j][i]=p[i][j];
            }
            
            
        }
        for(int j=0;j<q.length;j++)
            {
                System.out.println("输出矩陣數值第1列為："+Arrays.toString(q[j]));  
            }
       
    }
        
    }

