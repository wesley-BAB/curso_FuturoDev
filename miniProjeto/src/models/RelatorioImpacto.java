package models;

public class RelatorioImpacto {
    //Definição de atributos
    public int arvoresPlantadas;
    public double reducaoCO2;

    // Metodo para exibir o relatório de impacto
    public void exibirRelatorio() {
        System.out.println("Árvores Plantadas: " + arvoresPlantadas);
        System.out.println("Redução de CO2: " + reducaoCO2 + " toneladas");
    }

    // Metodo getter para obter o número de árvores plantadas
    public int getArvoresPlantadas() {
        return arvoresPlantadas;
    }

    // Metodo setter para definir o número de árvores plantadas
    public void setArvoresPlantadas(int arvoresPlantadas) {
        this.arvoresPlantadas = arvoresPlantadas;
    }

    // Metodo getter para obter a redução de CO2 em toneladas
    public double getReducaoCO2() {
        return reducaoCO2;
    }

    // Metodo setter para definir a redução de CO2 em toneladas
    public void setReducaoCO2(double reducaoCO2) {
        this.reducaoCO2 = reducaoCO2;
    }
}
