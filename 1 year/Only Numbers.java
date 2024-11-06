public class Number {
    public static boolean containsOnlyNumbers(String str) 
    {
        if (str == null || str.isEmpty()) //fals keine eingabe
        {
            return false;
        }
        
        for (char c : str.toCharArray()) 
        {
            if (!Character.isDigit(c)) // Es schaut ob die Charactere zahlen sind fals ja return false
            {
                return false;
            }
        }
        return true; //sonst hat es nur zahlen somit return true
    }

    public static void main(String[] args) 
    {
        String str1 = "12345"; //die beiden Strings(könnten auch eingaben sein)
        String str2 = "abc123";
        
        System.out.println(str1 + " enthält nur Zahlen: " + containsOnlyNumbers(str1)); //printed das Ergäbnis
        System.out.println(str2 + " enthält nur Zahlen: " + containsOnlyNumbers(str2));
    }
}
