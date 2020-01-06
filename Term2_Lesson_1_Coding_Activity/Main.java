import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Main
{
    public static void main(String[] args)
    {
        Scanner freezer = new Scanner(System.in);
        int count = 0;
        boolean finish = false;
        String b;
        ArrayList <String> list = new ArrayList();
        System.out.println("Please enter words, enter STOP to stop the loop.");
        while(finish == false){
            b = freezer.nextLine();
            count ++;
            list.add(b);
            if(b.equals("STOP")){
                count --;
                finish = true;
                break;
            }
        }
        list.remove("STOP");
        System.out.println(list.size());
        System.out.println(list);
        if(count <= 2){
            list.remove(0);
            list.remove(count-2);
            System.out.println(list);
        }
    }
}
