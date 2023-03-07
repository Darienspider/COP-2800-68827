import java.security.Key;
import java.util.*;
public class Student extends Person {


    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String classStatus;

    public Student(String name, String address, String phoneNumber, String emailAddress, String classStatus) {
        super(name, address, phoneNumber, emailAddress);
        this.classStatus = classStatus;
    }

    public String getClassStatus() {
        return classStatus;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + getName();
    }
}