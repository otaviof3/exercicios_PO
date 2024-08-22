public class DezPrimos {
    public static void main(String[] args) {
        int Primo = 0;
        int x = 1;
        while (Primo < 10) {
            int cont = 0;
            for (int i = 1; i < x; i++) {
                if (x % i == 0)
                cont++;
            }
            if (cont == 1) {
                System.out.println(x);
                Primo++;
            }
            x++;
        }
    }
}