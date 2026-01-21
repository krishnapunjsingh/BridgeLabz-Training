public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase();
        Set<String> set = new HashSet<>();
        for(String b: banned){
            set.add(b);
        }
        Map<String, Integer> map = new HashMap<>();
        String[] words = paragraph.split("\\s+");
        for(String word : words){
            if(!set.contains(word) ){
                map.put(word , map.getOrDefault(word, 0)+1);
            }
        }
        String sty ="";
        int max = Integer.MIN_VALUE;
        for(String key : map.keySet()){
            if(max<map.get(key)){
                max = map.get(key);
                sty = key;
            }
        }   
 
        return sty;
    }
}
