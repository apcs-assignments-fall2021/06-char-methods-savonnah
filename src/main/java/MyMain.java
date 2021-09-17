public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
            return ch;
        } else if (ch >= 'a' && ch <= 'z') {
            return ch;
        }
        return ch;
    }
    // Changes a lowercase letter to an uppercase letter
    // If the char is not a lowercase letter,
    // it is returned unchanged.
    public static char toUpper(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return ch;
        } else if (ch >= 'a' && ch <= 'z') {
            ch = (char) (ch - 32);
            return ch;
        }
        return ch;
    }

    // The method is given a String as input and returns a
    // new String where all of the numbers have been removed
    // from the original String.
    public static String removeNumbers(String str) {
        int length = str.length();
        for (int i = length; i<=length; i++){
            char ch = (char)(i);
            if(ch == )
        }
        return "!!!";
    }

    // Write some code to test your methods!
    public static void main(String[] args) {
        System.out.println();
        System.out.println("toLower Tests:");
        System.out.println(toLower('J')); // 'j'
        System.out.println(toLower('Z')); // 'z'
        System.out.println(toLower('a')); // 'a'
        System.out.println(toLower('z')); // 'z'

        System.out.println();
        System.out.println("toUpper Tests:");
        System.out.println(toUpper('J')); // 'J'
        System.out.println(toUpper('Z')); // 'Z'
        System.out.println(toUpper('a')); // 'A'
        System.out.println(toUpper('z')); // 'Z'
    }
}
