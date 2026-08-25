class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int need[]=new int [26];
        int wind[]=new int [26];
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            need[c-'a']++;
        }
        for(int right=0;right<s2.length();right++){
            wind[s2.charAt(right)-'a']++;
            if(right>=s1.length()){
                wind[s2.charAt(right-s1.length())-'a']--;
            }
            if(Arrays.equals(wind,need)){
                return true;
            }
        }
        return false;
    }
}
