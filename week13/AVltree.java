package week13;

import java.util.TreeMap;

public class AVltree {
    static TreeMap<Integer, Integer> tree;

    public AVltree() {
        tree = new TreeMap<>();
    }

    public static void insert(int key, int value) {
        tree.put(key, value);
    }

    public static void delete(int key) {
        tree.remove(key);
    }

    public static int search(int key) {
        return tree.get(key);
    }
    public static void main(String[] args) {
        AVltree avl = new AVltree();

        for (int i = 0; i < 10; i++) {

                avl.insert(i,(int)(Math.random()*10));
       
        }
        System.err.println(avl.search(5));
    }
}

