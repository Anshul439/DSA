public class Defanging {
    public static void main(String[] args) {
        String s = "255.100.50.0";
        Defang(s);
    }

    public static void Defang(String s) {
        System.out.println(s.replace(".", "[.]"));
    }
}
