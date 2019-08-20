package baekjoon.q1991;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfNode = scanner.nextInt();
        Tree tree = new Tree();
        for (int i = 0; i < countOfNode; i++) {
            tree.add(scanner.next(), scanner.next(), scanner.next());
        }
        tree.preOrder(tree.getRoot());
        System.out.println();
        tree.inOrder(tree.getRoot());
        System.out.println();
        tree.postOrder(tree.getRoot());
    }
}

class Tree {
    private Node root;

    public void add(String data, String left, String right) {
        if (root != null) {
            search(root, data, left, right);
            return;
        }

        if (!data.equals(".")) {
            root = new Node(data);
        }

        if (!left.equals(".")) {
            root.setLeft(new Node(left));
        }

        if (!right.equals(".")) {
            root.setRight(new Node(right));
        }
    }

    public void search(Node root, String data, String left, String right) {
        if (root == null) {
            return;
        }

        // 위치 찾음
        if (root.getData().equals(data)) {
            // 삽입
            if (!left.equals(".")) {
                root.setLeft(new Node(left));
            }

            if (!right.equals(".")) {
                root.setRight(new Node(right));
            }
        } else {
            // 아직 못 찾음
            search(root.getLeft(), data, left, right);
            search(root.getRight(), data, left, right);
        }
    }

    // 전위 : root -> L -> R
    public void preOrder(Node root) {
        System.out.print(root.getData());
        if (root.getLeft() != null) {
            preOrder(root.getLeft());
        }
        if (root.getRight() != null) {
            preOrder(root.getRight());
        }
    }

    // 중위 : L -> root -> R
    public void inOrder(Node root) {
        if (root.getLeft() != null) {
            inOrder(root.getLeft());
        }
        System.out.print(root.getData());
        if (root.getRight() != null) {
            inOrder(root.getRight());
        }
    }

    // 후위 : L -> R -> root
    public void postOrder(Node root) {
        if (root.getLeft() != null) {
            postOrder(root.getLeft());
        }
        if (root.getRight() != null) {
            postOrder(root.getRight());
        }
        System.out.print(root.getData());
    }

    public Node getRoot() {
        return root;
    }
}

class Node {
    private String data;
    private Node left;
    private Node right;

    public Node(String data) {
        this.data = data;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public String getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}