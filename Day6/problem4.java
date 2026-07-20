package Day6;

public class problem4 {
   
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] check = new boolean[26];

        for (char c : allowed.toCharArray()) {
            check[c - 'a'] = true;
        }

        int count = 0;

        for (String word : words) {
            boolean consistent = true;

            for (char c : word.toCharArray()) {
                if (!check[c - 'a']) {
                    consistent = false;
                    break;
                }
            }

            if (consistent) {
                count++;
            }
        }

        return count;
    }
}

