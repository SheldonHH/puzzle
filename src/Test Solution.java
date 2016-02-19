import java.util.*;
public class TestSolution{
    public static void main(String []args){
        ArrayList<String> result = new ArrayList<String>();
        System.out.println("Key in Your IP Address: ");
        Scanner sc = new Scanner(System.in);
        String inputIP = sc.nextLine();
        result = new Solution().restoreIpAddresses(inputIP);
        for(int i=0; i<result.size();i++){
            System.out.println(result.get(i));
        }
    }
}