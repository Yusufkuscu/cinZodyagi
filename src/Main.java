import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Doğum Yılınızı Giriniz : ");
        int yil = scan.nextInt();

        int sonuc = yil%12;
        String burc = "";

        switch (sonuc){
            case 0 :
                burc = "Maymun";
                break;
            case 2 :
                System.out.println("Köpek");
                break;
            case 1 :
                burc = "Horoz";
                break;
            case 3 :
                burc = "Domuz";
                break;
            case 4 :
                burc = "Fare";
                break;
            case 5 :
                burc = "Öküz";
                break;
            case 6 :
                burc = "Kaplan";
                break;
            case 7 :
                burc = "Tavşan";
                break;
            case 8 :
                burc = "Ejderha";
                break;
            case 9 :
                burc = "Yılan";
                break;
            case 10 :
                burc = "At";
                break;
            case 11 :
                burc = "Koyun";
                break;
            default:
                System.out.println("Geçersiz işlem...");
                break;
        }
        System.out.println("Çin Zodyağı Burcunuz : " + burc);
    }
}
