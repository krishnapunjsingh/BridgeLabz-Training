

public class LongestPalindrome {

    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        boolean isOdd = false;
        int count = 0;
        for(int freq : map.values()){
            if(freq%2==0){
                count+=freq;
            }
            else{
                count+=freq-1;
                isOdd = true;
            }
        }       
        return isOdd ? count+1:count;
        
    }
}