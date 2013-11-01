package org.computerscience.berrysa.calc.graph;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author berrysa
 */
public class Main {
    public static void main(String[] args) {
        Vertex v1 = new Vertex("v1");
        Vertex v2 = new Vertex("v2");
        Vertex v3 = new Vertex("v3");
        Vertex v4 = new Vertex("v4");
        Vertex v5 = new Vertex("v5");
        Vertex v6 = new Vertex("v6");
        Vertex v7 = new Vertex("v7");

        v1.addConnection(v2).addConnection(v3);
        v2.addConnection(v5).addConnection(v4);
        v3.addConnection(v6);
        v4.addConnection(v7).addConnection(v6);
        v5.addConnection(v4).addConnection(v7);
        //v6 no connections
        v7.addConnection(v6);

        List<Vertex> path = findShortestPath(v1, v7);
        printPath(path);
    }

    private static void printPath(List<Vertex> path) {
        if (path.isEmpty()) {
            System.out.println("No Path");
        } else {
            for (Vertex vertex : path) {
                System.out.print(vertex.getId());
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static List<Vertex> findShortestPath(Vertex a, Vertex b) {
        if (a.getAdjacentVertices().isEmpty()) {
            return Lists.newArrayList();
        } else if (a.getAdjacentVertices().contains(b)) {
            return Lists.newArrayList(a, b);
        } else {
            List<List<Vertex>> possiblePaths = Lists.newArrayList();
            for (Vertex vertex : a.getAdjacentVertices()) {
                possiblePaths.add(findShortestPath(vertex, b));
            }

            List<Vertex> shortestPath = Lists.newArrayList();
            if (!possiblePaths.isEmpty()) {
                for (List<Vertex> possiblePath : possiblePaths) {
                    if (shortestPath.isEmpty() || (possiblePath.size() < shortestPath.size() && !possiblePath.isEmpty())) {
                        shortestPath = possiblePath;
                    }
                }
            }

            if (!shortestPath.isEmpty()) {
                shortestPath.add(0, a);
            }
            return shortestPath;
        }
    }

    // todo: findLongestPath
}
