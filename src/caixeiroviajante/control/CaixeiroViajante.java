package caixeiroviajante.control;

import caixeiroviajante.model.Populacao;
import caixeiroviajante.model.Cidade;

public class CaixeiroViajante {
    
    public static Populacao gerarPopulacaoAleatoria(){
        int x;
        int y;
        
        for (int i = 0; i < 25; i++) {
            x = (int) (Math.random() * 200 + i);
            y = (int) (Math.random() * 200 + i);
            Cidade nova_cidade = new Cidade("Cidade " + i, x, y);
            GerenciadorRota.addCidade(nova_cidade);
        }                
        
        Populacao populacao = new Populacao(50, true);
        
        return populacao;
    }
    
    public static Populacao aplicaAlgoritmoGenetico(Populacao populacao){
        int geracoes_sem_melhoras = 0;
        boolean continuar = true;
        Populacao populacao_anterior = populacao;
        
        while(continuar){
         populacao_anterior = populacao;
            populacao = AlgoritmoGenetico.evoluirPopulacao(populacao);
            
            if(populacao_anterior.getMelhorRota().getFitness() >= populacao.getMelhorRota().getFitness()){
                geracoes_sem_melhoras++;
            } else{
                geracoes_sem_melhoras = 0;
            }
            
            if(geracoes_sem_melhoras >= 50){
                continuar = false;
            }   
        }                
        
        return populacao;
    }            
}
