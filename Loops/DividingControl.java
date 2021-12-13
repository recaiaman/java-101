import java.util.Scanner;

public class DividingControl{
       public static void main(String[] args){
           Scanner inp = new Scanner(System.in);
           int n,i,j;

           System.out.print("Bir sayi giriniz..");
           n = inp.nextInt();
           for(i=1; i <n ;i*=4){
               System.out.println(i);                
            }
            for(j=1; j <n ;j*=5){
               System.out.println(j);                
            }
            
    
    }
}
