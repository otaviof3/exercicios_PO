import java.util.Scanner;
public class AlgItera24 {
    public static void main(String[] args) {
        int Perfeitos = 0;
        int Soma = 0;
        int MenorPerfeito = 0;
        while (Perfeitos < 10) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Número: ");
            int Numero = scanner.nextInt();
            for (int i = 1; i < Numero; i++) {
                if (Numero % i == 0) {
                    Soma = Soma + i;
                }
            }
            if (Numero == Soma) {
                if (Perfeitos == 0) {
                    MenorPerfeito = Numero;
                }
                else {
                    if (MenorPerfeito > Numero) {
                        MenorPerfeito = Numero;
                    }
                }
                Perfeitos++;
                Soma = 0;
            }
        }
        System.out.println("Menor perfeito: " + MenorPerfeito);
    }
}