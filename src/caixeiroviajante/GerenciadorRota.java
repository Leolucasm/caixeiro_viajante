package caixeiroviajante;

import java.util.ArrayList;

public class GerenciadorRota {
    
    private static ArrayList<Cidade> cidades = new ArrayList<>();
    
    public static void addCidade(Cidade cidade){
        cidades.add(cidade);
    }
    
    public static Cidade getCidade(int index){
        return cidades.get(index);        
    }
    
    public static int qtdCidades(){
        return cidades.size();
    }
    
}
