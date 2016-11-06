package JavaBasics.Questions.PrefixTree;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jaydatta on 9/25/16.
 */
public class Trie {

    private TrieNode root;

    public Trie(){
        root = new TrieNode();
    }


    public void insert(String word){

        HashMap<Character,TrieNode> children = root.children;
        for(int i=0; i < word.length();i++){
            char c  = word.charAt(i);

            TrieNode t;
            if(children.containsKey(c)){
                t = children.get(c);
            }else{
                t = new TrieNode(c);
                children.put(c,t);
            }

            children = t.children;
            if(i==word.length()-1){
                t.isLeaf = true;
            }
        }

    }

    public boolean search(String word){
    TrieNode t = searchNode(word);
if(t!=null && t.isLeaf)
    return true;
else
    return false;
    }

    public boolean startsWith(String prefix){

        if(searchNode(prefix)==null){
            return false;
        }
        else
            return true;
    }

    public TrieNode searchNode(String str){

        Map<Character,TrieNode> children = root.children;

        TrieNode t = null;
        for(int i=0; i <  str.length();i++){
            char c = str.charAt(i);
            if(children.containsKey(c)){
                t = children.get(c);
                children = t.children;
            }
            else
                return null;
        }

    return t;
    }


    public static void main(String[] args) {


        Trie trieObject = new Trie();
        trieObject.insert("JAY");
        trieObject.insert("ASHWIN");
        trieObject.insert("PAWAN");trieObject.insert("JAY");

        System.out.println(trieObject.search("JAYDATTA"));

    }





}
