import  java.util.Scanner;
public class GradesSum {

    public static void main(String[] args) {
        /*
            Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
            Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
            Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki 
            koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
            
            Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
            Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
            
            Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
            Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
            Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
            Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
         */
        Scanner inp = new Scanner(System.in);
        int distance,flightType,age;
        double totalPrice,salePrice,saleTemp,pricePerDistance=0.10;

            System.out.print("Yolculuk mesafenizi kilometre türünden giriniz: ");
            distance= input.nextInt();
            System.out.print("Yaşınızı giriniz:");
            age= input.nextInt();
            System.out.println("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş\n");
            flightType = input.nextInt();
            totalPrice = distance*pricePerDistance;
            
            if(distance>0 && age>0){
                 if(flightType==1){
                    if(age<12){
                        salePrice = totalPrice - (totalPrice*0.5);
                        System.out.println("Toplam Tutar = "+salePrice+ " TL");
                    }else if(age>=12 && age <=24){
                        
                        salePrice = totalPrice - (totalPrice*0.1);
                        System.out.println("Toplam Tutar = "+salePrice+ " TL");

                    }else if(age>65){

                        salePrice = totalPrice -(totalPrice*0.3);
                        System.out.println("Toplam Tutar = "+salePrice+ " TL");

                    }

                 }else if(flightType=2){
                    if(age<12){
                        salePrice = totalPrice - (totalPrice*0.5);
                        salePrice = salePrice - (salePrice*0.2);
                        System.out.println("Toplam Tutar = "+salePrice+ " TL");
                    }else if(age>=12 && age <=24){
                        
                        salePrice = totalPrice - (totalPrice*0.1);
                        salePrice = salePrice - (salePrice*0.2);
                        System.out.println("Toplam Tutar = "+salePrice+ " TL");

                    }else if(age>65){

                        salePrice = totalPrice -(totalPrice*0.3);
                        salePrice = salePrice - (salePrice*0.2);
                        System.out.println("Toplam Tutar = "+salePrice+ " TL");

                    }
                 }
            }else{
                    System.out.println("Hatalı veri girdiniz...");
            }
    }
}