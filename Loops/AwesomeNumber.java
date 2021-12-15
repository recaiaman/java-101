import java.util.Scanner;

public class AwesomeNumber{
    public static void main(String[] args){
       Scanner inp = new Scanner(System.in);
       System.out.print("Bir Sayı Giriniz:");
       int sayi = input.nextInt(); 
       int toplam=0;
      
        for (int i = 1; i <= sayi/2; i++) { 
            if (sayi % i ==0) {
                toplam+=i;
            }
        }
        if (sayi==toplam) {
            System.out.println(null, sayi+" Mükemmel Sayıdır");
        }
        else 
            System.out.println(null, sayi+" Mükemmel Sayı Değildir");
    }
}