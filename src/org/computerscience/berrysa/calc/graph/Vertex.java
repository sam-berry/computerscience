package org.computerscience.berrysa.calc.graph;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author berrysa
 */
public class Vertex {
    private final String id;
    private final List<Vertex> adjacentVertices;
    private int indegree; // # of incoming edges

    public Vertex(String id) {
        this.id = id;
        adjacentVertices = Lists.newArrayList();
        indegree = 0;
    }

    public void incrementIndegree() {
        indegree++;
    }

    public void decrementIndegree() {
        indegree--;
    }

    public Vertex addConnection(Vertex vertex) {
        vertex.incrementIndegree();
        adjacentVertices.add(vertex);
        return this;
    }

    public String getId() {
        return id;
    }

    public List<Vertex> getAdjacentVertices() {
        return adjacentVertices;
    }

    public int getIndegree() {
        return indegree;
    }
}
