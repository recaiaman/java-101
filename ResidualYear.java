import java.util.Scanner;
public class ResidualYear{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int year;

        System.out.print("Yıl Giriniz: ");
        year = inp.nextInt();

        if(year%4 == 0)
        {
             if(year%100 == 0)
             {
                 if(year%400 == 0)
                    System.out.println(year+" artık bir yıldir !");
                 else
                    System.out.println(year+" artık bir yıl değildir !");
             }
             else
                    System.out.println(year+" artık bir yıldir !");
        }
        else{
             System.out.println(year+" artık bir yıl değildir !");
        }
    }
}