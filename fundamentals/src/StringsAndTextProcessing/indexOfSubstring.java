package StringsAndTextProcessing;

public class indexOfSubstring {
    public static void main(String[] args) {
        String frase = "fdgsdafv<fsdsaf>dfsvfdsavfdg<  fadvgfadbvs <a , sdagfdhgqfagfa /> gaewqgvfwbw>";

        int start = frase.indexOf("<a ");
       frase = frase.substring(start);
       int end = frase.indexOf(">");

      String Ffrase = frase.substring(0,end + 1);
        System.out.println(Ffrase);
    }
}
