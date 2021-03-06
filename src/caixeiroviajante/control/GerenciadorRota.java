package caixeiroviajante.control;

import caixeiroviajante.model.Cidade;
import java.util.ArrayList;

public class GerenciadorRota {
    
    private static ArrayList<Cidade> cidades = new ArrayList<>();
    
    public static void addCidade(Cidade cidade){
        cidades.add(cidade);        
    }        
    
    public static Cidade getCidade(int index){
        return cidades.get(index);        
    }
    
    public static String removeCidade(int index){
        Cidade cidade = cidades.remove(index);
        return cidade.toString();
    }
    
    public static boolean removeTodasCidades(){
        cidades.clear();
        return cidades.isEmpty();
    }
    
    public static int qtdCidades(){
        return cidades.size();
    }
    
}
