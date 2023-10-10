package homeworks;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private List<Node> connections;

    public Node(String name) {
        this.name = name;
        this.connections = new ArrayList<>();
    }

    public void add(Node node) {
        connections.add(node);
    }

    public void connectedNodes() {
        if (connections != null)
            for (Node node : connections)
                 System.out.println("-> " + node.getName());
    }

    public int size() {
        return connections.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Node> getConnections() {
        return connections;
    }

    public void setConnections(List<Node> connections) {
        this.connections = connections;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                '}';
    }
}
