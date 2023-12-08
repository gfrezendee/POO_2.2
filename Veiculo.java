public abstract class Veiculo {

    private String modelo;
    private double preco;

    public Veiculo() {
    }

    public Veiculo(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public abstract String getTipo();

    public abstract String getDetalhes();

    public void printDados() {
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Detalhes:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Preço: R$ " + this.getPreco());
    }
}
