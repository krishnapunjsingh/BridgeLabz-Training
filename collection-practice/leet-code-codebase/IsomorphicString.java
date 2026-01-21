class isomorphic {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
           char ch1 = s.charAt(i);
           char ch2 = t.charAt(i);
           if(map.containsKey(ch1) && map.get(ch1) != ch2){
            return false;
           }
           if(map2.containsKey(ch2) && map2.get(ch2) != ch1){
            return false;
           }
           map.put(ch1,ch2);
           map2.put(ch2,ch1);
        }
        return true;
    }
        
}

