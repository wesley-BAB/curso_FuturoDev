package models;

public class ProjetoReciclagem extends ProjetoSustentavel {
    //Definição de atributos
    private double toneladasRecicladas;

    //Construtor da classe
    public ProjetoReciclagem(String nome, String descricao, double toneladasRecicladas) {
        super(nome, descricao);
        this.toneladasRecicladas = toneladasRecicladas;
    }

    public double getToneladasRecicladas() {
        return toneladasRecicladas;
    }

    public void setToneladasRecicladas(double toneladasRecicladas) {
        this.toneladasRecicladas = toneladasRecicladas;
    }

    //Metodo sobrescrevendo o definindo na interface
    @Override
    public double calcularImpacto() {
        return toneladasRecicladas * 1.2; // Exemplo: cada tonelada reciclada evita 1.2 toneladas de CO₂.
    }
}
