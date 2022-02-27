import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String example = "Regular Expressions or Regex is an API for defining String patterns that can be used for searching, manipulating and editing a text. It is widely used to define a constraint on strings such as a password. Regular Expressions are provided under java.util.regex package.";
        Pattern pattern = Pattern.compile("\\bs[a-z]*?s\\b");
        Matcher matcher = pattern.matcher(example);

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(example.substring(start, end) + "\nfrom " + start + " to " + (end));
        }


    }
}
