package DFSAppPack;
/**
 * hirsova to oradea
 * @author nikos
 */
class DFSApp {
    public static void main (String [] args) {
        
        Graph theGraph = new Graph();           //we create object the
        theGraph.addVertex("Hirsova, ");        // 0  (start for dfs)
        theGraph.addVertex("Eforie, ");         // 1
        theGraph.addVertex("urziceni, ");       // 2
        theGraph.addVertex("Vaslui, ");         // 3
        theGraph.addVertex("Lasi, ");           // 4
        theGraph.addVertex("Neamt, ");          // 5
        theGraph.addVertex("Bucharest, ");      // 6
        theGraph.addVertex("Giurgiu, ");        // 7
        theGraph.addVertex("Piltesti, ");       // 8
        theGraph.addVertex("Fagaras, ");        // 9
        theGraph.addVertex("Craiova, ");        // 10
        theGraph.addVertex("Rimnicu Vilcea, "); // 11
        theGraph.addVertex("Sibiu, ");          // 12
        theGraph.addVertex("Dobreta, ");        // 13
        theGraph.addVertex("Mehadia, ");        // 14
        theGraph.addVertex("Lugoj, ");          // 15
        theGraph.addVertex("Timisoara, ");      // 16
        theGraph.addVertex("Arad, ");           // 17
        theGraph.addVertex("Zerind, ");         // 18
        theGraph.addVertex("Oradea, ");         // 19

        theGraph.addEdge(0, 1);
        theGraph.addEdge(0, 2);     
        theGraph.addEdge(2, 3);     
        theGraph.addEdge(2, 6);      
        theGraph.addEdge(3, 4);      
        theGraph.addEdge(4, 5);      
        theGraph.addEdge(6, 9);      
        theGraph.addEdge(6, 7);       
        theGraph.addEdge(6, 8);      
        theGraph.addEdge(10, 8);     
        theGraph.addEdge(10, 11);       
        theGraph.addEdge(8, 11);     
        theGraph.addEdge(9, 12);      
        theGraph.addEdge(10, 13);      
        theGraph.addEdge(13, 14);   
        theGraph.addEdge(14, 15);   
        theGraph.addEdge(15, 16);     
        theGraph.addEdge(16, 17);    
        theGraph.addEdge(17, 18);     
        theGraph.addEdge(18, 19);     
        theGraph.addEdge(19, 12);      
        theGraph.addEdge(12, 17); 

        System.out.print("Visits: ");
        theGraph.dfs();             // depth-first search
        System.out.println();
    }
}
