public class DezImpares {
    public static void main(String[] args) {
        int Impar = 0;
        for (int x = 0; Impar < 10; x++)
        if (x %2 != 0) {
            System.out.println(x);
            Impar++;
        }
    }
}