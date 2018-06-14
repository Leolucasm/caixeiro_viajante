package caixeiroviajante;

public class CaixeiroViajante {
    
    public static Populacao gerarPopulacaoAleatoria(){
        Cidade cidade = new Cidade("Lisboa", 60, 200);
        GerenciadorRota.addCidade(cidade);
        Cidade cidade2 = new Cidade("Santarém", 180, 200);
        GerenciadorRota.addCidade(cidade2);
        Cidade cidade3 = new Cidade("Braga", 80, 180);
        GerenciadorRota.addCidade(cidade3);
        Cidade cidade4 = new Cidade("Bragança", 140, 180);
        GerenciadorRota.addCidade(cidade4);
        Cidade cidade5 = new Cidade("Porto", 20, 160);
        GerenciadorRota.addCidade(cidade5);
        Cidade cidade6 = new Cidade("Portalegre", 100, 160);
        GerenciadorRota.addCidade(cidade6);
        Cidade cidade7 = new Cidade("Viseu", 200, 160);
        GerenciadorRota.addCidade(cidade7);
        Cidade cidade8 = new Cidade("Setúbal", 140, 140);
        GerenciadorRota.addCidade(cidade8);
        Cidade cidade9 = new Cidade("Samora", 40, 120);
        GerenciadorRota.addCidade(cidade9);
        Cidade cidade10 = new Cidade("Beja", 100, 120);
        GerenciadorRota.addCidade(cidade10);
        Cidade cidade11 = new Cidade("Aveiro", 180, 100);
        GerenciadorRota.addCidade(cidade11);
        Cidade cidade12 = new Cidade("Barcelos", 60, 80);
        GerenciadorRota.addCidade(cidade12);
        Cidade cidade13 = new Cidade("Faro", 120, 80);
        GerenciadorRota.addCidade(cidade13);
        Cidade cidade14 = new Cidade("Guimarães", 180, 60);
        GerenciadorRota.addCidade(cidade14);
        Cidade cidade15 = new Cidade("Leiria", 20, 40);
        GerenciadorRota.addCidade(cidade15);
        Cidade cidade16 = new Cidade("Odivelas", 100, 40);
        GerenciadorRota.addCidade(cidade16);
        Cidade cidade17 = new Cidade("Sines", 200, 40);
        GerenciadorRota.addCidade(cidade17);
        Cidade cidade18 = new Cidade("Tonela", 200, 20);
        GerenciadorRota.addCidade(cidade18);
        Cidade cidade19 = new Cidade("Coimbra", 60, 20);
        GerenciadorRota.addCidade(cidade19);
        Cidade cidade20 = new Cidade("Almada", 160, 20);
        GerenciadorRota.addCidade(cidade20);
        Cidade cidade21 = new Cidade("Cascais", 150, 55);
        GerenciadorRota.addCidade(cidade21);
        Cidade cidade22 = new Cidade("Almeirim", 10, 20);
        GerenciadorRota.addCidade(cidade22);
        Cidade cidade23 = new Cidade("Chaves", 25, 85);
        GerenciadorRota.addCidade(cidade23);
        Cidade cidade24 = new Cidade("Faro", 185, 35);
        GerenciadorRota.addCidade(cidade24);
        Cidade cidade25 = new Cidade("Maia", 100, 95);
        GerenciadorRota.addCidade(cidade25);
        
        Populacao populacao = new Populacao(50, true);
        
        return populacao;
    }
    
    public static Populacao aplicaAlgoritmoGenetico(Populacao populacao){
        for (int i = 0; i < 200; i++) {
            populacao = AlgoritmoGenetico.evoluirPopulacao(populacao);
        }
        
        return populacao;
    }            
}
