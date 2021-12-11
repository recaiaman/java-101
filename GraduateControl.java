import java.util.Scanner;

public class GraduateControl{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int math_,phy_,tur_,kim_,mus_;
        
        System.out.print("Matematik notunu gir: ");
        math_ = inp.nextInt();

        System.out.print("Fizik notunu gir: ");
        phy_ = inp.nextInt();

        System.out.print("Türkçe notunu gir: ");
        tur_ = inp.nextInt();

        System.out.print("Kimya notunu gir: ");
        kim_ = inp.nextInt();

        System.out.print("Müzik notunu gir: ");
        mus_ = inp.nextInt();

        double average = (math_+phy_+tur_+kim_+mus_)/5;

        if ( average>0 && average <= 100){
            if(average>=55){
                System.out.println("Geçtiniz");
            }else{
                System.out.println("Kaldınız");
            }
        }else{
                System.out.println("Gerçekçi notlar giriniz...");
        }
    }
}