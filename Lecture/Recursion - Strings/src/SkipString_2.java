public class SkipString_2 {
    public static void main(String[] args) {
        // skip a string if it's not the required string
        System.out.println(skipAppNotApple("baccapplefghappl"));
    }
    static String skipAppNotApple(String unprocessed) {
        if(unprocessed.isEmpty()){
            return "";
        }

        if(unprocessed.startsWith("app") && !unprocessed.startsWith("apple")){
            return skipAppNotApple(unprocessed.substring(3));
        } else {
            return unprocessed.charAt(0) + skipAppNotApple(unprocessed.substring(1));
        }
    }
}
