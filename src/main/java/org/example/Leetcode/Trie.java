package org.example.Leetcode;

import java.util.HashMap;
import java.util.Map;

class TrieNode {
    private Map<Character, TrieNode> children;
    private boolean isEndOfWord;

    public TrieNode() {
        this.children = new HashMap<>();
        this.isEndOfWord = false;
    }

    public TrieNode getChild(char ch) {
        return children.get(ch);
    }

    public void setChild(char ch, TrieNode node) {
        children.put(ch, node);
    }

    public boolean isEndOfWord() {
        return isEndOfWord;
    }

    public void setEndOfWord(boolean endOfWord) {
        isEndOfWord = endOfWord;
    }
    public Map<Character, TrieNode> getChildren(){
        return this.children;
    }
}
class Trie {
    private TrieNode root;

    public Trie(){
        this.root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = this.root;
        for (Character c : word.toCharArray()){
            if(current.getChild(c) == null){
                current.setChild(c,new TrieNode());
            };
            current = current.getChild(c);
        }
        current.setEndOfWord(true);

    }

    public boolean search(String word) {
        TrieNode current = this.root;
        for (Character c : word.toCharArray()) {
            if (current.getChild(c) == null) {
                return false;
            }
            current = current.getChild(c);
        }
        return current.isEndOfWord();
    }
    public boolean startsWith(String prefix) {
        TrieNode current = this.root;
        for(Character c : prefix.toCharArray()){
            if(current.getChild(c) == null){
                return false;
            }
            current= current.getChild(c);
        }
        return true;

    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
