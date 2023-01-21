package midexam;
import java.util.*; 
public class number75 {
    public static void main(String[] args) {
        ArrayList<String> dolist = new ArrayList<String>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("請輸入事項(若己無事項，請輸入end)");
            String data=scanner.nextLine(); 
            if (data.contains("end")) {
                break;
            }
            else{
                dolist.add(data);
            }
        }
        for (String list : dolist)  {
             System.out.println((dolist.indexOf(list)+1)+"."+list); 
        }
    }
}
