import java.util.Scanner;

public class StarMaker{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int  uzunluk = scanner.nextInt();

         for (int satir = 0; satir < uzunluk; satir++) {
		System.out.print(" ");
                for (int sutun = uzunluk; sutun > satir; sutun--) {
                    System.out.print(" ");
		}
                 
		for (int sutun = 0; sutun <= satir; sutun++) {
                    System.out.print("*");
		}
                
		for (int sutun = 0; sutun < satir; sutun++) {
                    System.out.print("*");
		}
		System.out.print("\n");
       
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