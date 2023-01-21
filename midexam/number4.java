package midexam;
import java.util.Scanner;

public class number4 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("X:");
    int x=scanner.nextInt();
    System.out.print("Y:");
    int y=scanner.nextInt();  

     double distance= (double) Math.pow(x, 2)+Math.pow(y, 2);

    if (x>0) {
        if (y>0) {
            System.out.print("該點位於第一象限");
        }
        else{
            System.out.print("該點位於第四象限");
        }
    }
   else{
    if (y>0) {
        System.out.print("該點位於第二象限");
    }
    else{
        System.out.print("該點位於第三象限");
    }
   }
  System.out.println("，與原點距離根號"+distance);
   }
}
