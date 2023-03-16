public class TestGitSimple {

    public static void print(String[] words){
        for (String i: words) {
            System.out.println(i);
        }
    }
    public static void printWithNumber(String[] words){
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + " " + (i + i));
        }
    }
}
