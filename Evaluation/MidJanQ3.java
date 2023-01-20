import java.util.*;

class SuperString{
    public int subSets(String[] supStr, String[] subStr){
        int count = 0;
        for(int i =0; i<subStr.length;i++){
            for(int j=0; j<supStr.length; j++){
                if(subStr[i].contains(supStr[j]))
                    count++;
            }
        }
        return count;
    }
}

public class MidJanQ3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        SuperString supString = new SuperString();

        System.out.println("Enter the Row Size of Super String :- ");
        int row = input.nextInt();
        String[] supStr = new String[row];

        System.out.println("Enter the Super Strings :- ");
        for(int i =0; i<row; i++){
            supStr[i] = input.next();
        }
        System.out.println("Enter the Row Size of Sub String :- ");
        int size = input.nextInt();
        String[] subStr = new String[size];

        System.out.println("Enter the Sub Strings :- ");
        for(int j =0; j<size; j++){
            supStr[j] = input.next();
        }

        supString.subSets(supStr, subStr);
    }
}