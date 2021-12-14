import java.util.Scanner;

public class StarMaker{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int  uzunluk = scanner.nextInt();

         for (int satir = 0; satir < uzunluk; satir++) {
		System.out.print(" ");// hangi satırda olduğumuzu belirtmek için kullandık
                
                //Önce uzunluktan  bulunduğumuz satırı çıkarıp okadar bosluk sütunu ekliyoruz
                for (int sutun = uzunluk; sutun > satir; sutun--) {
                    System.out.print(" ");
		}
                //Sonra satir sayısı kadar yıldızla sutun çiziyoruz 
		for (int sutun = 0; sutun <= satir; sutun++) {
                    System.out.print("*");
		}
                // Bu for bloguna kadar üçgenin sol tarafını çiziyoruz bundan sonra sağ tarafını
                //satir sayısı kadar yıldızla sütun ekliyoruz
		for (int sutun = 0; sutun < satir; sutun++) {
                    System.out.print("*");
		}
		System.out.print("\n");//her sütundan sonra alt satıra geçiriyoruz
       
	}
          for (int satir = 0; satir < uzunluk; satir++) {
		System.out.print("  ");
                
               
                for (int sutun = 0; sutun < satir; sutun++) {
                    System.out.print(" ");
		}
                
                
		for (int sutun = uzunluk; sutun > satir; sutun--) {
                    System.out.print("*");
		}
                
                
                for (int sutun = uzunluk-1; sutun > satir; sutun--) {
                    System.out.print("*");
		}
		System.out.print("\n");
	}
    }
}