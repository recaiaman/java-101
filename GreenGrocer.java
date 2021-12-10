import java.util.Scanner;

public class GreenGrocer {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float mtsxuliAmount,ushkuriAmount,domatisiAmount,muziAmount,patlicaniAmount; // Bazı meyvelerin Lazca karşılıkları değişken isimleride kullanılmıştır.
         
        System.out.print("Armut  kaç kilo ? :");
        mtsxuliAmount = input.nextFloat();
        System.out.print("Elma  kaç kilo ? :"); 
        ushkuriAmount = input.nextFloat();
        System.out.print("Domates  kaç kilo ? :");
        domatisiAmount = input.nextFloat();
        System.out.print("Muz  kaç kilo ? :");
        muziAmount = input.nextFloat();
        System.out.print("Patlican  kaç kilo ? :");
        patlicaniAmount = input.nextFloat();

        double total = mtsxuliAmount*2.14 + ushkuriAmount*3.67 + domatisiAmount*1.11 + muziAmount*0.95 + patlicaniAmount*5.00;
        System.out.println("Topma tutar"+total); 
    }
}