class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder result = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i<word1.length() && j<word2.length()){

            result.append(word1.charAt(i));
            result.append(word2.charAt(j));
            i+=1;
            j+=1;
        }

        while (i<word1.length()){
            result.append(word1.charAt(i));
            i+=1;
        }

        while (j<word2.length()){
            result.append(word2.charAt(j));
            j+=1;
        }

        return result.toString();
        
    }
}