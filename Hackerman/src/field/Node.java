package field;

import java.awt.Point;
import java.util.ArrayList;

public class Node {
	
	Point point;
	ArrayList<Node> children;
	Node parent;
	private Node parents;
	
	public Node(Point x)
	{
		this.point = x;
		children = new ArrayList<Node>();
	}
	
	public Node(Point x, ArrayList<Node> children)
	{
		this.point = x;
		this.children = children;
	}
	
	public Node(Point x, ArrayList<Node> chidlren, Node parent)
	{
		this.point = x;
		this.children = children;
		this.parents = parent;
	}
	
	public ArrayList<Node> getChildren()
	{
		return children;
	}
	
	public void setChildren(ArrayList<Node> children)
	{
		this.children = children;
	}
	
	public boolean equals(Object x)
	{
		Node check = (Node)x;
		//System.err.print(this.point + " " + check.point);
		return(check.point.equals(this.point));
	}

	public Object getPoint() {
		// TODO Auto-generated method stub
		return null;
	}
}
