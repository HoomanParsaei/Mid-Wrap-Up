import java.util.Random;

public class Lecture5Exercises {

    /*
     *   implement a function to create a random password with
     *   given length using lower case letters
     *   lecture 5 page 14
     */
    public String weakPassword(int length) {
        String letter = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder password = new StringBuilder();
        Random random = new Random();
        int i = 0;
        while(i<length){
            int index = random.nextInt(26);
            password.append(letter.charAt(index));
            i++;
        }
        return password.toString();
    }

    /*
     *   implement a function to create a random password with
     *   given length and at least 1 digit and 1 special character
     *   lecture 5 page 14
     */
    public String strongPassword(int length) throws Exception {
        if (length<3){
            throw new Exception("Length must greater than 2");
        }
        else {
            Random random = new Random();
            String letters = "abcdefghijklmnopqrstuvwxyz";
            String numbers = "0123456789";
            String special_char = "~!@#$%^&*()_-/";
            String password = "";
            password += numbers.charAt(random.nextInt(10));
            password += special_char.charAt(random.nextInt(14));
            int i=0;
            while (i<length-2){
                password += letters.charAt(random.nextInt(26));
                i++;
            }
            return password;
        }
    }

    /*
     *   implement a function that checks if a integer is a fibobin number
     *   integer n is fibobin is there exist an i where:
     *       n = fib(i) + bin(fib(i))
     *   where fib(i) is the ith fibonacci number and bin(i) is the number
     *   of ones in binary format
     *   lecture 5 page 17
     */
    public boolean isFiboBin(int n) {
        return false;
    }
}
