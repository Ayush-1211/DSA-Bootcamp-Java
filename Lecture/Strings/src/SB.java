public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<26; i++){
            char ch = (char)('a' + i);
            builder.append(ch);     // String Builder not create an new object everytime, it will add new char in the same string
        }
        System.out.println(builder.toString());
    }
}
