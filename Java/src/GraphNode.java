public class GraphNode {

	int key;
	State state;
	
	public GraphNode(int k)
	{
		this.key = k;
		this.state = State.UNVISITED;
	}
}

enum State {
	UNVISITED, VISITED, PROCESSED
}