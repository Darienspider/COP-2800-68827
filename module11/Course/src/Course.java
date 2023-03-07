import java.util.*;

public class Course{
    private String courseName;
    private ArrayList<String> students;
    private int numberOfStudents;

    public Course (String courseName){
        this.courseName = courseName;
        this.students = new ArrayList<String>();
    }

    public void addStudent(String student){
        students.add(student);
        numberOfStudents++;
    }   

    public ArrayList<String> getStudents(){
        return students;

    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }
    public void dropStudent(String student){
        students.remove(student);
    }
    
    
    public void clear(){
        numberOfStudents=0;
        students.clear();
    }


}