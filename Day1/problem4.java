package Day1;

public class problem4 {
  public static void main(String[] args){
        int a=134;
        int b=a%10;
        a=a/10;
        int c=a%10;
        a=a/10;
        int i=(b*10)+c;
        int j=(i*10)+a;
        System.out.println(j);
    }
}  

