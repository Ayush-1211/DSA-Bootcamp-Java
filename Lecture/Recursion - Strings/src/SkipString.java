public class SkipString {
    public static void main(String[] args) {
        System.out.println(skipApple("bccdapplefg"));
    }
    static String skipApple(String unprocessed) {
        if(unprocessed.isEmpty()){
            return "";
        }

        if(unprocessed.startsWith("apple")){
            return skipApple(unprocessed.substring(5));
        } else {
            return unprocessed.charAt(0) + skipApple(unprocessed.substring(1));
        }
    }
}
