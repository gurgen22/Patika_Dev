import  java.util.Scanner;

public class KitleIndex {
    public static void main(String[] args) {

        double boy, kg, sonuc;

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu giriniz: ");
        boy = input.nextDouble();

        System.out.print("Kg giriniz: ");
        kg = input.nextDouble();

        sonuc = kg/boy*boy;
        System.out.println("Vücut Kitle İndeks: "+sonuc);
    }
}
