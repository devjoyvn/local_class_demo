import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final String EMAIL_REGEX = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";

    public static void validateEmail(String emailParam) {
        int maxLength = 50;

        class Email {
            private String email = null;

            Email(String email) {
                if (validate(email)) {
                    this.email = email;
                }
            }



            public boolean validate(String email) {
                if (email.length() > maxLength) {
                    return false;
                }

                Pattern pattern = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(email);
                return matcher.find();
            }

            public void printEmail() {
                System.out.println(emailParam);
            }

            public String getEmail() {
                return email;
            }
        }

        Email emailValidate = new Email(emailParam);
//      emailValidate.printEmail();

        if (emailValidate.getEmail() == null) {
            System.out.println(emailParam + " Khong hop le");
        } else {
            System.out.println(emailParam + " Hop le");
        }
    }

    public static void exampleStaticAcceptLocalClass() {
        class LocalClass {
            public static final String staticMember = "Static member";
            public void print() {
                System.out.println(staticMember);
            }
        }
        LocalClass myEnglishGoodbye = new LocalClass();
        myEnglishGoodbye.print();
    }


    public static void main(String[] args) {
        validateEmail("nthanhhai2909@gmail.com");
        exampleStaticAcceptLocalClass();
    }
}
