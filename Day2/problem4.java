package Day2;

public class problem4 {
     public int passThePillow(int n, int time) {

        int cycle = n - 1;
        int rem = time % cycle;

        if ((time / cycle) % 2 == 0) {
            return rem + 1;
        } else {
            return n - rem;
        }
    }
}

