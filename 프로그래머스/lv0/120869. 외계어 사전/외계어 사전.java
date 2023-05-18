class Solution {
    public int solution(String[] spell, String[] dic) {
        int aa = 0; 
        
        for(int i=0; i<dic.length; i++){
            int num = 0;
            
            for(int j=0; j<spell.length; j++){
                if(dic[i].contains(spell[j])){
                    num++;
                }
            }
            
            if(num == spell.length) {
                aa++;
            } 
        }
        
        
        return aa > 0 ? 1 : 2;
    }
}