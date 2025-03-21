package models;

public class ProjetoEnergiaRenovavel extends ProjetoSustentavel {
    //Definição de atributos
    private double energiaGerada;

    //Construtor da classe
    public ProjetoEnergiaRenovavel(String nome, String descricao, double energiaGerada) {
        super(nome, descricao);
        this.energiaGerada = energiaGerada;
    }

    public double getEnergiaGerada() {
        return energiaGerada;
    }

    public void setEnergiaGerada(double energiaGerada) {
        this.energiaGerada = energiaGerada;
    }

    //Metodo sobrescrevendo o definindo na interface
    @Override
    public double calcularImpacto() {
        return energiaGerada * 0.8; // Exemplo: cada MWh evita 0.8 toneladas de CO₂.
    }
}

