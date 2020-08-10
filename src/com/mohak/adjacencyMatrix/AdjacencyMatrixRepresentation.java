package com.mohak.adjacencyMatrix;

public class AdjacencyMatrixRepresentation {

	private static int[][] adjacencyMatrix = { 
			{ 0, 2, 4, 0 }, // Vertex A
			{ 0, 0, 0, 3 }, // Vertex B
			{ 0, 0, 0, 0 }, // Vertex C
			{ 0, 0, 0, 0 }  // Vertex D
	};

	public static void main(String[] args) {
		
		//find all edges O(N^2) quadratic running time
		for(int i = 0;i < adjacencyMatrix.length;i++) {
			for(int j = 0;j < adjacencyMatrix.length;j++) {
				if(adjacencyMatrix[i][j] != 0) {
					System.out.println("Edge with weight: " + adjacencyMatrix[i][j]);
				}
			}
		}
		
		// if you know the vertices the lookup is O(1)
		// is there a connection between node A and C if yes return value > 0
		// else return 0
		System.out.println(adjacencyMatrix[0][2]);
	}

}
