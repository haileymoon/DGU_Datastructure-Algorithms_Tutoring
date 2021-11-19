package BinaryTree;
public class treeTraversal{
    public static void main(String[] args) {
    /* in- pre- post
             1
          2    3
         4 5  6 7 
        8
    */
        int number = 8;
        Node[] nodes = new Node[number+1];
        // 노드 인스턴드 각각 생성 및 데이터 부여
        for (int i=1; i<=number; i++){
            nodes[i] = new Node();
            nodes[i].data = i;
            nodes[i].left = null;
            nodes[i].right = null;
        }

        for (int i=2; i<=number; i++){
            if(i%2 ==0){
                nodes[i/2].left = nodes[i];
            }
            else{ 
                nodes[i/2].right = nodes[i]; // i=3, 1.5 -> 1
            }
        }
        inorder(nodes[1]);
        System.out.println();
        preorder(nodes[1]);
        System.out.println();
        postorder(nodes[1]);
    }

    public static class Node{
        private int data;
        private Node left;
        private Node right;
    }
    public static void inorder(Node node){ //LEFT-자기자신-RIGHT
        if(node != null){
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
    public static void preorder(Node node){ // 자기자신-LEFT-RIGHT  
        if(node != null){
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }
    public static void postorder(Node node){ // LEFT-RIGHT-자기자신
        if(node != null){
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }
}