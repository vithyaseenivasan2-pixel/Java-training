package Day2;

public class problem2 {
     public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {

        if (k <= numOnes) {
            return k;
        }

        if (k <= numOnes + numZeros) {
            return numOnes;
        }

        return numOnes - (k - numOnes - numZeros);
    }
}

