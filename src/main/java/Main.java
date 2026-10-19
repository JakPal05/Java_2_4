import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        System.out.println("Wybierz: 1-suma, 2-różnica, 3-iloczyn, 4-iloraz");
        int wybor = skaner.nextInt();

        System.out.println("Podaj pierwszą liczbę:");
        int a = skaner.nextInt();

        System.out.println("Podaj drugą liczbę:");
        int b = skaner.nextInt();

        if (wybor == 1) {
            System.out.println("Wynik: " + (a + b));
        } else if (wybor == 2) {
            System.out.println("Wynik: " + (a - b));
        } else if (wybor == 3) {
            System.out.println("Wynik: " + (a * b));
        } else if (wybor == 4) {
            System.out.println("Wynik: " + (a / b));
        }
    }
}