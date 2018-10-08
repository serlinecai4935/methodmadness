public class scaiLib{
    //String Methods: dateStr

    /**
     * puts the string in order by date-month-year
     * @param Name is the full date that is rearranges
     * @return a string with the full date in the desired format
     */
    public static String dateStr(String Name){
        String date = Name.substring(3,5);
        String month = Name.substring(0,2);
        String year = Name.substring(6,10);

        return (date + " - " + month + " - "  + year);
    }


    //String Methods: isPalindrome

    /**
     * determines if the string you input is a palindrome
     * @param str The word that is being checked
     * @return true if it is a palindrome and false if it is not
     */
    public static boolean isPalindrome(String str){
        int n= str.length();
        for (int i=0; i < n ;i++)
        {
            if(str.charAt(i) != str.charAt(n-i-1))
            {

                return false;
            }

        }
        return true;
    }

    // math methods: sumUpTo

    /**
     * prints the index of the numbers starting from 0 to the input
     * @param n the integer that it is counting
     * @return the sum of numbers starting from 0 to the integer n
     */
    public static int sumUpTo(int n){
        int sum = 0;
        for (int i = 0; i<=n; i++)
        {
            sum+=1;
        }
        return sum;
    }


    // string methods: cutOut

    /**
     * will remove the first occurrence of subStr from mainStr
     * @param mainStr the string that is being checked for by subStr
     * @param subStr the string that is being removed from mainStr
     * @return mainStr without subStr in it
     */
    public static String cutOut(String mainStr, String subStr){
        int index = mainStr.indexOf(subStr);
        if (index == -1)
        {
            return mainStr;
        }
        String first = mainStr.substring(0, index);
        String last = mainStr.substring(index + subStr.length());
        return first + last;
    }

    //math methods: primePrinter

    /**
     * checks to see is the number is prime
     * @param n the number you are inputting
     * @return true if the number is prime, false if the number isn't prime
     */
    public static boolean isPrime (int n)
    {
        for (int i = 2; i<n; i++)
        {
            if (n%i == 0)
            {
                return false;
            }
        }
        return true;
    }

    /**
     * prints the list of prime numbers
     * @param num the number of prime numbers being printed
     */
    public static void primePrinter(int num)
    {
        int count = 0;
        int prime = 2;
        while (count < num)
        {
            if (isPrime(prime))
            {
                System.out.println(prime);
                count++;
            }
            prime ++;
        }
    }
    
}

