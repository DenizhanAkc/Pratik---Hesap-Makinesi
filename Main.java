import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int number1, number2, select;

        Scanner input = new Scanner(System.in);
        System.out.print(" Ilk sayiyi giriniz ");
        number1 = input.nextInt();
        System.out.print(" Ikinci sayiyi giriniz ");
        number2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print(" Sectiginiz Islem " );

        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Sonuc : " + (number1 + number2));
                System.out.println("Islem Tamamlandi");
                break;
            case 2:
                System.out.println("Sonuc : " + (number1 - number2));
                System.out.println("Islem Tamamlandi");
                break;
            case 3:
                System.out.println("Sonuc : " + (number1 * number2));
                System.out.println("Islem Tamamlandi");
                break;
            case 4:
                switch (number2) {
                    case 0:
                        System.out.println("Bir sayi 0'a bolunemez!");
                        break;
                    default:
                        System.out.println("Sonuc : " + (number1 / number2));
                        System.out.println("Islem Tamamlandi");
                        break;



                }

        }
    }
}