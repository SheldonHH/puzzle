public class CompareStrings {
    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public static void main(String []args){
        compareStrings("AB","ABB");
    }
    public static boolean compareStrings(String A, String B) {
        int[] AA = new int[26];
        int[] BB = new int[26];
        for (int i=0; i<A.length(); i++) {
            System.out.println(A.charAt(i) - 'A');
            AA[A.charAt(i) - 'A']++;
            System.out.println(A.charAt(i) - 'A');
        }
        for (int i=0; i<B.length(); i++) {
            BB[B.charAt(i) - 'A']++;
            if (BB[B.charAt(i) - 'A'] > AA[B.charAt(i) - 'A']) return false;
        }
        return true;
    }
}