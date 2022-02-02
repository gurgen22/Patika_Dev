import  java.util.Scanner;

public class Manav {
    public static void main(String[] args) {

        int armkg,elmkg,domkg,muzkg,patkg;
        double
        armut = 2.14,
        elma = 3.67,
        domates = 1.11,
        muz = 0.95,
        patlican = 5.00,
        aTutar,eTutar,dTutar,mTutar,pTutar,toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kg giriniz: ");
        armkg = input.nextInt();
        System.out.print("Elma kg giriniz: ");
        elmkg = input.nextInt();
        System.out.print("Domates kg giriniz: ");
        domkg = input.nextInt();
        System.out.print("Muz kg giriniz: ");
        muzkg = input.nextInt();
        System.out.print("Patlıcan kg giriniz: ");
        patkg = input.nextInt();

        aTutar = armkg*armut;
        eTutar = elmkg*elma;
        dTutar = domkg*domates;
        mTutar = muzkg*muz;
        pTutar = patkg*patlican;

        toplam = aTutar+eTutar+dTutar+mTutar+pTutar;

        System.out.println("Toplam: "+toplam);
    }
}
