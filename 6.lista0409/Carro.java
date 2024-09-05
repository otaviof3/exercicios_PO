public class Carro {
    private String Marca;
    private String Modelo;
    private int Ano;
    private float Preco;

    public Carro(String Marca, String Modelo, int Ano, float Preco) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Ano = Ano;
        this.Preco = Preco;
    }

    public String getMarca(){
        return Marca;
    }

    public void setMarca (String Marca){
        this.Marca = Marca;
    }

    public String getModelo(){
        return Modelo;
    }

    public void setModelo (String Modelo){
        this.Modelo = Modelo;
    }

    public int getAno(){
        return Ano;
    }

    public void setAno (int Ano){
        this.Ano = Ano;
    }

    public float getPreco(){
        return Preco;
    }

    public void setPreco (float Preco){
        if (Preco >= 0){
            this.Preco = Preco;
        }
        else {
            System.out.println("Preço inválido!");
        }
    }
}