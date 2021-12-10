import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        double tutar, kdvOrani = 0.18;
        System.out.print("Lütfen paranızın miktarını giriniz:");
        tutar = inp.nextInt();
        if( 0<tutar && tutar<1000){
            double kdvliFiyat = tutar+ tutar*kdvOrani;
            System.out.println("Kdvli fiyat" + kdvliFiyat);
        }
        else{
            kdvOrani = 0.08;
            double kdvliFiyat = tutar+tutar*kdvOrani;
            System.out.println("Kdvli fiyat" + tutar+(tutar*kdvOrani));
        }
        

    }
}
