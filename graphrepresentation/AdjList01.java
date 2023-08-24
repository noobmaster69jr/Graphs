package graphrepresentation;

import java.util.ArrayList;

public class AdjList01 {
	static class Graph {
		int V;
		ArrayList<Integer>[] list;

		public Graph(int v) {
			this.V = v;
			list = new ArrayList[v];
			for (int i = 0; i < v; i++) {
				list[i] = new ArrayList<Integer>();
			}
		}

		public void addEdge(int i, int j, boolean unDirected) {
			list[i].add(j);
			if (unDirected) {
				list[j].add(i);
			}
		}

		public void printAdjList() {
			for (int i = 0; i < V; i++) {
				// traverse through every rows
				System.out.print(i + "--> ");

				for (int vertex : list[i]) {
					System.out.print(vertex + " ");
				}
				System.out.println();
			}

		}
	}

	public static void main(String[] args) {
		Graph g = new Graph(4);
		g.addEdge(0, 1, true);
		g.addEdge(0, 2, true);
		g.addEdge(0, 3, true);
		g.addEdge(1, 2, true);
	}
}
