public class Main {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("Task-1");
String middleName ="Ivanov";
String firstName = "Ivan";
String lastName = "Ivanovich";
    String fullName = middleName + " " + firstName + " " + lastName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
            System.out.println();

        System.out.println("Task-2");
System.out.println(fullName.toUpperCase());
    System.out.println();

        System.out.println("Task-3");
String fullName2 = "Иванов Семён Семёнович";
    String finalFullName2 = fullName2.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + finalFullName2);
    }
}