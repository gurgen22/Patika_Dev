import  java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String userName, password;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();

        if (userName.equals("Patika") && password.equals("Patika123")){
            System.out.println("Giriş yapıldı.");
        }else{
            System.out.println("Hatalı Giriş!");
        }

    }
}
