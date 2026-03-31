public class WordPattern {
    
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length != pattern.length()) return false;
        Map<Character , String> mapCS = new HashMap<>();
        Map<String , Character> mapSC = new HashMap<>();
        
        for(int i=0;i<pattern.length();i++){
            String word = words[i];
            if(mapCS.containsKey(pattern.charAt(i))){
                if(!mapCS.get(pattern.charAt(i)).equals(word)) return false;
            }
            else{
                mapCS.put(pattern.charAt(i), word);
            }
            if(mapSC.containsKey(word)){
                if(mapSC.get(word)!=pattern.charAt(i)) return false;
            }
            else{
                mapSC.put(word, pattern.charAt(i));
            }
        }
        return true;
    }
}
