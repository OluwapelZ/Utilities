import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Factorial fact = new Factorial();
        System.out.print(fact.fact(scanner.nextInt()));

    }

    public int fact(int n){
        if(n == 1); // base call

        else{
            n *= fact(n - 1);
        }

        return n;
    }
}