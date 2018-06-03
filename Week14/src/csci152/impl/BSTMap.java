/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci152.impl;

import csci152.adt.KeyValuePair;
import csci152.adt.Map;

/**
 *
 * @author Aivar Abrashuly
 * @param <K>
 * @param <V>
 */
public class BSTMap<K extends Comparable, V> implements Map<K, V> {

    private TreeNode<KeyValuePair<K,V>> root;
    private int size;
    
    public BSTMap() {
        root = null;
        size = 0;
    }
            
    @Override
    public void define(K key, V value) {
        TreeNode<KeyValuePair<K, V>> newNode;
        newNode = new TreeNode(new KeyValuePair(key, value));
        
        if(root == null) {
            root = newNode;
        } else {
            TreeNode<KeyValuePair<K, V>> current = root;
            
            while(true) {
                if(newNode.getValue().getKey().compareTo(current.getValue().getKey()) < 0) {
                    // going to the left
                    if(current.getLeft() == null) {
                        current.setLeft(newNode);
                        return;
                        }
                    current = current.getLeft();
                }
                
                if(newNode.getValue().getKey().compareTo(current.getValue().getKey()) > 0) {
                    // going to the right
                    if(current.getRight() == null) {
                        current.setRight(newNode);
                        return;
                        }
                    current = current.getRight();
                }
                
                if(newNode.getValue().getKey().compareTo(current.getValue().getKey()) == 0) {
                    // the key already consists
                    current.getValue().setValue(newNode.getValue().getValue());
                    return;
                }
                
            }
        } 
        
    }

    @Override
    public V getValue(K key) {
        if (root == null) return null;
        TreeNode<KeyValuePair<K, V>> current = root;
        while(true) {
            if(key.compareTo(current.getValue().getKey()) < 0) {
                //going to the left
                if(current.getLeft() == null) return null;
                current = current.getLeft();
            } else if(key.compareTo(current.getValue().getKey()) > 0) {
                //going to the right
                if(current.getRight() == null) return null;
                current = current.getRight();
            } else {
                // meaning that keys are equal
                return current.getValue().getValue();
            }
        }
    }

    @Override
    public V remove(K key) {        
        if (getValue(key) == null) return null;
        
        TreeNode<KeyValuePair<K, V>> current = root;
        boolean isLeft = false;
        while(true){
            int compare = key.compareTo(current.getValue().getKey());
            
            if(compare<0){                
                current  = current.getLeft();
                isLeft = true;
            }else if(compare>0){            
                current  = current.getRight();
                isLeft = false;
            }else{
                // it means current equals to value
                
                //case1: has no child;
                size--;
                if(current.getLeft() == null && current.getRight() == null) {
                    if(size == 0) {
                        root = null;
                        return current.getValue().getValue();
                    }
                    if(isLeft == true){
                        current.getParent().setLeft(null);
                        return current.getValue().getValue();
                    }else{
                        current.getParent().setRight(null);
                        return current.getValue().getValue();
                    }
                }

                //case2: has one child:
                if(current.getLeft() == null && current.getRight() != null){//have a right child 
                    if(size == 0) {
                        root = null;
                        root = current.getRight();
                        return current.getValue().getValue();
                    }
                    if(isLeft == true){
                        current.getParent().setLeft(current.getRight());
                        current.setRight(null);
                        return current.getValue().getValue();
                    }else{
                        current.getParent().setRight(current.getRight());
                        current.setRight(null);
                        return current.getValue().getValue();
                    }
                }else 
                if(current.getRight() == null){//have a left child 
                    if(size == 0) {
                        root = current.getLeft();
                        return current.getValue().getValue();
                    }
                    if(isLeft == true){
                        current.getParent().setLeft(current.getLeft());
                        current.setLeft(null);
                        return current.getValue().getValue();
                    }else{
                        current.getParent().setRight(current.getLeft());
                        current.setLeft(null);
                        return current.getValue().getValue();
                    }
                }
                
                //case 3: has two children
                if(current.getLeft()!=null && current.getRight()!=null){ 
                    TreeNode<KeyValuePair<K, V>> min = current.getRight();
                    boolean minIsLeft = false;
                    while(true){
                        if(min.getLeft() == null){  
                            if(min.getRight()!=null){
                                if(minIsLeft) min.getParent().setLeft(min.getRight()) ;
                                        else min.getParent().setRight(min.getRight()) ;
                            }
                            else {
                                if(minIsLeft) min.getParent().setLeft(null) ;
                                        else min.getParent().setRight(null) ;
                            }
                            min.setLeft(current.getLeft());
                            min.setRight(current.getRight());
                            if(isLeft == true){ 
                                current.getParent().setLeft(min);
                                current.setLeft(null);
                                current.setRight(null);
                                return current.getValue().getValue();
                            }else{
                                if(current.getParent()==null){
                                    root = min;
                                    root.setParent(null); 
                                }else
                                current.getParent().setRight(min);
                                current.setLeft(null);
                                current.setRight(null);
                                return current.getValue().getValue();
                            }  
                        }
                        min = min.getLeft();
                        minIsLeft = true;
                    }
                } 
            }
    }
    }

    @Override
    public KeyValuePair<K, V> removeAny() throws Exception {
        KeyValuePair<K, V> result = new KeyValuePair(null, null);
        
        if(size == 0) throw new Exception("Map is empty!");
        if(size == 1){
            size--;
            result = root.getValue();
            root = null;
            return result;
        }else{ 
            result = root.getValue();
            remove(result.getKey()); 
            return result;
        }
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
    
    public String toString() {
        return treeToString(root);
    }
    
    public String treeToString(TreeNode tree){
        if(tree == null) return "";
        return treeToString(tree.getLeft())+" "+tree.getValue()+" "+ treeToString(tree.getRight());
        
    }

}
