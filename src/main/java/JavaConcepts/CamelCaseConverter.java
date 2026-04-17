package JavaConcepts;

public class CamelCaseConverter {
    private CamelCaseConverter() {
    }

    public static String toSnakeCase(String sentence) {
        if (sentence == null || sentence.isBlank()) {
            return "";
        }
        return sentence.trim().replaceAll("\\s+", "_");
    }

    public static String toTitleCase(String sentence) {
        if (sentence == null || sentence.isBlank()) {
            return "";
        }

        StringBuilder builder = new StringBuilder();
        String[] words = sentence.trim().split("\\s+");

        for (String word : words) {
            String firstLetter = word.substring(0, 1).toUpperCase();
            String remainingLetters = word.substring(1);
            builder.append(firstLetter).append(remainingLetters).append(' ');
        }

        return builder.toString().trim();
    }

    public static void main(String[] args) {
        String sentence = "my name is ritika";
        System.out.println(toSnakeCase(sentence));
        System.out.println(toTitleCase(sentence));
    }
}
