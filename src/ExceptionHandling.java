import java.util.LinkedList;

public class ExceptionHandling {
    public static void main(String[] args) {
    int x = 1;

        do {
            try {
                LinkedList languages = new LinkedList();
                languages.push("Python");
                languages.push("Java");
                languages.push("C#");

                while (true) {
                    String oneLanguage = (String) languages.pop();
                    System.out.println(oneLanguage);
                    x = 2;
                }

            } catch (Exception e) {
                System.out.println("That is not an applicable operation, please try again.");
            }
            }while (x == 1) ;
    }
}
