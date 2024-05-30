import java.lang.String;
public class PassW {
    private String Pass;

    public PassW(String str)
    {
        this.Pass=str;
    }
    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public static boolean isValid(String str) {
        if (str == null) {
            return false;
        }
        if (str.length() < 5 || str.length() > 9) {
            return false;
        }
        if (!str.matches("[a-zA-Z0-9]+")) {
            return false;
        }
        return str.matches(".*[a-zA-Z].*") && str.matches(".*[0-9].*");
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        PassW a=new PassW("dasdasd");
    }
}