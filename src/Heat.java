import java.util.Scanner;

public class Heat {
    public static void main(String[] args) {

        int deger;
        Scanner imp = new Scanner(System.in);

        System.out.println("Sıcaklık giriniz: ");
        deger= imp.nextInt();

      if(deger <5){
          System.out.println("Kayak yapabilirsiniz.");
      }
       else if(deger > 5 && deger < 25){
           if(deger <= 15 && deger >= 10){
               System.out.println("Piknik veya sineamaya gidebilir ");
           }
           else if (deger < 10){
               System.out.println("Sadece sinemaya gidebilir");
           }
           else{
              System.out.println("Sadece pikniğe gidebilir");
          }
      }
       else{
          System.out.println("Yüzmeye gidebilir");
      }
    }
}
