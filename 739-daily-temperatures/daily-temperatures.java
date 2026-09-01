class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // int arr[] = new int[temperatures.length], count = 0; 

        // for(int i = 0; i<temperatures.length-1; i++){
        //     int val = temperatures[i];
        //     for(int j = i+1; j<temperatures.length; j++){
        //         if(temperatures[j] > val) {
        //             arr[i] = ++count;
        //             break;
        //         }
        //         else count++;
        //     }
        //     count = 0;
        // }
        // return arr;


// Recursive approach



    //     int arr[] = new int[temperatures.length];
    //     for(int i = 0; i<temperatures.length; i++){
    //         int start = i+1, count = 0;
    //         arr[i] = warmerdayafter(temperatures[i],temperatures,start,temperatures.length);
    //     }
    //     return arr;
    // }
    
    // public static int warmerdayafter(int value, int arr[], int start, int end) {
    //     // Base case 1: Reached the end without finding a warmer day
    //     if (start >= end) return 0;
        
    //     // Base case 2: Found a warmer day
    //     if (arr[start] > value) return 1;

    //     // Recursive step: temperature <= value
    //     int next = warmerdayafter(value, arr, start + 1, end);
    //     return (next == 0) ? 0 : 1 + next;
    // }





        int n = temperatures.length;
        int[] result = new int[n];
        Deque<Integer> stack = new ArrayDeque<>(); // stores indices

        for (int i = 0; i < n; i++) {
            // While the current temperature is warmer than the temperature at the stack's top index
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }

        return result;
    }
}
