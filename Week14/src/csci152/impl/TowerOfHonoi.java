/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci152.impl;

import csci152.adt.Queue;
import csci152.adt.Stack;

/**
 *
 * @author Aivar Abrashuly
 */
public class TowerOfHonoi {
    

	private Stack<Integer>[] post = new ArrayStack[3];
	private int numMoves = 0;
	
	public TowerOfHonoi(int numDiscs) {
		/*
		 TODO: Initialize all three posts to new stack objects,
		 and push onto post[0] the integers:
		    numDiscs, numDiscs-1, numDiscs-2, ..., 1 
		 */
                
                post[1] = null;
                post[2] = null;
                
                for(int i = 0; i < numDiscs; i++) {
                    post[0].push(numDiscs-i);
                }
                
                
	}
	
	public void moveDisc(int from, int to) throws Exception {
		/* 
		 TODO:  Moves the integer from the top of post[from] to 
		 post[to].  Throws an exception if either index is not
		 0, 1, or 2; or if post[from] is empty; or if the value
		 on top of post[from] is bigger than the topmost item of
		 post[to].
		 */
                
                if (to < 0 || to > 2 || from < 0 || from > 2) throw new Exception("index isn't correct");
                if (post[from].getSize() == 0) throw new Exception("post is empty!");
                
                int tempfrom = post[from].pop();
                if (post[to].getSize() != 0) {
                
                    int tempto = post[to].pop();
                    post[to].push(tempto);
                if (tempfrom > tempto) throw new Exception("invalid move");
	}
                post[to].push(tempfrom);
                numMoves++;
        }
	
	public boolean isFinished() {
		/*
		 TODO:  Returns true if and only if all of the discs are
		 on post[2] (i.e., post[0] and post[1] are empty)
		 */
                
                if (post[0].getSize() != 0 || post[1].getSize() != 0) return false;
                
		return true;
               
	}
	
	public int getNumMoves() {
		return numMoves;
	}
	
	public String toString() {
            Queue<Integer> queue = new ArrayQueue();
            
		String r = "Post A: top[ ";
                        for(int i = 0; i < post[0].getSize(); i++) {
                    try {
                        int temp = post[0].pop();
                        queue.enqueue(temp);
                        r += temp + ", ";
                    } catch (Exception ex) {
                        System.out.println("ohoo");
                    }
                        }
                        
                        for(int i = 0; i < queue.getSize(); i++) {
                try {
                    post[0].push(queue.dequeue());
                } catch (Exception ex) {
                    System.out.println("oooho");
                }
                        }
                        
                        r += "]bottom\nPost B: top[";
                        
                        for(int i = 0; i < post[1].getSize(); i++) {
                    try {
                        int temp = post[1].pop();
                        queue.enqueue(temp);
                        r += temp + ", ";
                    } catch (Exception ex) {
                        System.out.println("ohoo");
                    }
                        }
                        
                        for(int i = 0; i < queue.getSize(); i++) {
                try {
                    post[1].push(queue.dequeue());
                } catch (Exception ex) {
                    System.out.println("oooho");
                }
                        }
                        
                        r += "]bottom\nPost C: top[";
                        
                        for(int i = 0; i < post[2].getSize(); i++) {
                    try {
                        int temp = post[2].pop();
                        queue.enqueue(temp);
                        r += temp + ", ";
                    } catch (Exception ex) {
                        System.out.println("ohoo");
                    }
                        }
                        
                        for(int i = 0; i < queue.getSize(); i++) {
                try {
                    post[2].push(queue.dequeue());
                } catch (Exception ex) {
                    System.out.println("oooho");
                }
                        }
                        
                r += "]bottom";
		return r;
	}
        
        
}
