package com.niuedu;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import org.junit.Before;
import org.junit.Test;


public class TreeListTest {
    //保存数据的集合
    ListTree tree = new ListTree();

    @Before
    public void init(){
        //创建后台数据：一棵树
        //创建组们，是root node，所有parent为null
        ListTree.TreeNode n0 = tree.addNode(null, "0", 0);
        ListTree.TreeNode n1 = tree.addNode(null, "1", 0);
        ListTree.TreeNode n2 = tree.addNode(null, "2", 0);
        ListTree.TreeNode n3 = tree.addNode(null, "3", 0);
        ListTree.TreeNode n4 = tree.addNode(null, "4", 0);

        //n0
        ListTree.TreeNode n00 = tree.addNode(n0, "0-0", 0);
        ListTree.TreeNode n01 = tree.addNode(n0, "0-1", 0);
        ListTree.TreeNode n02 = tree.addNode(n0, "0-2", 0);

        //n1
        ListTree.TreeNode n10=tree.addNode(n1, "1-0", 0);
        ListTree.TreeNode n11=tree.addNode(n1, "1-1", 0);
        ListTree.TreeNode n12=tree.addNode(n1, "1-2", 0);

        //n2
        ListTree.TreeNode n20=tree.addNode(n2, "2-0", 0);
        ListTree.TreeNode n21=tree.addNode(n2, "2-1", 0);
        ListTree.TreeNode n22=tree.addNode(n2, "2-2", 0);

        //n10
        ListTree.TreeNode n100=tree.addNode(n10, "1-0-0", 0);
        ListTree.TreeNode n101=tree.addNode(n10, "1-0-1", 0);
        ListTree.TreeNode n102=tree.addNode(n10, "1-0-2", 0);

        //n12
        ListTree.TreeNode n120=tree.addNode(n12, "1-2-0", 0);
        ListTree.TreeNode n121=tree.addNode(n12, "1-2-1", 0);
        ListTree.TreeNode n122=tree.addNode(n12, "1-2-2", 0);

        //n22
        ListTree.TreeNode n220=tree.addNode(n22, "2-2-0", 0);
        ListTree.TreeNode n221=tree.addNode(n22, "2-2-1", 0);
        ListTree.TreeNode n222=tree.addNode(n22, "2-2-2", 0);

        //n101
        ListTree.TreeNode n1010=tree.addNode(n101, "1-0-1-0", 0);
        ListTree.TreeNode n1011=tree.addNode(n101, "1-0-1-1", 0);
        ListTree.TreeNode n1012=tree.addNode(n101, "1-0-1-2", 0);

        //n222
        ListTree.TreeNode n2220=tree.addNode(n222, "2-2-2-0", 0);
        ListTree.TreeNode n2221=tree.addNode(n222, "2-2-2-1", 0);
        ListTree.TreeNode n2222=tree.addNode(n222, "2-2-2-2", 0);
    }

//    @Test
//    public void testExpandAll(){
//        tree.expandAllNodes();
//        tree.printList();
//    }
//
//    @Test
//    public void testCollapseAll(){
//        tree.collapseAllNodes();
//        tree.printList();
//    }

    @Test
    public void testEnumAll(){
        tree.forEach(node -> {
            System.out.println(node.getData().toString());
        });
    }

    public void testInsertRootAtFirst(){

    }

    public void testInsertRootAtLast(){

    }

    public void testInsertChildAtFirst(){

    }

    public void testInsertChildAtMiddle(){

    }

    public void testInsertRootAtLastWhenCollapse(){

    }

    public void testInsertChildAtFirstWhenCollapse(){

    }

    public void testInsertChildAtMiddleWhenCollapse(){

    }


}
