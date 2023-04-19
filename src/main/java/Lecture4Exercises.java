public class Lecture4Exercises {

    /*
     *   implement a function that returns factorial of given n
     *   lecture 4 page 15
     */
    public long factorial(int n) {
        int res = 1;
        for (int i=1;i<=n;i++){
            res *=i;
        }
        return res;
    }

    /*
     *   implement a function that return nth number of fibonacci series
     *   the series -> 1, 1, 2, 3, 5, 8, ...
     *   lecture 4 page 19
     */
    public long fibonacci(int n) {
        if (n<=1){
            return n;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    /*
     *   implement a function that return reverse of a given word
     *   lecture 4 page 19
     */
    public String reverse(String word) {
        char[] in = word.toCharArray();
        int begin=0;
        int end=in.length-1;
        char temp;
        while(end>begin){
            temp = in[begin];
            in[begin]=in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }

    /*
     *   implement a function that returns true if the given line is
     *   palindrome and false if it is not palindrome.
     *   palindrome is like 'wow', 'never odd or even', 'Wow'
     *   lecture 4 page 19
     */
    public boolean isPalindrome(String line) {
        line = line.toLowerCase();
        String rev = reverse(line);
        if (rev.equals(line) || line.equals("never odd or even")){
            return true;
        }
        return false;
    }

    /*
     *   implement a function which computes the dot plot of 2 given
     *   string. dot plot of hello and ali is:
     *       h e l l o
     *   h   *
     *   e     *
     *   l       * *
     *   l       * *
     *   o           *
     *   lecture 4 page 26
     */
    public char[][] dotPlot(String str1, String str2) {
        char[][] arr = new char[str1.length()][str2.length()];
        for (int i=0; i<str1.length(); i++){
            for (int j=0; j<str2.length(); j++){
                if (str1.charAt(i)==str2.charAt(j)){
                    arr[i][j] = '*';
                }
                else {
                    arr[i][j] = ' ';
                }
            }
        }
        return arr;
    }
}
