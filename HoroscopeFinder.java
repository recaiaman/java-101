import java.util.Scanner;
public class HoroscopeFinder{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int monthSelect,daySelect;
        
        
        System.out.println("Kaçıncı ayda doğdunuz?");
        monthSelect=input.nextInt();
        System.out.println("Kaçıncı günde doğdunuz?");
        daySelect=input.nextInt();

            if (monthSelect == 1){
                    if(daySelect >= 1 && daySelect <= 21){
                        System.out.println("Oğlak burcusunuz");
                    }else {
                        System.out.println("Kova burcusunuz");
                    }
            }else if(monthSelect == 2){
                    if(daySelect >=1 && daySelect <=19){
                        System.out.println("Kova Burcusunuz");
                    }else{
                        System.out.println("Balık Burcusunuz");
                    }
            }else if(monthSelect ==3){
                    if(daySelect >=1 && daySelect <=20){
                        System.out.println("Balık Burcusunuz");
                    }else{
                        System.out.println("Koç Burcusunuz");
                    }
            }else if(monthSelect ==4){
                    if(daySelect >=1 && daySelect <=20){
                        System.out.println("Koç Burcusunuz");
                    }else{
                        System.out.println("Boğa Burcusunuz");
                    }
            }else if(monthSelect ==5){
                    if(daySelect >=1 && daySelect <=21){
                        System.out.println("Boğa Burcusunuz");
                    }else{
                        System.out.println("İkizler Burcusunuz");
                    }
            }else if(monthSelect ==6){
                    if(daySelect >=1 && daySelect <=22){
                        System.out.println("İkizler Burcusunuz");
                    }else{
                        System.out.println("Yengeç Burcusunuz");
                    }
            }else if(monthSelect ==7){
                    if(daySelect >=1 && daySelect <=22){
                        System.out.println("Yengeç Burcusunuz");
                    }else{
                        System.out.println("Aslan Burcusunuz");
                    }
            }else if (monthSelect ==8){
                     if(daySelect >=1 && daySelect <=22){
                        System.out.println("Aslan Burcusunuz");
                    }else{
                        System.out.println("Başak Burcusunuz");
                    }
            }else if (monthSelect ==9){
                     if(daySelect >=1 && daySelect <=22){
                        System.out.println("Başak Burcusunuz");
                    }else{
                        System.out.println("Terazi Burcusunuz");
                    }
            }else if (monthSelect ==10){
                     if(daySelect >=1 && daySelect <=22){
                        System.out.println("Terazi Burcusunuz");
                    }else{
                        System.out.println("Akrep Burcusunuz");
                    }
            }else if (monthSelect ==11){
                     if(daySelect >=1 && daySelect <=21){
                        System.out.println("Akrep Burcusunuz");
                    }else{
                        System.out.println("Yay Burcusunuz");
                    }
            }else if (monthSelect ==12){
                     if(daySelect >=1 && daySelect <=21){
                        System.out.println("Yay Burcusunuz");
                    }else{
                        System.out.println("Kova Burcusunuz");
                    }
            }else{
                        System.out.println("Geçerli bir ay girin lütfen...");
            }
    
    }
}