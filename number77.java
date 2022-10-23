package javatopic;
import java.io.*;

import java.util.*; 

public class number77
{

    public static void main(String args[])throws IOException {
        ArrayList<String> bp= new ArrayList<String>();
        ArrayList<String> hb= new ArrayList<String>();
        File doc = new File("javatopic/data.txt");
        doc.createNewFile();
        FileReader freader = new FileReader(doc);
        char [] i = new char[100];
        freader.read(i);
        String  s = new String(i).replace("\n", ",");
        System.out.println(s);
        String [] a=s.trim().split(",");
        System.out.println(Arrays.asList(a));
       for (int j=0; j<13; j+=2){
         bp.add(a[j]);
       }
       for (int j=1; j<=13; j+=2){
         hb.add(a[j]);
       }
       int bpisum=0;
       int hbsum=0;
       ArrayList<Integer> bpi= new ArrayList<Integer>();
       for (int j=0; j<7; j++){
           bpi.add(Integer.parseInt(bp.get(j)));
  
       }
       Collections.sort(bpi);

       Collections.sort(hb);
     for(int b:bpi){
        bpisum+=b;
     }
     for(String h:hb){
       hbsum+=Integer.parseInt(h);
     }
    System.out.println("血壓平均："+bpisum/7);
    System.out.println("血壓最大值："+bpi.get(6));
    System.out.println("血壓最小值："+bpi.get(0));
    System.out.println("血壓平均："+hbsum/7);
    System.out.println("血壓最大值："+hb.get(6));
    System.out.println("血壓最小值："+bpi.get(0));
       
    
        freader.close();
    }
}