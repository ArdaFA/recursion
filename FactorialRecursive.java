public class FactorialRecursive {

    public static int factorial(int number) throws Exception {
        int result;
        if(number <= 0){
            throw new Exception("the number has to be positive");
        }

        else if (number == 1 || number == 2){
            return number;
        }
        else {
            result = number * (factorial(number-1));
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        int number = Integer.parseInt(args[0]);
        number = factorial(number);
        System.out.println(number);
    }
}