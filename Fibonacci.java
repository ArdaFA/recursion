public class Fibonacci {

    public static int iterativeFibonacci(int number){
        if (number <= 0) {
            return 0;
        }

        int result = 0;

        int previous = 1;
        int beforePrevious = 1;

        for(int i = 0; i < number - 2; i++){
            result = previous + beforePrevious;
            int temp = result;
            beforePrevious = previous;
            previous = temp;
        }
        return result;
    }

    public static int fibonacci(int number) throws IllegalArgumentException{
        int result;
        if (number <= 0){
            throw new IllegalArgumentException("the number must be positive");
        } else if (number == 1) {
            return 1;
        }
        else if(number == 2){
            return 1;
        }
        else{
            result = fibonacci(number-1) + fibonacci(number-2);
        }
        return result;
    }

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        System.out.println(fibonacci(number));
    }
}
