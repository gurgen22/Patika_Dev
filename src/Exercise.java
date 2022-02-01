import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

        Scanner imp = new Scanner(System.in);

        System.out.println("Vize notu giriniz: ");
        int vize = imp.nextInt();

        System.out.println("Final notu giriniz: ");
        int finalNotu = imp.nextInt();
        int toplam = vize+finalNotu;
        int ort = toplam/2;
        String sonuc = ort >= 45 ? "Geçti" : "Kaldı";
        System.out.println(sonuc);

    }
}
