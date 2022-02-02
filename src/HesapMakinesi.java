import  java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        int deger1,deger2, islem;

        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        deger1 = input.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        deger2 = input.nextInt();

        System.out.println("1. sayı: "+deger1);
        System.out.println("2. sayı: "+deger2);

        System.out.print("Yapmak istediğiniz işlemi seçiniz:\n1-Topla\n2-Çıkar\n3-Çarp\n4-Böl ");

        islem = input.nextInt();
        switch (islem){
            case 1:
                System.out.println("Toplam: "+(deger1+deger2));
                break;
            case 2:
                System.out.println("Çıkarma: "+(deger1-deger2));
                break;
            case 3:
                System.out.println("Çarpım: "+(deger1*deger2));
                break;
            case 4:
                if (islem != 0){

                    System.out.println("Bölüm: "+(deger1/deger2));
                }
                else{
                    System.out.println("Bir sayı sıfıra bölünmez");
                }

                break;
            default:
                System.out.println("Hatalı işlme kodu girdiniz.");
                break;
        }
    }
}
