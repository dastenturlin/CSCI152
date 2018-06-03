/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Set;

/**
 *
 * @author dasten
 * @param <T>
 */
public class BSTSet<T extends Comparable> implements Set<T> {

    private TreeNode<T> root;
    private int size;


    public BSTSet() {
        root = null;
        size = 0;
    }

    public TreeNode<T> getRoot() {
        return root;
    }

    public void setRoot(TreeNode<T> root) {
        this.root = root;
    }

    @Override
    public void add(T value) {
        TreeNode<T> newNode = new TreeNode(value);
        
        if(contains(value)) return;
        size++;
        
        if(root == null){
            root = newNode;
        }
        
        else{
            TreeNode<T> current = root;    
            while(true){
                T c = current.getValue();
                T n = newNode.getValue();
                
                if(n.compareTo(c) <= 0){
                    if(current.getLeft() == null) {
                        current.setLeft(newNode);
                        return;
                    }
                    current = current.getLeft();
                } else if(n.compareTo(c) > 0){
                    if(current.getRight() == null) {
                        current.setRight(newNode);
                        return;
                    }
                    current = current.getRight();
                }
            }
        }
        
    }

    @Override
    public boolean contains(T value) {
        if(root == null) return false;
        
        TreeNode<T> current = root;
        while(true){
            int check = value.compareTo(current.getValue());
            if(check < 0){
                if(current.getLeft() == null) 
                    return false;
                current  = current.getLeft();
            }
            else if(check > 0){
                if(current.getRight() == null) 
                    return false;
                current  = current.getRight();
            }
            else return true;
        }
    }

    @Override
    public boolean remove(T value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T removeAny() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSize(int size) {
        this.size = size;
    } 
    
    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        root = null;
        size = 0;
    }
    
    @Override
    public String toString(){
        return treeToString(root);
    }
    
    public String treeToString(TreeNode tree){
        if(tree == null) return "";
        return treeToString(tree.getLeft())+" "+tree.getValue()+" "+ treeToString(tree.getRight());
        
    }
    
    
}
