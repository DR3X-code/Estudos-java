package basico_02.abstracao;

public abstract class FormaGeometrica {

    protected String cor;
    protected int quantidadeDeLados;

    public FormaGeometrica(String cor, int quantidadeDeLados) {
        this.cor = cor;
        this.quantidadeDeLados = quantidadeDeLados;
    }

    public String getCor() {
        return cor;
    }

    public int getQuantidadeDeLados() {
        return quantidadeDeLados;
    }
}
