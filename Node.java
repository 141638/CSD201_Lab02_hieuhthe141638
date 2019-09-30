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
public class Node {
    
    int info;
    Node left,right;
    
    Node(int x){};
    
    Node(int x, Node p, Node q){
        info = x;
        p = left = null;
        q = right = null;
    }
    
}
