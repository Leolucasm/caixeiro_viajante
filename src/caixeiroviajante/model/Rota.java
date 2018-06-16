package caixeiroviajante.model;

import caixeiroviajante.control.GerenciadorRota;
import java.util.ArrayList;
import java.util.Collections;

public class Rota {

    ArrayList<Cidade> rota_aux = new ArrayList<>();
    private double fitness = 0;
    private double distancia = 0;

    public Rota() {
        //Inicializa a rota em branco, caso não seja passado uma rota por parâmetro no construtor
        for (int i = 0; i < GerenciadorRota.qtdCidades(); i++) {
            rota_aux.add(null);
        }
    }

    public Rota(ArrayList<Cidade> rota) {
        this.rota_aux = rota;
    }

    public void geraRota() {
        for (int i = 0; i < GerenciadorRota.qtdCidades(); i++) {
            setCidade(i, GerenciadorRota.getCidade(i));
        }
        Collections.shuffle(rota_aux);
    }

    public Cidade getCidade(int index) {
        return rota_aux.get(index);
    }

    public void setCidade(int posicao, Cidade cidade) {
        rota_aux.set(posicao, cidade);
        fitness = 0;
        distancia = 0;
    }

    public double getFitness() {
        if (fitness == 0) {
            fitness = 1 / (double) this.getDistancia();
        }
        return fitness;
    }

    public double getDistancia() {
        if (distancia == 0) {
            double distancia_rota = 0;

            for (int i = 0; i < this.tamanhoRota(); i++) {
                Cidade cidade_origem = getCidade(i);
                Cidade cidade_destino;

                if (i + 1 < this.tamanhoRota()) {
                    cidade_destino = getCidade(i + 1);
                } else {
                    cidade_destino = getCidade(0);
                }

                distancia_rota += cidade_origem.calculaDistancia(cidade_destino);
            }
            distancia = distancia_rota;
        }
        return distancia;
    }

    public int tamanhoRota() {
        return rota_aux.size();
    }

    //Verifica se a cidade já existe
    public boolean encontraCidade(Cidade cidade) {
        return rota_aux.contains(cidade);
    }

    public boolean ehIgual(Object object) {
        Rota rota2;

        if (object instanceof Rota) {
            rota2 = (Rota) object;
        } else {
            return false;
        }

        if (this.tamanhoRota() == rota2.tamanhoRota()) {
            Cidade cidade1, cidade2;

            for (int i = 0; i < this.tamanhoRota(); i++) {
                cidade1 = getCidade(i);
                cidade2 = rota2.getCidade(i);

                if (!cidade1.equals(cidade2)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String nova_string = new String();
        for (int i = 0; i < tamanhoRota(); i++) {
            if (i == (tamanhoRota() - 1)) {
                nova_string += getCidade(i);
            } else {
                nova_string += getCidade(i) + " -> ";
            }
        }

        return nova_string;
    }
}
