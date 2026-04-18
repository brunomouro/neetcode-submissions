class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> i = new HashSet<Integer>();

        for(int n : nums){
            if( i.contains( n ) ){
                return true;
            }

            i.add( n );
        }

        return false;
    }
}