public class Task5 {
    public static void main(String[] args) {
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Имя сотрудника — " + fullName.substring(fullName.indexOf(' ') + 1, fullName.lastIndexOf(' ')));
        System.out.println("Фамилия сотрудника — " + fullName.substring(0, fullName.indexOf(' ')));
        System.out.println("Отчество сотрудника — " + fullName.substring(fullName.lastIndexOf(' ') + 1));
    }
}
