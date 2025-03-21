package models;

public class ProjetoReflorestamento extends ProjetoSustentavel {
    //Definição de atributos
    private int arvoresPlantadas;

    //Construtor da classe
    public ProjetoReflorestamento(String nome, String descricao, int arvoresPlantadas) {
        super(nome, descricao);
        this.arvoresPlantadas = arvoresPlantadas;
    }

    public int getArvoresPlantadas() {
        return arvoresPlantadas;
    }

    public void setArvoresPlantadas(int arvoresPlantadas) {
        this.arvoresPlantadas = arvoresPlantadas;
    }

    //Metodo sobrescrevendo o definindo na interface
    @Override
    public double calcularImpacto() {
        return arvoresPlantadas * 0.5; // Exemplo: cada árvore reduz 0.5 toneladas de CO₂.
    }
}

