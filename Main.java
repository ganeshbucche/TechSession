import java.util.*;

class Main {

    static class Getnode {
        Getnode leftChild;
        int data;
        Getnode rightChild;

        public Getnode(int data) {
            this.data = data;
            leftChild = null;
            rightChild = null;
        }
    }

    Getnode root = null;

    public Getnode insert(Getnode root, int key) {

        if (root == null) {
            return new Getnode(key);
        }

        if (key < root.data) {
            root.leftChild = insert(root.leftChild, key);
        } else if (key > root.data) {
            root.rightChild = insert(root.rightChild, key);
        }

        return root;
    }

    public void inorder(Getnode root) {
        if (root != null) {
            inorder(root.leftChild);
            System.out.print(root.data +" ");
            inorder(root.rightChild);
        }
    }

    public void preorder(Getnode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.leftChild);
            preorder(root.rightChild);
        }
    }

    public void postorder(Getnode root) {
        if (root != null) {
            postorder(root.leftChild);
            postorder(root.rightChild);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {

        Main tree = new Main();
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {36, 26, 46, 21, 31, 10, 24, 41, 56, 51, 66};

        for (int i = 0; i < arr.length; i++) {
            tree.root = tree.insert(tree.root, arr[i]);
        }


        while (true) {
            System.out.println("\n1. Insert");
            System.out.println("2. Inorder Traversing");
            System.out.println("3. Postorder Traversing");
            System.out.println("4. Preorder Traversing");
            System.out.println("0. Exit");
            
            
            
         
    

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    tree.root = tree.insert(tree.root, value);
                    for(int i = 0; i<arr.length;++i){
                tree.root =tree.insert(tree.root,arr[i]);
            }
                    break;

                case 2:
                    System.out.print("Inorder: ");
                    tree.inorder(tree.root);
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Postorder: ");
                    tree.postorder(tree.root);
                    System.out.println();
                    break;

                case 4:
                    System.out.print("Preorder: ");
                    tree.preorder(tree.root);
                    System.out.println();
                    break;

                case 0:
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}