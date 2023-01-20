import java.util.*;

class ReferenceString{
    public void referStr(String str, String ref){
        str = str.toLowerCase();
        for(int i =0; i<ref.length(); i++){
            int count = 0;
            for(int j=0;j<str.length();j++){
                if(ref.charAt(i) == str.charAt(j) || ref.charAt(i) == str.charAt(j)-32){
                    count++; 
                }
            }
            System.out.print(ref.charAt(i)+":"+count);
            if(i!=ref.length()-1)
                System.out.print(", ");
        }        
    }
}
public class MidJanQ5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ReferenceString refString = new ReferenceString();
        System.out.println("Enter the Input String :- ");
        String str = input.nextLine();
        System.out.println("Enter the Reference String :- ");
        String reference = input.nextLine();
        refString.referStr(str, reference);
    }
}