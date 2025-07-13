// Last updated: 7/13/2025, 11:01:25 AM
class Trie {
    static class TrieNode {
        TrieNode[] children;
        boolean eow;

        TrieNode() {
            children = new TrieNode[26];
            eow = false;
        }
    }

    TrieNode root;

    Trie() {
        root = new TrieNode();
    }

    void insert(String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new TrieNode();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    boolean search(String key) {
        TrieNode curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null)
                return false;
            curr = curr.children[idx];
        }
        return curr.eow;
    }

    String commonPrefix(String one, String other) {
    StringBuilder prefix = new StringBuilder();
    TrieNode curr1 = root;
    TrieNode curr2 = root;
    int i = 0;

    while (i < one.length() && i < other.length()) {
        char c1 = one.charAt(i);
        char c2 = other.charAt(i);

        if (c1 != c2) break;

        int idx = c1 - 'a';

        if(curr1.children[idx] == null || curr2.children[idx] == null){
            break;
        }
        prefix.append(c1);
        curr1 = curr1.children[idx];
        curr2 = curr2.children[idx];
        i++;
    }
    return prefix.toString();
}

    String longestCommonPrefix(String[] strs){
        String prefix = strs[0];
        int i=0;
        if(strs.length==1)  return prefix;
        while(i<strs.length-1){
             prefix = commonPrefix(prefix,strs[i+1]);
             i++;
        }
        if(prefix.length()==0)    return "";
        return prefix;
    }

    
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Trie trie = new Trie();
        for(String str: strs){
            trie.insert(str);
        }
        return trie.longestCommonPrefix(strs);
    }
}