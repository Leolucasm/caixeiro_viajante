package caixeiroviajante;

public class AlgoritmoGenetico {
    private static final double taxa_mutacao = 0.0015;
    private static final int numero_rotas = 5;
    private static final boolean elitismo = true;
    private static int mutacoes = 0;
    
    
    public static Populacao evoluirPopulacao(Populacao populacao){
        Populacao nova_populacao = new Populacao(populacao.tamanhoPopulacao(), false);
        
        int aux = 0;
        
        if(elitismo){
            nova_populacao.salvarRota(aux, populacao.getMelhorRota());
            aux = 1;
        }
        
        for (int i = aux; i < nova_populacao.tamanhoPopulacao(); i++) {
            
            Rota rota1 = selecaoRota(populacao);
            Rota rota2 = selecaoRota(populacao);
            
            //Cria a rota descendente
            Rota rota_filha = crossover(rota1, rota2);
            nova_populacao.salvarRota(i, rota_filha);            
        }
        
        mutacoes = 0;
        for (int i = aux; i < nova_populacao.tamanhoPopulacao(); i++) {
            aplicaMutacao(nova_populacao.getRota(i));
        }
        return nova_populacao;        
    }
    
    public static Rota crossover(Rota rota1, Rota rota2)   {
        Rota nova_rota = new Rota();
        
        int posicao_inicio = (int)(Math.random() * rota1.tamanhoRota());
        int posicao_fim = (int)(Math.random() * rota2.tamanhoRota());
        
        //Percorre e adiciona a sub-rota vinda do primeiro pai ao filho
        for (int i = 0; i < nova_rota.tamanhoRota(); i++) {                       
            if(posicao_inicio < posicao_fim && i > posicao_inicio && i < posicao_fim){
                nova_rota.setCidade(i, rota1.getCidade(i));
            } else if(posicao_inicio > posicao_fim){
                if(!(i < posicao_inicio && i > posicao_fim)){
                    nova_rota.setCidade(i, rota1.getCidade(i));
                }
                
            }
        }
        
        //Percorre a rota do segundo pai e adiciona as cidades restantes ao filho
        for (int i = 0; i < rota2.tamanhoRota(); i++) {
            if(!nova_rota.encontraCidade(rota2.getCidade(i))){
                for (int j = 0; j < nova_rota.tamanhoRota(); j++) {
                    //Adiciona a cidade
                    if(nova_rota.getCidade(j) == null){
                        nova_rota.setCidade(j, rota2.getCidade(i));
                        break;
                    }
                }
            }
        }
        
        return nova_rota;
    }
    
    private static void aplicaMutacao(Rota rota){
        for (int i = 0; i < rota.tamanhoRota(); i++) {
            if(Math.random() < taxa_mutacao){
                mutacoes++;
                
                int pos_cidade_2 = (int)(rota.tamanhoRota() * Math.random());
                
                Cidade cidade1 = rota.getCidade(i);
                Cidade cidade2 = rota.getCidade(pos_cidade_2);
                
                rota.setCidade(pos_cidade_2, cidade1);
                rota.setCidade(i, cidade2);
                
                
            }
            
        }
    }
    
    private static Rota selecaoRota(Populacao populacao){
        Populacao populacao_aux = new Populacao(numero_rotas, false);
        
        for (int i = 0; i < numero_rotas; i++) {
            int id_aleatorio = (int)(Math.random() * populacao.tamanhoPopulacao());
            populacao_aux.salvarRota(i, populacao.getRota(id_aleatorio));            
        }
        
        Rota melhor_rota = populacao_aux.getMelhorRota();
        return melhor_rota;
    }
    
    public static int getMutacoes(){
        return mutacoes;
    }
    
    
    
}
