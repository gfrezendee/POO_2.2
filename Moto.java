public class Moto extends Veiculo {

    private int cilindradas;

    public Moto() {
    }

    public Moto(String modelo, double preco, int cilindradas) {
        super(modelo, preco);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String getTipo() {
        return "Moto";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + "\n" +
                "Cilindradas: " + this.getCilindradas();
    }
}
