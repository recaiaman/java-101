import java.util.Scanner;

public class NeverOddEnter{
       public static void main(String[] args){
           Scanner inp = new Scanner(System.in);
           int entry=0;
           int total=0;
           
           do{
               System.out.print("Bir sayi giriniz:");
               entry = inp.nextInt();
               
               if (entry%2==0){
                   if(entry%4 == 0){
                       total += entry;
                   }                    
               }else{
                   System.out.print("Toplam= "+ total);
                   break;
               }

           }while(entry%2 == 0);
               
           
       }
}