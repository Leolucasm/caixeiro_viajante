package caixeiroviajante.model;

public class Populacao {
    Rota[] rotas;

    public Populacao(int tamanhoPopulacao, boolean inicializar) {
        rotas = new Rota[tamanhoPopulacao];        
        if(inicializar){
            for (int i = 0; i < tamanhoPopulacao; i++) {
                Rota nova_rota = new Rota();
                nova_rota.geraRota();     
                salvarRota(i, nova_rota);                
            }
        }
    }
    
    public Rota getRota(int index){
        return rotas[index];
    }
    
    public void salvarRota(int index, Rota rota){
        rotas[index] = rota;
    }
    
    public int tamanhoPopulacao(){
        return rotas.length;
    }
    
    //Retorna a melhor rota
    public Rota getMelhorRota(){
        Rota melhor_rota = getRota(0);
        
        for (int i = 0; i < this.tamanhoPopulacao(); i++) {
            if (melhor_rota.getFitness() <= getRota(i).getFitness()) {
                melhor_rota = getRota(i);   
            }            
        }
        
        return melhor_rota;                
    }
}
