class Solution {


    public int twoCitySchedCost(int[][] costs) {
        
        int n = costs.length;
        List <PersosFlyCost> costList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            costList.add(new PersosFlyCost(costs[i][0], costs[i][1]));
        }
        Collections.sort(costList);
        
        int total = 0;
        for (int i = 0; i < n; i++) {
            if (i < n/2) {
                total += costList.get(i).A;
            } else {
                total += costList.get(i).B;
            }
        }
        
        return total;
    }
}

class PersosFlyCost implements Comparable <PersosFlyCost> {

    int A;
    int B;

    PersosFlyCost(int A, int B) {
        this.A = A;
        this.B = B;
    }

    @Override
    public int compareTo(PersosFlyCost other) {
        return Integer.compare((this.A - this.B), (other.A - other.B));
    }
}
