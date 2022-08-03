import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        System.out.println(pad("", "12"));
        System.out.println(padRet("", "12").size());
        System.out.println(padCount("", "12"));
    }
    static ArrayList<String> pad(String processed, String unprocessed) {
        if(unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        int digit = unprocessed.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        for(int i=(digit-1)*3; i<digit*3; i++){
            char ch = (char)('a' + i);
            ans.addAll(pad(processed + ch, unprocessed.substring(1)));
        }
        return ans;
    }

    static ArrayList<String> padRet(String processed, String unprocessed) {
        if(unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        int digit = unprocessed.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        for(int i=(digit-1)*3; i<digit*3; i++){
            char ch = (char)('a' + i);
            ans.addAll(padRet(processed + ch, unprocessed.substring(1)));
        }
        return ans;
    }

    static int padCount(String processed, String unprocessed) {
        if(unprocessed.isEmpty()) {
            return 1;
        }
        int count = 0;
        int digit = unprocessed.charAt(0) - '0';
        for(int i=(digit-1)*3; i<digit*3; i++){
            char ch = (char)('a' + i);
            count = count + padCount(processed + ch, unprocessed.substring(1));
        }
        return count;
    }
}
