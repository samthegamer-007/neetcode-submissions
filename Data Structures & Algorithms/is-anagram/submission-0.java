class Solution {
    public boolean isAnagram(String s, String t) {
        int sl= s.length(), tl= t.length();
        if(tl!=sl)
        return false;
        else
        {
            char[] sSort = s.toCharArray();
            char[] tSort= t.toCharArray();
            Arrays.sort(sSort);
            Arrays.sort(tSort);
            return Arrays.equals(sSort,tSort);


        }

    }
}
