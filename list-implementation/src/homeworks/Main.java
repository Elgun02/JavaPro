package homeworks;

public class Main {
    public static void main(String[] args) {
        Node nodeA = new Node("А");
        Node nodeB = new Node("Б");
        Node nodeV = new Node("В");
        Node nodeQ = new Node("Г");
        Node nodeD = new Node("Д");
        Node nodeE = new Node("Е");
        Node nodeJ = new Node("Ж");
        Node nodeZ = new Node("З");
        Node nodeI = new Node("И");
        Node nodeK = new Node("К");

        nodeA.add(nodeB);
        nodeA.add(nodeV);
        nodeA.add(nodeQ);
        nodeA.add(nodeD);

        nodeB.add(nodeE);
        nodeB.add(nodeV);

        nodeV.add(nodeJ);

        nodeQ.add(nodeV);
        nodeQ.add(nodeZ);

        nodeD.add(nodeQ);
        nodeD.add(nodeI);

        nodeE.add(nodeK);

        nodeJ.add(nodeK);
        nodeJ.add(nodeZ);

        nodeZ.add(nodeK);

        nodeI.add(nodeK);

        nodeA.connectedNodes();
        System.out.println();
        System.out.println(nodeA.size());

        // Второе задание - самый короткий путь из Рейкявикы в Афины это = Reykjavik -> Oslo -> Berlin -> Rome -> Athens - 10

    }
}
