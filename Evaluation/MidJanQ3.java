import java.util.*;

public class MidJanQ3 {
	 public static void main(String[] args){
		 Scanner input = new Scanner(System.in);
		 SuperString supString = new SuperString();

		 System.out.println("Enter the Row Size of Super String :- ");
		 int row = input.nextInt();
		 input.nextLine();
		 String[] supStr = new String[row];
		 System.out.println("Enter the Super Strings :- ");
		 for(int i =0; i<row; i++){
		     supStr[i] = input.nextLine();
		 }

		 System.out.println("Enter the Row Size of Sub String :- ");
		 int size = input.nextInt();
		 input.nextLine();
		 String[] subStr = new String[size];
		 System.out.println("Enter the Sub Strings :- ");
		 for(int j =0; j<size; j++){
		     subStr[j] = input.nextLine();
		 }
		 System.out.println(Arrays.toString(supStr));
		 System.out.println(Arrays.toString(subStr));
		 System.out.println(supString.subSets(supStr, subStr));
	    }
}
class SuperString{
    public int subSets(String[] supStr, String[] subStr){
        int count = 0,k=0,l=0;
        String str="",superStr="";
        int finalCount = 0; 

        for(int i =0; i<supStr.length;i++){//Super String  
            superStr = supStr[i];
          out:
            for(int j=0; j<subStr.length; j++){//SubString
              str = subStr[j];
              inner:
                for(k=0;k < str.length();k++){//i'th string of SubString "ec"
                    loop:
                    for(l=0; l<superStr.length();l++){//i'th string of Super String "ceo"
                        if(str.charAt(k) == superStr.charAt(l))
                            break loop;
                    }
                    if(l == superStr.length())
                        break inner;
                }
                if(k != str.length())
                    break out;
                else
                    count++;    
            }
            if(count == subStr.length)
                finalCount++;
            count = 0;    
        }

        return finalCount;
    }
}
