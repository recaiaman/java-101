import java.util.Scanner;

public class PasswordValidator{
    public static void main(String[] args){
        String username,password,passwordValidator="everaneRakani";
        String usernameValidator="Recai123";
        String select;

        Scanner inp = new Scanner(System.in);
        
        System.out.print("Kullanıcı Adınız: ");
        username = inp.nextLine();

        System.out.print("Şifreniz: ");
        password = inp.nextLine();
        
        if(password.equals(passwordValidator) && username.equals(usernameValidator)){
            System.out.println("Giriş Başarılı");
        }
        else if(password != passwordValidator && username.equals(usernameValidator)){
        
            System.out.println("Parolanızı yanlış girdiniz değiştirmek istiyor musunuz:");
            select = inp.nextLine();
                if(select.equals("e")){
                   System.out.print("Yeni parolanızı giriniz:");
                   password = inp.nextLine();
                   
                   if(password.equals(passwordValidator)){
                      System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                      
                   }
                   else{
                       System.out.print("Şifreniz başarıyla oluşturuldu. Şifreniz: "+ password);
                       
                   }     
                }else if(select.equals("h")){
                    System.out.println("Yeniden deneyiniz...");
                }
                            
        }
    }
}