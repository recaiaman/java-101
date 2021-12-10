import java.util.Scanner;
public class CircleArea{
    public static void main(String[] args){
        float yaricap,angle;
        double area,pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Çemberin yarıçapını giriniz:");
        yaricap = input.nextFloat();
        
        System.out.print("Çemberin açısını giriniz:");
        angle = input.nextFloat();

        area = (pi*(yaricap*yaricap)*angle)/360;

        System.out.print("Çemberin alanı"+ area);
    }
}