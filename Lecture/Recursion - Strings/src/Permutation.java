import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        permutations("", "abc");
        System.out.println("-------------------");
        ArrayList<String> ans = permutationsList("", "abc");
        System.out.println(ans);
        System.out.println("-------------------");
        System.out.println(permutationsCount("", "abc"));
    }
    static void permutations(String processed, String unprocessed) {
        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        for(int i=0; i<=processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            permutations(first + ch + second, unprocessed.substring(1));
        }
    }

    // return arraylist
    static ArrayList<String> permutationsList(String processed, String unprocessed) {
        if(unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for(int i=0; i<=processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            ans.addAll(permutationsList(first + ch + second, unprocessed.substring(1)));
        }
        return ans;
    }

    // count total numbers of permutation
    static int permutationsCount(String processed, String unprocessed) {
        if(unprocessed.isEmpty()) {
            return 1;
        }
        char ch = unprocessed.charAt(0);
        int count = 0;
        for(int i=0; i<=processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            count = count + permutationsCount(first + ch + second, unprocessed.substring(1));
        }
        return count;
    }
}
