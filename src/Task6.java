public class Task6 {
    public static void main(String[] args) {
        String fullName = "ivanov ivan ivanovich";


        String lastName = fullName.substring(0, fullName.indexOf(' '));
        char[] l = lastName.toCharArray();
        l[0] = Character.toUpperCase(l[0]);
        String lastName2 = new String(l);

        String firstName = fullName.substring(fullName.indexOf(' ') + 1, fullName.lastIndexOf(' '));
        char[] f = firstName.toCharArray();
        f[0] = Character.toUpperCase(l[0]);
        String firstName2 = new String(f);

        String middleName = fullName.substring(fullName.lastIndexOf(' ') + 1);
        char[] m = middleName.toCharArray();
        m[0] = Character.toUpperCase(l[0]);
        String middleName2 = new String(m);

        System.out.println(lastName2 + " " + firstName2 + " " + middleName2);

    }
}
