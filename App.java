
package csd201_lab02_hieuhthe141638;

/**
 *
 * @author admin
 */
public class App {
    public static void main(String[] args) {
        
        Node root = null;
        Node curr = null;
        int n = 0;
        CheckInput ci = new CheckInput();
        BSTree bst = new BSTree();
        
        System.out.println("----- Binary Search Tree -----");
      
        bst.add(curr, 6);
        bst.add(curr, 8);
        bst.add(curr, 4);
        bst.add(curr, 2);
        bst.add(curr, 5);
        bst.add(curr, 7);
        bst.add(curr, 9);
        
        bst.preOrder(root);


            
        
    }
}
