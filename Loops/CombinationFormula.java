import java.util.Scanner;

public class CombinationFormula{
    public static void main(String[] args){
        
        Scanner inp = new Scanner(System.in);
        int i,n,k,j,r,n_r;
        int nFactorialResult=1;
        int rFactorialResult=1;
        int n_rFactorialResult=1;
        int result;
        
        System.out.println("Sayı giriniz: ");
        n = inp.nextInt();
        System.out.println("Sayı giriniz: ");
        r = inp.nextInt();
        n_r = n-r;
        if(n_r>0){
            for(i=1; i<=n ;i++){
                nFactorialResult *= i;
            }

            for(j=1; j<=r; j++){
                rFactorialResult *= j;
            }
            for(k=1; k<= n_r; k++){
                n_rFactorialResult *= k;
            }
            result = nFactorialResult/(rFactorialResult * n_rFactorialResult);
            System.out.println("Sonuç= "+ result);
        }
    }

}