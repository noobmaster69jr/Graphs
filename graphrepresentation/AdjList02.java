package graphrepresentation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AdjList02 {
	static class Node {
		String name;
		ArrayList<String> list;

		public Node(String name) {
			this.name = name;
			list = new ArrayList<>();
		}

	}

	static class Graph {
		HashMap<String, Node> hm;

		Graph(ArrayList<String> cities) {
			hm = new HashMap<>();
			for (String city : cities) {
				hm.put(city, new Node(city));
			}
		}

		public void addEdge(String x, String y, boolean unDirected) {
			hm.get(x).list.add(y);
			if (unDirected) {
				hm.get(y).list.add(x);
			}
		}

		public void printAdjList() {
			for (Map.Entry<String, Node> cityPair : hm.entrySet()) {
				System.out.print(cityPair.getKey() + " --> ");
				for (String list : cityPair.getValue().list) {
					System.out.print(list + ", ");
				}
				System.out.println();
			}

		}

	}

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Delhi");
		cities.add("London");
		cities.add("Paris");
		cities.add("New York");

		Graph g = new Graph(cities);
		g.addEdge("Delhi", "London", true);
		g.addEdge("New York", "London", true);
		g.addEdge("Delhi", "Paris", true);
		g.addEdge("Paris", "New York", true);

		g.printAdjList();
	}

}
