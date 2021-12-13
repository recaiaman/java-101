import java.util.Scanner;

public class EvenNumFinder{
       public static void main(String[] args){
           Scanner inp = new Scanner(System.in);
           int N, i;
           
           System.out.print("Bir sayi giriniz:");
           N = inp.nextInt();
           i=0;
           System.out.print(N+"'ye kadar olan 3 ve 4 e tam bölünen sayilar: ");
           while(i<N){
               if(i%3==0 && i%4==0)
                System.out.print(i+" ");
            i++;
           }
       }
}