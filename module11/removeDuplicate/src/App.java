import java.lang.reflect.Array;
import java.util.*;

import javax.management.AttributeList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter 10 Numbers: ");
        ArrayList listedNumbers = new ArrayList<Integer>(); 
        for (int i =0; i <10; i++ ){
            listedNumbers.add(userInput.nextInt());
        }
        System.out.println(listedNumbers.size());

        String originalEntry = "You entered: ";
        for (int i = 0; i < listedNumbers.size()+1; i++){
            originalEntry+= " " + i;
        }
        //displays original entry
        System.out.println(originalEntry);
        //displays distinct values (nonduplicated)
        removeDuplicate(listedNumbers);


    }
    public static void removeDuplicate(ArrayList list){

        ArrayList test = new AttributeList(list.stream().distinct().toList());
        String answer = "The distinct integers are ";
        for (int i =0; i < test.size();i++){
            answer+= " " + test.get(i); 
        }
        System.out.println(answer);
    }

}
