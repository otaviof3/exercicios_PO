import java.util.Scanner;
public class AlgItera8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Número: ");
        int Numero = scanner.nextInt();
        int Soma = 0;
        for (int x = 1; x <= Numero; x++) {
            Soma = Soma + x;
        }
        System.out.println("Soma: " + Soma);
    }
}