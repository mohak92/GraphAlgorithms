package com.mohak.adjacencyList;

public class App {
	
	public static void main(String[] args) {
		
		// adjacency list representation
		Vertex a = new Vertex("A");
		Vertex b = new Vertex("B");
		Vertex c = new Vertex("C");
		Vertex d = new Vertex("D");
		
		a.addNeighbour(b);
		a.addNeighbour(c);
		b.addNeighbour(d);
		
		// print all neighbours
		a.showNeighbour();
		b.showNeighbour();
		c.showNeighbour();
		d.showNeighbour();
		
	}

}
