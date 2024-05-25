class Solution {
    public int findMin(ArrayList<Integer> list){
        int min = 3;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i)<min){
                min = list.get(i);
            }
        }
        return min;
    }
    public void sortColors(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            list.add(nums[i]);
        }//O(n)

        for(int i = 0; i < nums.length; i++){
            int min = findMin(list);
            nums[i] = min;
            list.remove(Integer.valueOf(min));
        }
        
        //runtime: O(n^2)
        //space: O(n)
    }
}