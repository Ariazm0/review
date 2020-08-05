package day0805;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-08-05
 * Time: 16:06
 */
public class Test1 {
    public static boolean isAdmin(String s) {
        String ret = s.toLowerCase();
        System.out.println(ret);
        return s.toLowerCase() == "admin";
    }

    public static void main(String[] args) {
        System.out.println(isAdmin("Admin"));
    }
}
