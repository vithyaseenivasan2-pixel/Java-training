package Day6;

public class problem2 {
    
    public String bestHand(int[] ranks, char[] suits) {

        // Check Flush
        boolean flush = true;
        for (int i = 1; i < suits.length; i++) {
            if (suits[i] != suits[0]) {
                flush = false;
                break;
            }
        }

        if (flush) {
            return "Flush";
        }

        // Count ranks
        int[] count = new int[14];

        for (int rank : ranks) {
            count[rank]++;
        }

        boolean pair = false;

        for (int c : count) {
            if (c >= 3) {
                return "Three of a Kind";
            }
            if (c == 2) {
                pair = true;
            }
        }

        if (pair) {
            return "Pair";
        }

        return "High Card";
    }
}

