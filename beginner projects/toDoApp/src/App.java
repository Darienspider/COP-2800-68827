import java.time.LocalDate;


public class App {
    /* I would like a to do app that has a few features
        1.> Sets reminders depending on the due date
        2.> Allows me to add addresses and sync with google account
        3.> Let's me set meetings and shows them in both google account and the app
        4.> Seperate by Project / Client
        5.> 
    */
    public App(){
        String title;
        
    }

    static LocalDate now = LocalDate.now();
    public static void main(String[] args) throws Exception {
        AppGui appGui = new AppGui();
        System.out.println(now);
        System.out.println("Hello, World!");
    }

    
}
