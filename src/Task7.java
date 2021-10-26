public class Task7 {
    public static void main(String[] args) {
        String firstString = "135";
        String secondString = "246";
        StringBuilder sb = new StringBuilder(firstString);
        StringBuilder sb1 = new StringBuilder(secondString);
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            sb2.append(sb.substring(i, i + 1));
            sb2.append(sb1.substring(i, i + 1));
        }
        System.out.println(sb2);
    }
}




