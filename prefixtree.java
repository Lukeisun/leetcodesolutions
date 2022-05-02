class Trie {
    Trie[] children;
    boolean word;
    public Trie() {
        children = new Trie[26];
        word = false;
        Arrays.fill(children, null);
    }

    public void insert(String word) {
        this.insert(word, 0);
    }
    public void insert(String word, int idx) {
           if(idx == word.length()) return;
           int r = word.charAt(idx)-'a';
           if(children[r] == null) children[r] = new Trie();

           if(children[r] != null && idx == word.length()-1) children[r].word = true;
           else children[r].insert(word,idx+1);
    }

    public boolean search(String word) {
        return this.search(word, 0);
    }
    public boolean search(String word, int idx)
    {
        int r = word.charAt(idx) - 'a';
        if(idx == word.length()-1)
        {
            if(children[r] != null && children[r].word)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        if(children[r] == null) return false;
        else return children[r].search(word, idx+1);
    }

    public boolean startsWith(String prefix) {
        return this.startsWith(prefix,0);
    }
    public boolean startsWith(String prefix, int idx)
    {
        if(idx == prefix.length())
        {
            if(this.word) return true;
            for(Trie c : children)
            {
                if(c!=null)
                {
                    return true;
                }
            }
            return false;
        }
        int r = prefix.charAt(idx) - 'a';
        if(children[r] == null) return false;
        else return children[r].startsWith(prefix, idx+1);
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
