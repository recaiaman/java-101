import java.util.Scanner;

public class MaxMinDetect {
    public static void main(String[] args){
        Scanner inpu=new Scanner(System.in);
        int n;
        System.out.println("Kaç adet sayi gireceksiniz");
        n = inpu.nextInt();
        System.out.println("yazdiginiz bu 10 sayinin en buyuk olanini ve en kucuk olanini bulup cikti alacağız");
        int maks=0;
        int min=0;

        
        
        for (int i=1; i<=n; i++)
        {
            System.out.println(i+". sayiyi giriniz: ");
            int sayi = inpu.nextInt();
            
            if (i==1)
            {
                maks=sayi;
                min=sayi;
            }
            
            if (sayi>maks)
                maks=sayi;
            
            if (sayi<min)
                min=sayi;
        }
        
        System.out.println("Girdiginiz"+n+ "sayi icinden en buyuk olani: "+maks);
        System.out.println("Girdiginiz "+n+" sayi icinden en kucuk olani: "+min);
    }
}