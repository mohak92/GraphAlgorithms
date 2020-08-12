package com.mohak.breadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
	
	public void traverse(Vertex root) {
		
		Queue<Vertex> queue = new LinkedList<>();
		
		root.setVisited(true);
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			Vertex actualVertex = queue.poll();
			System.out.println("Actual vertex visited: " + actualVertex);
			
			for(Vertex v : actualVertex.getAdjacencyList()) {
				if(!v.isVisited()) {
					v.setVisited(true);
					queue.add(v);
				}
			}
		}
		
	}

}
