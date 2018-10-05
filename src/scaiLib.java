public class scaiLib{
    //String Methods: dateStr
    public static String dateStr(String Name){
        String date = Name.substring(3,5);
        String month = Name.substring(0,2);
        String year = Name.substring(6,10);

        return (date+"-"+month+"-"+year);
    }


    //String Methods: isPalindrome
    public static boolean isPalindrome(String str){
        int s= str.length();
        for (int i=0; i<s/2;i++)
        {
            if(str.charAt(i) != str.charAt(s-i-1)){

                return false;
            }

        }
        return false;
        //math methods: prime printer
    }
}