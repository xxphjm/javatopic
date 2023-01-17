package tw.recursive;

public class tower {
    public static void fac( int n ,String A ,String B,String C){

        if(n==1) {
            System.out.println("盤子從"+A+"移到"+C+"ok");
            System.out.println(n);
        

        } else {
           fac(n-1, A, C, B);
            System.out.println("盤子從"+A+"移到"+ C+"ok3");
            System.out.println(n);
 
           fac(n-1, B, A, C);

           
        }

    }
    public static void main(String[] args) {

       fac(3,"A","B","C");

        
    }
}
