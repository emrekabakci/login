import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, answer;
        int password, newPassword;

        System.out.print("Kullanici Adiniz: ");
        userName = inp.nextLine();
        System.out.print("Sifreniz: ");
        password = inp.nextInt();
        inp.nextLine();

        if ((userName.equals("emre")) && (password == 1234)) {
            System.out.print("Basariyla giris yaptiniz.");
        } else {
            if (!userName.equals("emre")) {
                System.out.print("Kullanici adiniz hatali");
            } else {
                System.out.print("Sifre yanlis.\nSifrenizi degistirmek ister misiniz?\nEvet ya da hayir yaziniz: ");
                answer = inp.nextLine();

                if (answer.equals("evet")) {
                    System.out.print("Yeni sifrenizi giriniz : ");
                    newPassword = inp.nextInt();
                    if (newPassword != 1234) {
                        System.out.print("Sifre degistirildi!");
                    } else {
                        System.out.println("Sifre degistirilemedi");
                        System.out.print("Yeni sifren eski sifrenden farkli olmak zorunda.");
                    }
                } 

            }

        }

    }
}
