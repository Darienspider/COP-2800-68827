public class App{
    public static void main(String[] args) {
        Person studentPerson = new Person("shadarien williams", "123 Main street", "813-555-5555", "swilliams253@hawkmail.hccfl.edu");
        Student student = new Student(studentPerson.getName(), studentPerson.getAddress(), studentPerson.getPhoneNumber(), studentPerson.getEmailAddress(), "sophomore");
        Person employeePerson = new Person("Francis Fiskey ", "4001 W Tampa Bay Blvd, Tampa, FL 33614", "(813) 253-7000", "francis.fiskey@hawkmail.hccfl.edu");
        Employee employee = new Employee(employeePerson.getName(), employeePerson.getAddress(), employeePerson.getPhoneNumber(), employeePerson.getEmailAddress(), "4001 W Tampa Bay Blvd, Tampa, FL 33614", 60000.00, new MyDate() );
        Faculty faculty = new Faculty(employee.getName(), employee.getAddress(),employee.getPhoneNumber(), employee.getEmailAddress(), employee.getOffice(), employee.getSalary(), employee.getDateHired(), "8am to 5pm", "rank");
        Staff staff = new Staff(employee.getName(), employee.getAddress(),employee.getPhoneNumber(), employee.getEmailAddress(), employee.getOffice(), employee.getSalary(), employee.getDateHired(), "professor");

        System.out.println(studentPerson.toString());
        System.out.println(student.toString());
        System.out.println(employeePerson.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());


    }
}