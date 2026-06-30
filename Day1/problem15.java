package Day1;
public class problem15 {
     static {
        System.out.println("1. Static Block");
    }
 problem15() {
        System.out.println("2. Constructor");
    }
 public static void main(String[] args) {
       problem15 f = new problem15();
        System.out.println("3. Main Method");
    }
}

