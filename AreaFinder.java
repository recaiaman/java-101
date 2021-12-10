import java.util.Scanner;

public class AreaFinder {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int edge1,edge2,edge3,u,area;
        System.out.println("Üçgenin 1. kenarını giriniz.");
        edge1 = inp.nextInt();
        System.out.println("Üçgenin 2. kenarını giriniz.");
        edge2 = inp.nextInt();
        System.out.println("Üçgenin 3. kenarını giriniz.");
        edge3 = inp.nextInt();
        u = (edge1+edge2+edge3)/2;
        area= u*(u-edge1)*( u-edge2)*(u-edge3);

        System.out.println("Üçgenin alanı"+ area);
    }

}