import java.util.Scanner;
public class Quatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lado 1: ");
        Double A = scanner.nextDouble();
        System.out.println("Lado 2: ");
        Double B = scanner.nextDouble();
        System.out.println("Ângulo: ");
        Double Alpha = scanner.nextDouble();
        Double Radianos = Alpha * (3.14/180);
        Double Area = (A * B * Math.sin(Radianos) / 2);
        System.out.println("A área deste triângulo é " + Area);
    }
}