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

    public void conectarVertices(int indiceVerticeInicial, int indiceVerticeFinal){
        Vertice verticeInicial = vertices.get(indiceVerticeInicial);
        Vertice verticeFinal = vertices.get(indiceVerticeFinal);
        if(indiceVerticeInicial == indiceVerticeFinal) {
            matriz[indiceVerticeInicial][indiceVerticeInicial] = 1;
            verticeInicial.addGrau(2);
        } else {
            matriz[indiceVerticeInicial][indiceVerticeFinal] = 1;
            verticeInicial.addGrau(1);
            matriz[indiceVerticeFinal][indiceVerticeInicial] = 1;
            verticeFinal.addGrau(1);
        }

    }
}
