
import java.util.Scanner;

public class LeapYearCalculation {
    public static void main(String[] args) {

        int year;

        Scanner imp = new Scanner(System.in);

        System.out.println("Yılı giriniz: ");
        year = imp.nextInt();

        if(year%4==0){
            if(year%100==0 && year%400!=0){

                System.out.println(year+" bir artık yıldır değildir !");
            }
            else{

                System.out.println(year+" bir artık yıldır.");
            }
        }else {
            System.out.println(year+" bir artık yıldır değildir !");
        }


    }
}
