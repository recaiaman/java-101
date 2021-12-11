import java.util.Scanner;

public class GraduateControl{
    public static void main(String[] args){
        int a,b,c,max;
        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        a = input.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        b = input.nextInt();
    
        System.out.print("3. sayıyı giriniz: ");
        c = input.nextInt();
        
        if((a>b) && (a>c)){
            if(b>c){
                System.out.print(c+"<"+b+"<"+a);
            } else {
                System.out.print(b+"<"+c+"<"+a);
            }
        }else if(( b>a ) && (b>c)){
            if(a>c){
                System.out.print(c+"<"+a+"<"+b);
            }else {
                System.out.print(a+"<"+c+"<"+b);
            }
        }else if((c>a) && (c>b)){
            if(a>b){
                System.out.print(b+"<"+a+"<"+c);
            }else{
                System.out.print(a+"<"+b+"<"+c);
            }
        }
    }

}