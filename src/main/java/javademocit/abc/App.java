package javademocit.abc;

public class App 
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
    }

    public long calculatefactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}