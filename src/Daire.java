import  java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        int r, aci;
        double alan, pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçapı giriniz: ");
        r = input.nextInt();

        System.out.print("Açı giriniz: ");
        aci = input.nextInt();


        alan = (pi*(r*r)*aci)/360;
        System.out.println("Alan: "+alan);
    }
}
