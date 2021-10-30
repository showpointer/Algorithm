package inflearn.problemsolving.p07_recursive_tree_graph;

class Node {
    int data;
    Node lt, rt;
    Node(int data) {
        this.data = data;
        lt=rt=null;
    }

}

public class P07_05_이진트리순회DFS {
    Node root;

    void DFS(Node root) {
        if (root == null) return;
        else {
            // 전위순회: 부모 -> 왼쪽 -> 오른쪽
            // System.out.print(root.data + " ");
            DFS(root.lt);
            // 중위순회: 왼쪽 -> 부모 -> 오른쪽
            System.out.print(root.data + " ");
            DFS(root.rt);
            // 전위순회: 왼쪽 -> 오른쪽 -> 부모
            // System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        P07_05_이진트리순회DFS tree = new P07_05_이진트리순회DFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.DFS(tree.root);
    }
}
