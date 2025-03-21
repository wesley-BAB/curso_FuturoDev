import models.*;

public class Main {
    public static void main(String[] args) {
        /*

        // Criar organização
        Organizacao organizacao = new Organizacao("FuturoDev Sustentável");

        // Criar projetos sustentáveis
        ProjetoSustentavel projeto1 = new ProjetoSustentavel("Projeto 1", "Árvores Plantadas");
        ProjetoSustentavel projeto2 = new ProjetoSustentavel("Projeto 2", "Redução de CO2");

        // Adicionar projetos à organização
        organizacao.adicionarProjeto(projeto1);
        organizacao.adicionarProjeto(projeto2);

        // Criar voluntários
        Voluntario voluntario1 = new Voluntario("Wesley Benevides", "wesley.bene16@gmail.com");
        Voluntario voluntario2 = new Voluntario("Marcelo Sombrio", "marcelo@gmail.com");

        // Adicionar voluntários aos projetos
        projeto1.adicionarVoluntario(voluntario1);
        projeto2.adicionarVoluntario(voluntario2);

        // Gerar relatórios de impacto para os projetos
        projeto1.gerarRelatorioImpacto(500, 25.0);
        projeto2.gerarRelatorioImpacto(200, 10.0);

        // Listar projetos da organização
        System.out.println("Organização: " + organizacao.nome);
        organizacao.listarProjetos();

        // Exibir relatórios de impacto dos projetos
        System.out.println("\nRelatório de Impacto: " + projeto1.nome + " - " + projeto1.descricao);
        projeto1.getRelatorioImpacto().exibirRelatorio();

        System.out.println("\nRelatório de Impacto: " + projeto2.nome + " - " + projeto2.descricao);
        projeto2.getRelatorioImpacto().exibirRelatorio();
        */

        // Criar voluntários
        Voluntario voluntario1 = new Voluntario("Wesley Benevides", "wesley.bene16@gmail.com");
        Voluntario voluntario2 = new Voluntario("Marcelo Sombrio", "marcelo@gmail.com");

        // Criar projetos sustentáveis
        ProjetoReflorestamento projeto1 = new ProjetoReflorestamento("Reflorestamento", "Plantação de árvores nativas", 1000);
        ProjetoReciclagem projeto2 = new ProjetoReciclagem("Reciclagem Urbana", "Reciclagem de resíduos sólidos", 20.5);
        ProjetoEnergiaRenovavel projeto3 = new ProjetoEnergiaRenovavel("Solar Power", "Produção de energia solar", 300.0);

        // Exibir impacto de cada projeto
        System.out.println(projeto1.getNome() + " - Impacto: " + projeto1.calcularImpacto() + " toneladas de CO₂ reduzido");
        System.out.println(projeto2.getNome() + " - Impacto: " + projeto2.calcularImpacto() + " toneladas de CO₂ reduzido");
        System.out.println(projeto3.getNome() + " - Impacto: " + projeto3.calcularImpacto() + " toneladas de CO₂ reduzido");

        // Usado um separador para visualizar parte final do Projeto
        System.out.println("\n --------------------- Parte Final --------------------- \n");

        //Criar EMpresa/Ong
        ONG ong = new ONG("ONG - FuturoDEV");
        Empresa empresa = new Empresa("Empresa - FuturoDev", "00.000.000.0000/00");

        // Criar projetos
        ProjetoReflorestamento p1 = new ProjetoReflorestamento("Reflorestamento Joinville", "Plantação de árvores", 5000);
        ProjetoReciclagem p2 = new ProjetoReciclagem("Reciclagem cidade Joinville", "Coleta seletiva", 25.5);
        ProjetoEnergiaRenovavel p3 = new ProjetoEnergiaRenovavel("FuturoSolarDev", "Energia solar", 800);

        // Adicionar projetos às organizações
        ong.adicionarProjeto(p1);
        empresa.adicionarProjeto(p2);
        empresa.adicionarProjeto(p3);

        // Listar projetos da ONG
        System.out.println("Projetos da ONG: " + ong.getNome());
        ong.listarProjetos();

        // Listar projetos da Empresa
        System.out.println("\nProjetos da Empresa: " + empresa.getNome());
        empresa.listarProjetos();

    }
}
