import java.util.*;

class ValidExpression{
    public String validExp(String valid){
        String operators = "+-*/%=";
        int count = 0;
        for(int i =0; i<valid.length(); i++){
            for(int j=0; j<operators.length(); j++){
                if(valid.charAt(i) == operators.charAt(j)){
                    if((valid.charAt(i+1)>=97 && valid.charAt(i+1)<=122 )&&
                    (valid.charAt(i-1)<=122 && valid.charAt(i-1)>=97 )){
                    continue;
                }
                else{
                    return "InValid";
                }
            }
        }

            if(valid.charAt(i)== 40)
                count++;

            else if(valid.charAt(i)== 41)
                count--;

            if(count<0)  
                return "Invalid";      //( { [ )] } )
        }
        if(count!=0)
            return "Invalid"; 

        return "Valid";
    }
}

public class MidJanQ1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ValidExpression valid = new ValidExpression();
        System.out.println("Enter the Expression :- ");
        String exp = input.nextLine();
        System.out.println(valid.validExp(exp));
    }
}