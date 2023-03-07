
public class App {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Course javaDesign = new Course("Java Design");
        javaDesign.addStudent("Shadarien Williams");
        javaDesign.addStudent("Test Student");
        javaDesign.addStudent("Other Student");

        System.out.println("Removing Student: Shadarien Williams");
        javaDesign.dropStudent("Shadarien Williams");

        System.out.println("Displaying Current Students");
        System.out.println(javaDesign.getStudents());

    }
}
