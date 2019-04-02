package com.example;

public class BinTreeObj {


    private Person person;
    private BinTreeObj lchild;
    private BinTreeObj rchild;

    public BinTreeObj(Person p) {
        person = p;
    }

    // 先序遍历递归   
    public static void preOrder(BinTreeObj t) {
        if (t == null) {
            return;
        }
        System.out.print(t.person.getName());
        preOrder(t.lchild);
        preOrder(t.rchild);
    }



    public static void main(String[] args) {
        BinTreeObj a = new BinTreeObj(new Person("a"));
        BinTreeObj b = new BinTreeObj(new Person("b"));
        BinTreeObj c = new BinTreeObj(new Person("c"));
        BinTreeObj d = new BinTreeObj(new Person("d"));
        BinTreeObj e = new BinTreeObj(new Person("e"));
        BinTreeObj f = new BinTreeObj(new Person("f"));
        BinTreeObj g = new BinTreeObj(new Person("g"));
        BinTreeObj h = new BinTreeObj(new Person("h"));
        BinTreeObj i = new BinTreeObj(new Person("i"));


        /**
         *        a
         *     /   /
         *    b      c
         *   / /    /  \
         *  d   e   f   g
         *  / \
         *  h  i
         */

        a.lchild = b;
        a.rchild = c;
        b.lchild = d;
        b.rchild = e;
        d.lchild = h;
        d.rchild = i;
        c.lchild = f;
        c.rchild = g;



        BinTreeObj.preOrder(b);
        System.out.println();



    }
}