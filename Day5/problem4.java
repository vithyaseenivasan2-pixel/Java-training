package Day5;

public class problem4 {
   
    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int give = 1;
        int index = 0;

        while (candies > 0) {
            result[index] += Math.min(give, candies);
            candies -= Math.min(give, candies);

            give++;
            index = (index + 1) % num_people;
        }

        return result;
    }
}

