package util;

import graphs.MatrizAdjacencia;
import graphs.Vertice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.List.*;

public class Principal {

    public static void main(String[] args) {
        Vertice v1 = new Vertice("A");

        List<Vertice> vertices = new ArrayList<>(
                Arrays.asList(
                        new Vertice("A"),
                        new Vertice("B"),
                        new Vertice("C"),
                        new Vertice("D")
                )
        );

        MatrizAdjacencia matriz = new MatrizAdjacencia(vertices);
        matriz.conectarVertices(0, 1);
        matriz.conectarVertices(0, 2);
        matriz.conectarVertices(1, 2);
        matriz.conectarVertices(1, 3);

        System.out.println("Grau A: " + vertices.get(0).getGrau());
        System.out.println("Grau B: " + vertices.get(1).getGrau());
        System.out.println("Grau C: " + vertices.get(2).getGrau());
        System.out.println("Grau D: " + vertices.get(3).getGrau());

    }
}