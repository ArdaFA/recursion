public class FactorialRecursive {

    public static int recFactorial(int number){
        if (number <= 0){
            return 1;
        }
        return number * recFactorial(number-1);
    }

    public static void main(String[] args) throws Exception {
        int number = Integer.parseInt(args[0]);
        number = recFactorial(number);
        System.out.println(number);
    }
}
