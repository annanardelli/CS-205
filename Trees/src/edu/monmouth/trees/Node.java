package edu.monmouth.trees;

public class Node {
	   private int key;              
	   private double value;          
	   public Node leftChild;         // purposefully left as public for exercise
	   public Node rightChild;        // purposefully left as public for exercise

	   public Node(int key, double value) {
		   this.key = key;
		   this.value = value;
	   }
	   public void setkey(int key) {
		   this.key = key;
	   }
	   public void setvalue(double value) {
		   this.value = value;
	   }
	   public int getkey() {
		   return key;
	   }
	   public double getvalue() {
		   return value;
	   }
	   @Override
	   public String toString()  { 
	      return "{" + key + ", " + value + "} ";
	   }
}
