package midexam;
import java.util.*;
public class number55 {
    public static void main(String[] args) {
        String [] bookA={"饥饯遊戲3","解憂雜貨店","怪歌與牠們的產地","哈利波特6","我的阿富汗筆友","新念之樹","楼下的房客","小王子"};
        String [] bookB={"房恩琪的初总樂园","等一個人咖啡","鬼诚之刀14","神農當百草","參田捕手","老人與海","假慢與偽見","與神同行"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入要找的書名:");
        String n=scanner.next(); 
        if (Arrays.asList(bookA).contains(n)) {
            System.out.println("在書架Ａ的第"+(Arrays.asList(bookA).indexOf(n) + 1)+"本");
        }   
       else if (Arrays.asList(bookB).contains(n)) {

            System.out.println("在書架Ｂ的第"+(Arrays.asList(bookB).indexOf(n) + 1)+"本");
        }  
        else {
            System.out.println("查無此書籍");
        }
    }
}
