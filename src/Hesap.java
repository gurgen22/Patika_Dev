import java.util.Scanner;

public class Hesap {
    public static void main(String[] args) {

        double kdv = 0.18, kdvliTutar, tutar, kdvTutari;

        Scanner input = new Scanner(System.in);
        System.out.print("Tutar giriniz: ");
        tutar = input.nextDouble();

        kdv = tutar >= 0 && tutar <= 100 ? 0.18 : 0.8;
        kdvTutari = tutar*kdv;
        kdvliTutar = tutar+kdvTutari;
        System.out.println("Tutar: "+tutar);
        System.out.println("Kdv: "+kdv);
        System.out.println("Kdv Tutarı: "+kdvTutari);
        System.out.println("Kdv'li Tutar: "+kdvliTutar);

    }
}
