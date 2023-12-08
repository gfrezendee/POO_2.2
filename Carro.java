public class Carro extends Veiculo {

    private int ano;
    private double km;

    public Carro() {
    }

    public Carro(String modelo, double preco, int ano, double km) {
        super(modelo, preco);
        this.ano = ano;
        this.km = km;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    @Override
    public String getTipo() {
        return "Carro";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + "\n" +
                "Ano: " + this.getAno() + "\n" +
                "Km: " + this.getKm();
    }

    public double getPrecoComReajuste() {
        if (this.ano >= 2008) {
            return this.preco * 1.1;
        }
        return this.preco;
    }
}
