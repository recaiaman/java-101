import java.util.Scanner;
public class BodyIndex{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        float boy,kg;
        double index;
        System.out.print("Lütfen kilonuzu giriniz:");
        kg = input.nextFloat();
        System.out.print("Lütfen boyunuzu giriniz:");
        boy = input.nextFloat();
        index = kg/ (boy*boy);

        System.out.println("Vücut kitle indexiniz: " + index );

    
    }
}