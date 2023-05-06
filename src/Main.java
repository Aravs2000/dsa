import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }

        Boolean result = isIsomorphic("egg","add");
        System.out.println(result);
    }
    private static boolean isIsomorphic(String s, String t){
        if(s.length()!=t.length()) return false;

        HashMap<Character, Integer> sTracker =  new HashMap<Character,Integer>();
        HashMap<Character, Integer> tTracker =  new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(sTracker.get(s.charAt(i))!=tTracker.get(t.charAt(i))) return false;
            sTracker.put(s.charAt(i),i+1);
            tTracker.put(t.charAt(i),i+1);
        }
        return true;
    }
}