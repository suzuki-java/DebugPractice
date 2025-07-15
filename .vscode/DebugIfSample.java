public class DebugIfSample {
    public static void main(String[] args) {
        int score = 75;

        String result;
        if (score >= 90) {
            result = "A";
        } else if (score >= 80) {
            result = "B";
        } else {
            result = "C";
        }

        System.out.println("成績は: " + result);
    }
}
