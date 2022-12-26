import java.util.*;
class ps_assignment {
		    private static void function(int[][] adjmat,int source,int destination)
		    {
		        int vertices = adjmat[0].length;
		        int[] distance = new int[vertices];
		        boolean[] visited = new boolean[vertices];
		        for (int vertexIndex = 0; vertexIndex < vertices;vertexIndex++)
		        {
		            distance[vertexIndex] = Integer.MAX_VALUE;
		            visited[vertexIndex] = false;
		        }
		        distance[source] = 0;
		        int[] parent = new int[vertices];
		        parent[source] = -1;
		        for (int i = 1; i < vertices; i++)
		        {
		            int nearestVertex = -1;
		            int sd = Integer.MAX_VALUE;
		            for (int vertexIndex = 0;vertexIndex < vertices;vertexIndex++)
		            {
		                if (!visited[vertexIndex] &&distance[vertexIndex] < sd)
		                {
		                    nearestVertex = vertexIndex;
		                    sd = distance[vertexIndex];
		                }
		            }
		            visited[nearestVertex] = true;
		            for (int vertexIndex = 0;vertexIndex < vertices;vertexIndex++)
		            {
		                int edge = adjmat[nearestVertex][vertexIndex];
		                 
		                if (edge > 0 && ((sd + edge) < distance[vertexIndex]))
		                {
		                    parent[vertexIndex] = nearestVertex;
		                    distance[vertexIndex] = sd +
		                                                       edge;
		                }
		            }
		        }
		 
		        printSolution(source, distance, parent,destination);
		    }
		    private static void printSolution(int source,int[] distances,int[] parent,int destination)
		    {
		        int Vertices = distances.length;
		        System.out.print("Vertex\t Distance\tPath");
		         
		        for (int vertexIndex = 0;
		                 vertexIndex < Vertices;
		                 vertexIndex++)
		        {
		            if (vertexIndex != source)
		            {
		                System.out.print("\n" + source + " -> ");
		                System.out.print(vertexIndex + " \t\t ");
		                System.out.print(distances[vertexIndex] + "\t\t");
		                printPath(vertexIndex, parent);
		            }
		        }
		        System.out.println();
		        System.out.print("Requested Path : \n"+source+"->"+destination+"\t\t"+distances[destination]+"\t\t");
		        printPath(destination,parent);
		    }
		    private static void printPath(int currentVertex,int[] parents)
		    {
		        if (currentVertex == -1)
		        {
		            return;
		        }
		        printPath(parents[currentVertex], parents);
		        System.out.print(currentVertex + " ");
		    }
		    public static void main(String[] args)
		    {
		    	Scanner sc=new Scanner(System.in);
		    	System.out.println("Enter source Location");
		    	int source=sc.nextInt();
		    	System.out.println("Enter Destination Location");
		    	int destination=sc.nextInt();
		        int[][] adjmat = {{0,2,3,0},{2,0,0,2},{3,0,0,6},{0,2,6,0}};
		        function(adjmat, source,destination);
		    }
		}
