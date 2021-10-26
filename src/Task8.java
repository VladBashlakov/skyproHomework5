public class Task8 {
    public static void main(String[] args) {
        String string = "aabccddefgghiijjkk";
        StringBuilder sb = new StringBuilder();
        char[] c = string.toCharArray();
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == c[i + 1]) {
                sb.append(c[i]);
            }
        }
        System.out.println(sb);
    }
}
