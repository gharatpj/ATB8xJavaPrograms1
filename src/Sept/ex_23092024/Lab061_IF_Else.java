package Sept.ex_23092024;

public class Lab061_IF_Else {
    public static void main(String[] args) {
        // char c = 'a' -> Vowel or consonant
        // vowel -> a,e,i,o,u
        char ch = 'P';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u') {
            System.out.println("vowel");
        }else {
            System.out.println("consonant");
        }
    }
}
