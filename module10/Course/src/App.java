public class App {
    private String courseName;
    private String[] students = new String[1];
    private int numberOfStudents;
    
    public App(String courseName){
        this.courseName = courseName;
    }
    public void addStudent(String studentName){
        if(numberOfStudents == students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents] = studentName;
        numberOfStudents++;
        System.out.println("Adding student: " + studentName);
    }

    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }

    public void showStudents(){
        System.out.println("Students in the course: " + courseName);
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(students[i]);
        }
    }
    

    public void dropStudent(String student){
        int studentIndex = -1;
        for(int i = 0; i < numberOfStudents; i++){
            if(students[i].equals(student)){
                studentIndex = i;
                break;
            }
        }

        if(studentIndex != -1){
            for(int i = studentIndex; i < numberOfStudents - 1; i++){
                students[i] = students[i + 1];
            }
            numberOfStudents--;
        }
    }

    public void clear(){
        students = new String[1];
        numberOfStudents = 0;
    }

    public static void main(String[] args) throws Exception {
        App fiskeysClass = new App("Java Programming");
        fiskeysClass.addStudent("Shadarien");
        fiskeysClass.addStudent("Megan");
        fiskeysClass.addStudent("Sam");

        System.out.println("Current students: ");
        fiskeysClass.showStudents();
        System.out.println(String.format("Welcome to %s Where we have a total of %d students. ",fiskeysClass.courseName,fiskeysClass.numberOfStudents));

        fiskeysClass.dropStudent("Shadarien");
        System.out.println("Dropping Student: Shadarien");
        System.out.println("Clearing class: ");
        fiskeysClass.clear();
        System.out.println("Number of Students in class: " + fiskeysClass.getNumberOfStudents());
        fiskeysClass.showStudents();


    }

}
