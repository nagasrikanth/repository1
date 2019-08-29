package First;

import java.util.ArrayList;
import java.util.List;

public class Nagasecond {
    static int budgetShopping(int n, List bundleQuan, List bundleCost) {
         int[] bundleQuantities = bundleQuan.stream().mapToInt(i->(int)i).toArray();
         
         int[] bundleCosts =  bundleCost.stream().mapToInt(i->(int)i).toArray(); 

    	return exploreCombinations(n, 0, 0, bundleQuantities, bundleCosts);
    }

    static int exploreCombinations(int budget, int currentQuantity, int currentCost, int[] bundleQuantities, int[] bundleCosts) {
        int maxQuantity = currentQuantity;
        for (int i = 0; i < bundleQuantities.length; i++) {
            if (currentCost + bundleCosts[i] <= budget) {
                int amount = exploreCombinations(budget, currentQuantity + bundleQuantities[i], currentCost + bundleCosts[i], bundleQuantities, bundleCosts);
                if (maxQuantity < amount) {
                    maxQuantity = amount;
                }
            }
        }
        return maxQuantity;
    }

    public static void main(String[] args) {

        List quantities = new ArrayList();
        quantities.add(20);
        quantities.add(19);
        
        
        List costs = new ArrayList();
        costs.add(24);
        costs.add(20);

        int i = budgetShopping(50, quantities, costs);
        System.out.println("Max shopping "+i);
    }
}