import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        Scanner s = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Add Student\n2. Display Students\n3. Search by Name\n4. Search by PRN\n" +
                    "5. Search by Index\n"+ "6. Update Student\n7. Delete Student\n8. Exit");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();

            switch(choice) {
                case 1:
                    st.addStudent();
                    break;

                case 2:
                    st.displayStudents();
                    break;

                case 3:
                    System.out.println("Enter the name you want to search");
                    String name = s.nextLine();
                    int search = st.searchByName(name);
                    if(search==1) {
                        System.out.println("Search successful");
                    }
                    else {
                        System.out.println("Search unsuccessful");
                    }
                    break;

                case 4:
                    System.out.println("Enter the PRN you want to search");
                    String prn = s.nextLine();
                    int search_prn = st.searchByPRN(prn);
                    if(search_prn==1) {
                        System.out.println("Search successful");
                    }
                    else {
                        System.out.println("Search unsuccessful");
                    }
                    break;

                case 5:
                    System.out.println("Enter the Index you want to access");
                    int index = s.nextInt();
                    int search_index = st.searchByIndex(index);
                    if(search_index==1) {
                        System.out.println("Search successful");
                    }
                    else {
                        System.out.println("Search unsuccessful");
                    }
                    break;

                case 6:
                    System.out.println("Enter what you wish to update: ");
                    String choice_update = s.nextLine();
                    st.updateStudent(choice_update);
                    System.out.println();
                    st.displayStudents();
                    System.out.println("Update Successful");
                    break;

                case 7:
                    System.out.println("Enter the PRN of student whose details are to be deleted: ");
                    String prn_delete = s.nextLine();
                    st.deleteStudent(prn_delete);
                    System.out.println();
                    st.displayStudents();
                    System.out.println("Deletion Successful");
                    break;

                case 8:
                    System.out.println("Exiting..");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Input");
            }
        }while(choice!=8);
    }
}
