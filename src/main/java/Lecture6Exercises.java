import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lecture6Exercises {

    /*
     *   implement a function that takes an array of int and return sum of
     *   elements at even positions
     *   lecture 6 page  16
     */
    public long calculateEvenSum(int[] arr) {
        long res = 0;
        for (int i=0;i<arr.length;i+=2){
            res += arr[i];
        }
        return res;
    }

    /*
     *   implement a function that takes an array of int and return that
     *   array in reverse order
     *   lecture 6 page 16
     */
    public int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i=arr.length-1;i>=0;i--){
            rev[arr.length-i-1] = arr[i];
        }
        return rev;
    }

    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {
        double[][] res = new double[m1[0].length][m2.length];
        if (m1[0].length != m2.length){
            throw new RuntimeException("Unable Product");
        }
        else {
            for (int i=0;i<m1.length;i++){
                for (int j=0;j<m2[0].length;j++){
                    for (int k=0;k<m1[0].length;k++){
                        res[i][j] += m1[i][k] * m2[k][j];
                    }
                }
            }
            return res;
        }
    }

    /*
     *   implement a function that return array list of array list of string
     *   from a 2-dim string array
     *   lecture 6 page 30
     */
    public List<List<String>> arrayToList(String[][] names) {
        List<List<String>> res = new ArrayList<>();
        for (int i=0;i< names.length;i++){
            List<String> res1 = new ArrayList<String>(Arrays.asList(names[i]));
            res.add(res1);
        }
        return res;
    }

    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending order
     *   lecture 6 page 30
     */
    public List<Integer> primeFactors(int n) {
        List<Integer> res = new ArrayList<>();
        for(int i = 2; i <= n; i++){
            if(n%i == 0){
                res.add(i);
                while (n%i==0){
                    n /= i;
                }
            }
        }
        return res;
    }

    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public List<String> extractWord(String line) {
        return null;
    }
}
