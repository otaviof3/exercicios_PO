import java.util.Scanner;
public class Doze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valor aplicado: ");
        Double Saldo = scanner.nextDouble();
        System.out.println("Juros em percentual (%): ");
        Double PercJuros = scanner.nextDouble();
        System.out.println("Número de meses que deixou aplicado: ");
        Double NMeses = scanner.nextDouble();
        Double Juros = 1 + (PercJuros / 100);
        Double SaldoFinal = Saldo * Math.pow(Juros,NMeses);
        System.out.println("O saldo final é " + SaldoFinal);
    }
}