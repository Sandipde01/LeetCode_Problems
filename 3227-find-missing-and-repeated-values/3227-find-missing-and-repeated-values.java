class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[]=new int[2];
        HashMap<Integer,Integer>hashmap=new HashMap<>();
        int row=grid.length;
        int col=grid[0].length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
        
                if(!hashmap.containsKey(grid[i][j])){
                    hashmap.put(grid[i][j],1);
                }else{
                    int freq=hashmap.get(grid[i][j]);
                    hashmap.put(grid[i][j],freq+1);
                }
            }
        }
        for (HashMap.Entry<Integer, Integer> entry : hashmap.entrySet()) {
         int value = entry.getValue();
         int key=entry.getKey();  
           if(value>1){
            ans[0]=key;
           }
        }
        for(int i=1;i<=row*row;i++){
            if(!hashmap.containsKey(i)){
                ans[1]=i;
            }
        }
        return ans;
    }
}