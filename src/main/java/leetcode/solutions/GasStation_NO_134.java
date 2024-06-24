package leetcode.solutions;

public class GasStation_NO_134 {
	
    public int canCompleteCircuit(int[] gas, int[] cost) {
    	return canCompleteCircuit_Recursive(gas, cost, 0);
    }
    
    public int canCompleteCircuit_Recursive(int[] gas, int[] cost, int startPoint) {
    	
    	if(startPoint >= cost.length) {
    		return -1;
    	}
    	
    	int pointer = startPoint, tank = 0;
    	boolean init = true;
    	
    	while (pointer != startPoint || init) {
    		init = false;
    		
    		tank += gas[pointer] - cost[pointer];
    		if(tank < 0) {
    			if(pointer < startPoint) {
    				return -1;
    			} else {
        			return canCompleteCircuit_Recursive(gas, cost, pointer+1);
    			}
    		}
    		
    		pointer += 1;
    		
    		if(pointer >= cost.length) {
    			pointer = 0;
    		}
    	}
    	
    	return startPoint;
    }
    
    
    public int canCompleteCircuit_too_slow(int[] gas, int[] cost) {
    	
    	int[] costVsFuel = new int[gas.length];
    	int totalGasVsTravel = 0;
    	for (int i = 0; i < gas.length; i++) {
    		costVsFuel[i] = gas[i]-cost[i];
    		
    		totalGasVsTravel += costVsFuel[i];
		}
    	
    	//This number should be positive or 0 if a solution exists
    	if(totalGasVsTravel < 0) {
    		return -1;
    	}
    	
    	for (int i = 0; i < costVsFuel.length; i++) {
    		if(costVsFuel[i] >= 0) {
				int leftOver = 0;

    			for (int j = 0; j < costVsFuel.length; j++) {
    				int idx = (i + j);
    				idx = idx >= costVsFuel.length ? idx % costVsFuel.length : idx;
    				leftOver += costVsFuel[idx];
    				
    				if(leftOver < 0) {
    					break;
    				}
				}
    			
    			if(leftOver >= 0) {
    				return i;
    			}
    		}
		}
    	
		return -1;
    }
}
