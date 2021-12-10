import  java.util.Scanner;
public class GradesSum {

    public static void main(String[] args) {
        int tarihNot,matNot,fizNot,kimyaNot,turkceNot,muzikNot,ortalama,toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen tarih notunuzu giriniz:");
        tarihNot = input.nextInt();

        toplam += tarihNot;

        System.out.print("Lütfen matematik notunuzu giriniz:");
        matNot = input.nextInt();

        toplam += matNot;

        System.out.print("Lütfen fizik notunuzu giriniz:");
        fizNot = input.nextInt();

        toplam += fizNot;

        System.out.print("Lütfen kimya notunuzu giriniz:");
        kimyaNot = input.nextInt();

        toplam +=kimyaNot;

        System.out.print("Lütfen türkçe notunuzu giriniz:");
        turkceNot = input.nextInt();

        toplam += turkceNot;

        System.out.print("Lütfen müzik notunuzu giriniz:");
        muzikNot = input.nextInt();

        toplam += muzikNot;

        ortalama = toplam/7;
        String durum = (ortalama >= 60) ? "Geçti":"Kaldı";
	    System.out.println(durum);
    }
}