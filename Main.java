import graph.undirected.weighted.WeightedGraph;

public class Main {
	public static void main(String[] args) {
		WeightedGraph weightedGraph = new WeightedGraph();

		weightedGraph.addVertex("0");
		weightedGraph.addVertex("01");
		weightedGraph.addVertex("02");
		weightedGraph.addVertex("03");
		weightedGraph.addVertex("04");
		weightedGraph.addVertex("05");
		weightedGraph.addVertex("06");



		weightedGraph.addEdge("0","01",50);
		weightedGraph.addEdge("0","02",60);
		weightedGraph.addEdge("01","0",50);
		weightedGraph.addEdge("01","03",120);
		weightedGraph.addEdge("01","04",90);
		weightedGraph.addEdge("02","0",60);
		weightedGraph.addEdge("02","5",50);
		weightedGraph.addEdge("03","01",120);
		weightedGraph.addEdge("03","05",80);
		weightedGraph.addEdge("03","06",70);
		weightedGraph.addEdge("04","01",90);
		weightedGraph.addEdge("04","06",40);
		weightedGraph.addEdge("05","02",50);
		weightedGraph.addEdge("05","03",80);
		weightedGraph.addEdge("05","06",140);
		weightedGraph.addEdge("06","03",70);
		weightedGraph.addEdge("06","04",40);
		weightedGraph.addEdge("06","05",140);
		weightedGraph.printGraph();

	}

	}
