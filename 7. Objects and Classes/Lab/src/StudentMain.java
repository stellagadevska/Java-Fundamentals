import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Student> students = new ArrayList<>();

        while (!input.equals("end")) {
            String[] parts = input.split(" ");

            Student student = new Student(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3]);
            students.add(student);

            input = scanner.nextLine();
        }

        String city = scanner.nextLine();

        for (Student student : students) {
            if (city.equals(student.getCity())) {
                System.out.printf("%s %s is %d years old%n",
                        student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}
