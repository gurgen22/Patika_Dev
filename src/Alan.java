import  java.util.Scanner;

public class Alan {
    public static void main(String[] args) {
        int deger1, deger2;
        double deger3;

      Scanner input = new Scanner(System.in);

        System.out.print("Bir kenar giriniz: ");
        deger1 = input.nextInt();

        System.out.print("Bir kenar giriniz: ");
        deger2 = input.nextInt();

        deger3 = Math.sqrt((deger1*deger1)+(deger2*deger2));
        System.out.println("3. kenar: "+deger3);
    }
}
