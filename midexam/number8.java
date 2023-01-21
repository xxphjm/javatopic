package midexam;
import java.util.Scanner;
public class number8 {
    public static void main(String[] args) {
        // System.out.println("輸入：");
		// Scanner sc = new Scanner(System.in);
		// int m = sc.nextInt();
		// int n = sc.nextInt();

		// int[] num2 = new int[n];
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("翰入第一行正整數為：");
        String num = scanner.next();
        System.out.println("第二行中数列中的数字為：");
        String str = scanner2.nextLine();
        String[] numstr = str.split(" ");
        String[] nums = new String[numstr.length];
        int total=0;
        for(int i = 0; i < numstr.length; i ++) {
            nums[i] = (numstr[i]);
        }
        for(String n: nums) {
    
            if(n.contains(num)){
                total++;
            }
        }
        System.out.println("最大出現次数的数字為:"+total);
     
    
    }
}
