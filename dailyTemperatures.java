/*Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.
*/
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length]; // initialize with 0s so we don't have to manually add 0s if none is compliant later on
        Stack<Integer> stack = new Stack<>(); // storing index of temperature
        
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int stackIndex = stack.pop();
                result[stackIndex] = i - stackIndex;
            }
            stack.push(i);
        }
        return result;
    }
}
