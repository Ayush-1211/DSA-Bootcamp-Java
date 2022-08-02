import java.util.ArrayList;

public class Subsequence_ASCII {
    public static void main(String[] args) {
        subseqASCII("", "abc");
        System.out.println(subseqRetASCII("", "abc"));
    }
    static void subseqASCII(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        subseqASCII(processed + ch, unprocessed.substring(1));
        subseqASCII(processed , unprocessed.substring(1));
        subseqASCII(processed + (ch + 0), unprocessed.substring(1));
    }

    // using return ArrayList
    static ArrayList<String> subseqRetASCII(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);
        ArrayList<String> first = subseqRetASCII(processed + ch, unprocessed.substring(1));
        ArrayList<String> second = subseqRetASCII(processed , unprocessed.substring(1));
        ArrayList<String> third = subseqRetASCII(processed + (ch + 0) , unprocessed.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
