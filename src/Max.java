import java.util.*;
public class Max{
    public static void main(String arg[]){
        int max = 0;
        int num =0;
        for(int i=0;i<5;i++){

            Scanner x = new Scanner(System.in);
            System.out.print("Enter number "+(i+1) + ":");
            num = x.nextInt();
            if(num>max){
                max=num;
            }


        }

        System.out.print(max);

    }
}