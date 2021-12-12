import java.util.Scanner;
public class CircleArea{
    public static void main(String[] args){
        int heat;

        Scanner inp = new Scanner(System.in);
        heat = input.nextInt();

        if( heat<5 ){
            System.out.println("Kayak yapmaya git!");
        }else if(heat>5){
            if(heat>10){
                System.out.println("Pikniğe gitsen daha iyi olur..");
            }else{
                System.out.println("Sinemaya gitsen daha iyi olur..");
            }
        }else{
                System.out.println("Yüzmeye git!");
        }
    }
}