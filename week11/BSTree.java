package week11;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
class TreeNode {    // 樹節點類別
   int data;        // 節點資料
   TreeNode left;   // 參考左子樹
   TreeNode right;  // 參考右子樹
   // 建構子
   public TreeNode(int data) {
      this.data = data;
      this.left = this.right = null;
   }
}
public class BSTree {      // 二元搜尋樹類別
   public TreeNode head;   // 參考樹的根節點
   // 建立空的二元搜尋樹
   public BSTree() { head = null; }

    public BSTree(TreeNode head) {
        this.head = head;
    }
 
   // 方法: 檢查二元搜尋樹是否是空的
   boolean isBSTreeEmpty() {
      if ( head == null ) return true;
      else                return false;
   }
   // 方法: 在二元搜尋樹插入節點
   public void insertBSTreeNode(int data) {
      if ( head == null ) {  // 建立根節點
         head = new TreeNode(data);
         return;
      }
      // 建立二元搜尋樹
      TreeNode current = head;
      while (true) {
         if ( data < current.data ) {  // 在左子樹
            if ( current.left == null ) {
               current.left = new TreeNode(data);
               return;
            }
            else  current = current.left;
         }
         else {  // 在右子樹
            if ( current.right == null ) {
               current.right = new TreeNode(data);
               return;
            }
            else  current = current.right;
         }
      }
   }
      public TreeNode delete(TreeNode node ,int key) {
      if (node == null) {
         return node;
      }
      if(key<node.data){
         node.left = delete(node.left, key);

      }
      else if (key > node.data) {
         node.right = delete(node.right, key);
     }
     else {
         if (node.left == null) {
             return node.right;
         }
         else if (node.right == null) {
             return node.left;
         }
         node.data = minValue(node.right);
         node.right = delete(node.right, node.data);
     }
     return node;
   }
   private int minValue(TreeNode root) {
      int minv = root.data;
      while (root.left != null) {
          minv = root.left.data;
          root = root.left;
      }
      return minv;
  }
   // 方法: 顯示二元搜尋樹的節點資料
   public void printBSTree() {
      inOrder(this.head);
      System.out.println();
   }
   // 方法: 前序走訪的遞迴方法
   public void preOrder(TreeNode node) {
      if ( node != null ) { 
         // 顯示節點資料
         System.out.print("["+node.data+"]"); 
         preOrder(node.left);  // 走訪左子樹         
         preOrder(node.right); // 走訪右子樹
      }
   }
   // 方法: 中序走訪的遞迴方法
   public void inOrder(TreeNode node) {
      if ( node != null ) {   
         inOrder(node.left);  // 走訪左子樹
         // 顯示節點資料
         System.out.print("["+node.data+"]");
         inOrder(node.right); // 走訪右子樹 
      }
   }
   // 方法: 後序走訪的遞迴方法
   public void postOrder(TreeNode node) {
      if ( node != null ) {  
         postOrder(node.left);  // 走訪左子樹
         postOrder(node.right); // 走訪右子樹
         // 顯示節點資料
         System.out.print("["+node.data+"]");
      }
   }
      
	
   public static void main(String args[]){
         int i;         
         int[] array = { 5, 6, 4, 8, 2, 3, 7, 1, 9 };
         
         BSTree obj = new BSTree();
      

         System.out.print("Original Array:");
         // 使用迴圈以插入方式建立樹狀結構
         for ( i = 0; i < array.length; i++ ) {
              System.out.print("["+array[i]+"]");
              obj.insertBSTreeNode(array[i]);
         }
         System.out.println();

         System.out.print("InOrder:");
         obj.inOrder(obj.head);
         System.out.println();

         System.out.print("PreOrder:");
         obj.preOrder(obj.head);
         System.out.println();

         System.out.print("PostOrder:");
         obj.postOrder(obj.head);
         System.out.println();
         obj.postOrder(obj.head);
         System.out.println();
         obj.delete(obj.head, 8);
         System.out.println();
         obj.printBSTree();
   }
}