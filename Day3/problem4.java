package Day3;

public class problem4 {
    public int trailingZeroes(int n) {

        int count = 0;

        while (n > 0) {
            n /= 5;
            count += n;
        }

        return count;
    }
}

