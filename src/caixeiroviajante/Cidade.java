package caixeiroviajante;

public class Cidade {
    
    private int x;
    private int y;
    private String nome;

    public Cidade(String nome, int x, int y) {
        this.x = x;
        this.y = y;
        this.nome = nome;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getNome() {
        return nome;
    }
    
    //Calcula a distancia entre duas cidades
    public double calculaDistancia(Cidade cidade){
        int diferenca_x = Math.abs(this.x - cidade.getX());
        int diferenca_y = Math.abs(this.y - cidade.getY());
        return (Math.sqrt(Math.pow(diferenca_x, 2) + Math.pow(diferenca_y, 2)));        
    }
    
    @Override
    public String toString(){
        return this.getNome()+" ("+ this.getX() + ", " + this.getY() + ")";
    }
    
}
