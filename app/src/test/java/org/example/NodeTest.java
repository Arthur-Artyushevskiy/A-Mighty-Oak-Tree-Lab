package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

public class NodeTest {

    @Test
    public void testNodeInitialization() {

        Squirrel<String> rocky = new Squirrel<>("Rocky");
        Node<String> node = new Node<>(rocky);

        assertEquals("Rocky", node.getData().getName());

        assertNull(node.left());
        assertNull(node.right());
    }

    @Test
    public void testTreeAttachment() {

        Node<String> root = new Node<>(new Squirrel<>("Root"));
        Node<String> leftChild = new Node<>(new Squirrel<>("Left"));
        Node<String> rightChild = new Node<>(new Squirrel<>("Right"));


        root.setLeft(leftChild);
        root.setRight(rightChild);


        assertEquals(leftChild, root.left());
        assertEquals(rightChild, root.right());
        assertEquals("Left", root.left().getData().getName());
        assertEquals("Right", root.right().getData().getName());
    }

    @Test
    public void testMultiLevelTraversal() {
        //       A
        //      / \
        //     B   C
        //          \
        //           D

        Node<String> nodeA = new Node<>(new Squirrel<>("A"));
        Node<String> nodeB = new Node<>(new Squirrel<>("B"));
        Node<String> nodeC = new Node<>(new Squirrel<>("C"));
        Node<String> nodeD = new Node<>(new Squirrel<>("D"));

        nodeA.setLeft(nodeB);
        nodeA.setRight(nodeC);
        nodeC.setRight(nodeD);


        assertEquals("B", nodeA.left().getData().getName());

        Node<String> result = nodeA.right().right();
        assertEquals("D", result.getData().getName());
        
        assertNull(nodeA.left().left());
    }
}