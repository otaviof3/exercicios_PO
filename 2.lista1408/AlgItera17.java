import java.util.Scanner;
public class AlgItera17 {
    public static void main(String[] args) {
        int Numero = 1;
        int NumerosFibonacci = 0;
        int NumerosTotal = 0;
        while (Numero >= 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Número: ");
            Numero = scanner.nextInt();
            if (Numero < 0) {
                ;
            }
            else {
                NumerosTotal++;
                if (Numero == 0) {
                    NumerosFibonacci++;
                }
                else if (Numero == 1) {
                    NumerosFibonacci++;
                }
                else {
                    int Fibonacci1 = 0;
                    int Fibonacci2 = 1;
                    int FibonacciTotal = 0;
                    while (Numero > FibonacciTotal) {
                        FibonacciTotal = Fibonacci1 + Fibonacci2;
                        Fibonacci1 = Fibonacci2;
                        Fibonacci2 = FibonacciTotal;
                        if (Numero == FibonacciTotal) {
                            NumerosFibonacci++;
                        }
                    }
                }
            }
        }
        int Percentual = (NumerosFibonacci * 100) / NumerosTotal;
        System.out.println("Percentual de números da sequência de Fibonacci: " + Percentual + "%");
    }
}