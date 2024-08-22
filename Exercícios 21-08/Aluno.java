public class Aluno {
    String nome = null;
    Float media = null;
    Float g1 = null;
    Float g2 = null;
    public void calcularMedia() {
        media = g1 + g2 / 2;
    }
    public void exibir() {
        calcularMedia();
        if (media >= 7) {
            System.out.println(nome + " aprovado.");
        }
        else {
            System.out.println(nome + " em exame.");
        }
    }
}