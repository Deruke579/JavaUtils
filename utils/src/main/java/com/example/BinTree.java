package com.example;

public class BinTree {
    private char date;
    private BinTree lchild;
    private BinTree rchild;

    public BinTree(char c) {
        date = c;
    }

    // 先序遍历递归   
    public static void preOrder(BinTree t) {
        if (t == null) {
            return;
        }
        System.out.print(t.date);
        preOrder(t.lchild);
        preOrder(t.rchild);
    }

    // 中序遍历递归   
    public static void InOrder(BinTree t) {
        if (t == null) {
            return;
        }
        InOrder(t.lchild);
        System.out.print(t.date);
        InOrder(t.rchild);
    }

    // 后序遍历递归   
    public static void PostOrder(BinTree t) {
        if (t == null) {
            return;
        }
        PostOrder(t.lchild);
        PostOrder(t.rchild);
        System.out.print(t.date);
    }

    public static void main(String[] args) {
        BinTree b1 = new BinTree('a');
        BinTree b2 = new BinTree('b');
        BinTree b3 = new BinTree('c');
        BinTree b4 = new BinTree('d');
        BinTree b5 = new BinTree('e');

        /**
         *      a  
         *     / / 
         *    b   c 
         *   / / 
         *  d   e 
         */
        b1.lchild = b2;
        b1.rchild = b3;
        b2.lchild = b4;
        b2.rchild = b5;

        BinTree.preOrder(b1);
        System.out.println();

        System.out.println();
        BinTree.InOrder(b1);

        System.out.println();
        BinTree.PostOrder(b1);

    }
}