import java.util.Scanner;

public class FibonacciSeries{
     public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int count = inp.nextInt(); 
        int num1 = 0;
        int num2 = 1;
        System.out.print("Fibonacci Serisi "+count+":");

        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");

          
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }
}