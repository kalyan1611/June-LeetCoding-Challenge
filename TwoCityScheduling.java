class Solution {


    public int twoCitySchedCost(int[][] costs) {
        
        int n = costs.length;
        List <PersonFlyCost> costList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            costList.add(new PersonFlyCost(costs[i][0], costs[i][1]));
        }
        Collections.sort(costList);
        
        int total = 0;
        for (int i = 0; i < n/2; i++) {
            total += costList.get(i).A;
        }
        for (int i = n/2; i < n; i++) {
            total += costList.get(i).B;
        }
        
        return total;
    }
}

class PersonFlyCost implements Comparable <PersonFlyCost> {

    int A;
    int B;

    PersonFlyCost(int A, int B) {
        this.A = A;
        this.B = B;
    }

    @Override
    public int compareTo(PersonFlyCost other) {
        return Integer.compare((this.A - this.B), (other.A - other.B));
    }
}
