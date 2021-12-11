import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int select,number1,number2;
        System.out.print("Lütfen ilk sayınızı giriniz: ");
        number1 = inp.nextInt();
        System.out.print("Lütfen ikinci sayiyi giriniz: ");
        number2 = inp.nextInt();
        
        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz(1-Toplama 2-Çıkarma 3-Çarpma 4-Bölme):");
        select = inp.nextInt();

        switch(select){
            case(1):
                int sonuc= number1+number2;
                System.out.print("İşleminizin sonucu: "+ sonuc );
                break;
            case(2):
                sonuc= number1-number2;
                System.out.print("İşleminizin sonucu: "+ sonuc );
                break;
            case(3):
                sonuc= number1*number2;
                System.out.print("İşleminizin sonucu: "+ sonuc );
                break;
            case(4):
                sonuc= number1/number2;
                System.out.print("İşleminizin sonucu: "+ sonuc );
                break;
        }
    }
}