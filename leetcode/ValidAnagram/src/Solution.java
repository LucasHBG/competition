class Solution {
    /**
     * @param s
     * @param t
     * @return True if t is a anagram of s or False otherwise
     */
    public boolean isAnagram(String s, String t) {

        char[] letras = new char[27];

        for (char c : s.toCharArray()) {
            letras[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            if (letras[c - 'a']-- <= 0)
                return false;
        }

        return true;
    }
}