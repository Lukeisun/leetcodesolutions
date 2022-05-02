class Solution {
    public int lengthOfLongestSubstring(String s)
    {
        int ret = 0;
        HashMap<Character, Integer> currStr = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(currStr.containsKey(c))
            {
                i = currStr.get(c);
                currStr = new HashMap<>();
                //currStr.put(c,i+1);
            } else {
                currStr.put(c,i);
            }
            if(currStr.size() > ret) ret = currStr.size();
        }
        return ret;
    }
}
