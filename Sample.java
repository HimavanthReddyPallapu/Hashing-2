// Time Complexity : O(n)
// Space Complexity : Constant
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==0) {return 0;}
        int len=0;
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(hs.contains(c))
            {
                len=len+2;
                hs.remove(c);
            }
            else
            {
                hs.add(c);
            }
            
            
        }
        if(hs.size()>0)
        {
            len++;
        }
        return len;
    }
}
