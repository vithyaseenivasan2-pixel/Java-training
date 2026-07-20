package Day3;

public class problem2 {
     public int numWaterBottles(int numBottles, int numExchange) {

        int total = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {
            int newBottles = empty / numExchange;
            total += newBottles;
            empty = newBottles + (empty % numExchange);
        }

        return total;
    }
}

