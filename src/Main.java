public class Main {
    public static void main(String[] args) {
       System.out.println(SumOfNumbers(2));
       RecursiveCountdown(10);

    }

    public static int SumOfNumbers(int n){
        if(n==1){
            return 1;
        }
        return n+SumOfNumbers(n-1);
    }

    public static void RecursiveCountdown(int n){
        if (n==1){
            System.out.println(1);
        }
        else {
            System.out.println(n);
            RecursiveCountdown(n - 1);
        }
    }

    public static int factorial (int n){
        //base case
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    /**
     * Recursive sums all of the elements of an array
     *
     * @param arrayIn array you want to sum
     *
     * @return
     */

    public static int sumArray(int[] arrayIn, int n){
        //base case, array length is 0
        if (n == 0){
            return 0;
        }
        return arrayIn[n-1]+sumArray(arrayIn, n-1);
    }
}