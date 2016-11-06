package JavaBasics.Questions.PrefixTree;

import java.util.HashMap;

/**
 * Created by jaydatta on 9/25/16.
 */
public class TrieNode {

    char c;
    HashMap<Character,TrieNode> children = new HashMap<>();
    boolean isLeaf;

public TrieNode(){

}


public TrieNode(char c){
    this.c = c;
}

}

