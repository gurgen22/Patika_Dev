import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {

        int km,age,type;
        double amount,ageDiscount,discountedAmount,roundTripTicketDiscount,totalAmount,ageDiscountRate;

        Scanner imp = new Scanner(System.in);

        System.out.println("Km giriniz: ");
        km = imp.nextInt();

        System.out.println("Yaşınızı giriniz: ");
        age = imp.nextInt();

        System.out.println("Yolculuk tipini giriniz:\nTek Yön için :1\nGidiş-Dönüş için :2 ");
        type = imp.nextInt();

        if(km > 0 && age > 0 && (type == 1 || type ==2)){

            if(age < 12){
                ageDiscountRate = 0.5;
            }
            else if(age > 12 && age < 24 ){
                ageDiscountRate = 0.1;
            }
            else if(age > 65){
                ageDiscountRate = 0.2;
            }
            else{
                ageDiscountRate = 0;
            }

            amount = (km * 0.10);
            ageDiscount = (amount * ageDiscountRate);

            discountedAmount = (amount - ageDiscount);

            if(type == 2){
                roundTripTicketDiscount = (discountedAmount * 0.2);
                totalAmount = (discountedAmount-roundTripTicketDiscount)*2 ;
            }else{

                totalAmount = discountedAmount;
            }

            System.out.println("Toplam tutar: "+ totalAmount);


        }
        else {
            System.out.println("Hatalı Veri Girdiniz !");
        }


    }
}
