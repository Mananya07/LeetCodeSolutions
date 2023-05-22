import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int t = candies.length;
        int listMax = 0;
        for (int i=0; i<t; i++){
            if (candies[i]>listMax){
                listMax = candies[i];
            }
        }
        
        ArrayList<Boolean> list =  new ArrayList<Boolean>();        
        
        for (int i=0; i<t; i++){
            
            if ((candies[i]+extraCandies)>= listMax){
                list.add(true);
            }
            
            else{
                list.add(false);
            }
        }
        return list;
    }
}