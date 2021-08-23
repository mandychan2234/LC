class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pt =new ArrayList<>();
        
        List<Integer> row = new ArrayList<>();
        row.add(1);
        pt.add(row);
     
        for(int i=1; i<numRows; i++){
            List<Integer> newrow = new ArrayList<>();
            newrow.add(1);
            
            for(int j=1;j<i;j++){
                newrow.add(pt.get(i-1).get(j-1)+pt.get(i-1).get(j));
            }
            
            newrow.add(1);
            pt.add(newrow);
            
        }
        
        
        return pt;
    }
}