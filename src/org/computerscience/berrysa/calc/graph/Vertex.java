package org.computerscience.berrysa.calc.graph;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author berrysa
 */
public class Vertex {
    private List<Vertex> adjacentVertices;
    private int indegree; // # of incoming edges

    private Vertex(Builder builder) {
        adjacentVertices = builder.adjacentVertices;
        indegree = builder.indegree;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private List<Vertex> adjacentVertices;
        private int indegree;

        public Builder() {
            adjacentVertices = Lists.newArrayList();
        }

        public Vertex build() {
            return new Vertex(this);
        }

        public Builder addAdjacentVertex(Vertex vertex) {
            adjacentVertices.add(vertex);
            return this;
        }
    }

    public void incrementIndegree() {
        indegree++;
    }

    public void decrementIndegree() {
        indegree--;
    }

    public List<Vertex> getAdjacentVertices() {
        return adjacentVertices;
    }

    public int getIndegree() {
        return indegree;
    }
}
