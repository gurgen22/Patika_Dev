import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        int d1,d2,d3,d4,d5,top;
        Scanner imp = new Scanner(System.in);

        System.out.println("Ders notu giriniz: ");
        d1= imp.nextInt();

        System.out.println("Ders notu giriniz: ");
        d2 = imp.nextInt();

        System.out.println("Ders notu giriniz: ");
        d3= imp.nextInt();

        System.out.println("Ders notu giriniz: ");
        d4 = imp.nextInt();

        System.out.println("Ders notu giriniz: ");
        d5 = imp.nextInt();

        top = (d1+d2+d3+d4+d5);
        double sonuc = (top/5);

        if (sonuc <= 55){
            System.out.println("Sınıfta kaldınız");
        }
        else{
            System.out.println("Tebrikler Geçtiniz.");
        }

        System.out.println("Ortalama: "+sonuc);
    }
}
