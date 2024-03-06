package graphs;

import java.util.List;

public class MatrizAdjacencia {

    private int matriz[][];
    private int qteVertices;
    private List<Vertice> vertices;

    public MatrizAdjacencia(List<Vertice> vertices){
        this.vertices = vertices;
        this.qteVertices = vertices.size();
        this.matriz = new int[qteVertices][qteVertices];
    }
}
