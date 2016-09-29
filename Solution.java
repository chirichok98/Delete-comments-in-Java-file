import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Михаил on 29.09.2016.
 */
public class Solution {
    public static void decide() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter way to file: ");
        String name = sc.nextLine();
        try {
            String s = InputOutput.getText(name);
            DeleteComment delCom = new DeleteComment(s);
            String newS = delCom.deleteComment();
            InputOutput.setText(newS);
        } catch (FileNotFoundException e) {
            System.out.println("File don't exist");
        } catch (IOException e) {
            System.out.println("File don't exist");
        }
    }
}
