package util;

import exception.QtdeMaximaException;
import graphs.Grafo;
import graphs.MatrizAdjacencia;
import graphs.Vertice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Principal {

    public static void main(String[] args) {

        Grafo grafo = new Grafo(6);

        try {
            grafo.addVertice("A");
            grafo.addVertice("B");
            grafo.addVertice("C");
            grafo.addVertice("D");
            grafo.addVertice("E");
            grafo.addVertice("F");
//            grafo.addVertice("G");
        } catch (QtdeMaximaException e) {
            throw new RuntimeException(e);
        }

    }
}
