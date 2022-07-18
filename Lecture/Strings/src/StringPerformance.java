public class StringPerformance {
    public static void main(String[] args) {
        String series = "";
        for(int i=0; i<26; i++){
            char ch = (char)('a' + i);      // This will create a new object everytime so the performance is not so good
            System.out.println(ch);
        }
    }
}
