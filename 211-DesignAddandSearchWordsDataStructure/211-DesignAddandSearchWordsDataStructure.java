// Last updated: 7/13/2025, 11:51:51 AM
class WordDictionary {
    static class TrieNode {
        TrieNode[] children;
        boolean eow;

        TrieNode() {
            children = new TrieNode[26];
            eow = false;
        }
    }

    private TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
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

    public boolean search(String word) {
        return searchHelper(word, 0, root);
    }

    private boolean searchHelper(String word, int pos, TrieNode node) {
        if (pos == word.length()) {
            return node.eow;
        }

        char ch = word.charAt(pos);
        if (ch == '.') {
            for (TrieNode child : node.children) {
                if (child != null && searchHelper(word, pos + 1, child)) {
                    return true;
                }
            }
            return false;
        } else {
            int idx = ch - 'a';
            TrieNode child = node.children[idx];
            if (child == null) {
                return false;
            }
            return searchHelper(word, pos + 1, child);
        }
    }
}