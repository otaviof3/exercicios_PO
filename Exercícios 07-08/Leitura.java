import java.util.Scanner;
public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor digite uma mensagem: ");
        String mensagem = scanner.nextLine();
        System.out.println("Você digitou " + mensagem);
        scanner.close();
    }
}