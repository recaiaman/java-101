import java.util.Scanner;

public class PowerOfNumber{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int x,y,i;
        System.out.println("Hangi sayıdan üs alınacak");
        x= inp.nextInt();
        System.out.println("Hangi sayı üs alacak");
        y= inp.nextInt();
        int total=1;
        for(i=1;i<=y;i++){
            total = total * x;   
        }
        System.out.println("Sonuç = "+ total);
    }
}