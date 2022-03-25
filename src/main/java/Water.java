
import java.util.Scanner;

public class Water {
    static String waterMelon(){
        System.out.println("What is the weight");
        Scanner sc = new Scanner(System.in);
        int n = (sc.nextInt());
        if (n < 1 || n > 100)
            return ("out of range");
        if (n % 2 == 0 && n != 2)
        {
            return ("YES");
        }
        else {
            return ("NO");
        }
    }
}