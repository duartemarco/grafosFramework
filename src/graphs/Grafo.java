package graphs;

import exception.QtdeMaximaException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grafo {
    private int qtdeMaximaVertices;
    private int qtdeAtualVertices;
    private List<Vertice> vertices;
    private MatrizAdjacencia matrizAdjacencia;
    private Map<String, Integer> rotuloEmIndice;

    public Grafo(int qtde) throws IllegalArgumentException {
        if(qtde <= 0) {
            throw new IllegalArgumentException("Informe uma quantidade de vértices válida");
        }
        this.qtdeMaximaVertices = qtde;
        this.vertices = new ArrayList<>();
        this.rotuloEmIndice = new HashMap<>();
    }

    public void addVertice(String rotulo) throws QtdeMaximaException {
        if(qtdeAtualVertices > qtdeMaximaVertices -1) { //verifica
            throw new QtdeMaximaException("Não é possível adicionar mais vértices");
        }
        Vertice vertice = new Vertice(rotulo); //cria o vértice
        this.vertices.add(vertice); //adiciona na lista
        this.rotuloEmIndice.put(rotulo, qtdeAtualVertices); //adiciona no hashmap e adiciona rotulo
        qtdeAtualVertices++;
    }

}
