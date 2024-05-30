class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] indices = new int[2];
        int leftPt = 0;
        int rightPt = numbers.length-1;
        while(numbers[leftPt]+numbers[rightPt]!=target){
            int sum = numbers[leftPt]+numbers[rightPt];
            if(sum>target){
                rightPt--;
            }
            else if(sum < target){
                leftPt++;
            }
        }
        indices[0] = leftPt+1;
        indices[1] = rightPt+1;
        return indices;
    }
}