class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] freq= new int [26];
        for(char i=0;i<s.length();i++){
            char c= s.charAt(i);
            freq[c-'a']++;
        }
        for(char i=0;i<t.length();i++){
            char c= t.charAt(i);
            freq[c-'a']--;
        }
      //checking whether its anagram
      for( int cnt:freq){
        if(cnt!=0){
            return false;
        }
      }
      return true;


    }
}
