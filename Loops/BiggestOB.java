import java.util.Scanner;

public class BiggestOB{
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, ebob = 1; 
        int ekok = 1; 
        int counter = 1;
        System.out.print("1. sayıyı giriniz: ");
        number1 = input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        number2 = input.nextInt();
        while (true) {
            if (number1 % counter == 0 && number2 % counter == 0) {
                ebob = counter;
            }
            if (counter == number1 || counter == number2) {
                break;
            }
            counter++;
        }
        ekok = (number1 * number2) / ebob;

        System.out.println(number1 + "," + number2 + " sayılarının EBOB u: " + ebob + " EKOK u " + ekok);
    }
}