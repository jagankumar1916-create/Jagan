class SplitString {
    public static void main(String[] args) {
        String sentence = "Java is very easy";
        String[] words = sentence.split(" ");

        String result = "";

        for (String word : words) {
            result = result + word + "-";
        }

        System.out.println(result);
    }
}
