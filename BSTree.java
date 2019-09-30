/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd201_lab02_hieuhthe141638;

/**
 *
 * @author admin
 */
public class BSTree {
    
    Node root;
    public BSTree() {root = null;}
    public BSTree(int x){
        root.info = x;
    }
    
    Node add(Node curr, int x){
        if(root == null){
            return new Node(x);
        }
        
        if(x>curr.info) curr.left = add(curr.left,x);
        else if(x<curr.info) curr.right = add(curr.right,x);
        else return curr;
        return curr;
    }
    
    
    void deleteNode(int x) 
    { 
        root = remove(root, x); 
    }
    Node remove(Node root,int x){
        if(root == null){
            root = new Node(x); 
        }
            
        if(root.info<x) remove(root.left,x);
        else if(root.info>x) remove(root.right,x);
        else{
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }
            root.info = minValue(root.right);
            root.right = remove(root.right,root.info);
        }
            
        
        return root;
    }

    private int minValue(Node root) {
        int min = root.info;
        while (root.left != null) 
        { 
            min = root.left.info; 
            root = root.left; 
        } 
        return min; 
    }
    
    Node search(Node curr, int x)
     { if(curr==null){
         return(null);
     }
       if(curr.info==x) return(curr);
       if(x<curr.info)
          return(search(curr.left,x));
          else
           return(search(curr.right,x));
      }
    
//    Algorithm preOrder(v)
//visit(v)
//for each child w of v
//	preorder (w)
    
    void preOrder(Node root){
        
        if(root!=null){
            
            System.out.println(root.info);
            preOrder(root.left);
            preOrder(root.right);
        }
    }


    
}
