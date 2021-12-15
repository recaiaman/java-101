import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int uzunluk;
        System.out.println("Lütfen uzunluk giriniz..");
        uzunluk = inp.nextInt();
        for (int satir = 0; satir < uzunluk; satir++) {
		   
                
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