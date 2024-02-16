import java.util.Scanner;
import java.util.ArrayList;

class Student {
    String prn;
    String name;
    String dob;
    int marks;
    static Scanner s = new Scanner(System.in);
    static ArrayList<Student> student = new ArrayList<>();

    public Student() {
    }

    public Student(String prn, String name, String dob, int marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    public static void addStudent() {
        System.out.println("Enter your PRN Number: ");
        String prn = s.nextLine();
        System.out.println("Enter your Name: ");
        String name = s.nextLine();
        System.out.println("Enter your D.O.B: ");
        String dob = s.nextLine();
        System.out.println("Enter your marks in Java: ");
        int marks = s.nextInt();

        student.add(new Student(prn, name, dob, marks));
        System.out.println("Student added to list successfully");
    }

    public static void displayStudents() {
        if(student.isEmpty()) {
            System.out.println("List is Empty");
        }
        else {
            for(Student x:student) {
                System.out.println("PRN: " + x.prn + "\t" + "Name: " + x.name + "\t" +
                        "D.O.B: " + x.dob + "\t" + "Marks: " + x.marks);
            }
        }
    }

    public static int searchByPRN(String prn) {
        for(Student x: student) {
            if(x.prn == prn) {
                return 1;
            }
        }
        return -1;
    }

    public static int searchByName(String name) {
        for(Student x: student) {
            if(x.name == name) {
                return 1;
            }
        }
        return -1;
    }

    public static int searchByIndex(int index) {
        for(int i=0; i< student.size(); i++) {
            if(i == index) {
                System.out.println(student.get(i));
                return 1;
            }
        }
        return -1;
    }

    public static void updateStudent(String choice) {
        for(Student x: student) {
            if(choice.toUpperCase() == "PRN") {
                System.out.println("Enter new PRN: ");
                x.prn = s.nextLine();
            }
            else if(choice.toUpperCase() == "NAME") {
                System.out.println("Enter new Name: ");
                x.name = s.nextLine();
            }
            else if(choice.toUpperCase() == "DOB") {
                System.out.println("Enter new DOB: ");
                x.dob = s.nextLine();
            }
            else if(choice.toUpperCase() == "MARKS") {
                System.out.println("Enter new marks: ");
                x.marks = s.nextInt();
            }
            else {
                System.out.println("Invalid input!");
            }
        }
    }

    public static void deleteStudent(String prn) {
        for(Student x: student) {
            if(x.prn.equals(prn)) {
                student.remove(x);
                            }
        }
    }
}
