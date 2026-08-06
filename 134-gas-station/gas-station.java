class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

    //     int gas_tank = 0;
    //     int index = -1;
    //   for(int i = 0; i < gas.length; i++){
    //     if(gas[i % (cost.length-1)] >= cost[i % (cost.length-1)]){
    //         int target = i;
    //         gas_tank += gas[i % (cost.length-1)];
    //         i++;
    //         gas_tank = gas_tank + gas[i % (cost.length-1)] - cost[i % (cost.length-1)];
    //         while(i % (gas.length-1) != target){
    //             if(gas_tank >= cost[i % (cost.length-1)]){
    //             gas_tank = gas_tank + gas[i % (gas.length-1)] - cost[i % (cost.length-1)];
    //             index = i;
    //             if(i % (gas.length-1) == target)
    //             break;

    //             i++;
    //             }
    //             else return -1;
    //         }

    //     }
    //   } 
    //   return index;


 int total = 0;
        int tank = 0;
        int start = 0;
        for(int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            total += diff;
            tank += diff;
            if(tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }
        return total >= 0 ? start : -1;
    }
}