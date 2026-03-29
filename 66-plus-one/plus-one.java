import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] plusOne(int[] digits) {
List<Integer> arr = new ArrayList<>();

int carry = 1;  // we are adding 1

for(int i = digits.length - 1; i >= 0; i--){
    int sum = digits[i] + carry;

    if(sum == 10){
        arr.add(0);
        carry = 1;
    } else {
        arr.add(sum);
        carry = 0;
    }
}

// if carry still remains
if(carry == 1){
    arr.add(1);
}

// reverse list
Collections.reverse(arr);

int[] result = arr.stream().mapToInt(Integer::intValue).toArray();
return result;


// does not work for big inputs
// int num = 0;
// for(int i = 0; i<digits.length; i++){
//     num = num*10 + digits[i];
// } 
//     num = num+1;
//     List<Integer> arr = new ArrayList<>();

//     while(num > 0){
//         arr.add(num%10);
//         num= num/10;
//     }
//     Collections.reverse(arr);

//     int[] result = arr.stream().mapToInt(Integer::intValue).toArray();
//     return result;
    }
}