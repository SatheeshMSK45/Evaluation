import java.util.*;

class SubArrays{
    public void splitArray(int[] arr){
        int sum=0, num=0, i=0, temp=0, row = arr.length;
        ArrayList<Integer> list = new ArrayList<>(); 
        for(i =0; i<row;i++)
            sum += arr[i];
        
        if(sum % 2 != 0){
            System.out.print("This Array cannot split into two equal Sum Sub Arrays");
            return;
        }    

        for(i =0; i<row-1;i++){
          for(int j = i+1; j<row; j++){
            if(arr[i]>arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
          }
        }
        
        outer:
        for(i =row-1; i>0; i--){
            int total = arr[i];
            list.add(0,arr[i]);
            for(int j=i-1;j>=0; j--){
                total += arr[j];
                
                if(total < sum/2){
                    list.add(arr[j]);
                    continue;
                }

                else if(total > sum/2)
                    total -= arr[j];  
                    
                else if(total == sum/2){
                    list.add(arr[j]);
                    break outer;
                }
            }
        }
         
        if(i == 0){
            System.out.print("Array cannot split into two equal Sum Sub Arrays");
            return;
        }
        System.out.print("The two arrays are {");
        for(int j =0; j<list.size();j++){
            inner:
            for(int k=0; k<row; k++){
                if(list.get(j) == arr[k]){
                    if(j != list.size()-1)
                        System.out.print(arr[k]+", ");
                    else if(j == list.size()-1) 
                        System.out.print(arr[k]+"} & {");

                    arr[k] = 0;
                    break inner;
                }    
            }
        }

        for(int j = 0; j<row; j++){
            if(arr[j]>0){
                System.out.print(arr[j]+", ");
            }
        }
        System.out.print("\b\b}");
    }
}

public class MidJanQ2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        SubArrays sub = new SubArrays();
        System.out.println("Enter the Row Size :- ");
        int row = input.nextInt();
        int[] superArray = new int[row];

        System.out.println("Enter the Elements :- ");
        for(int i=0; i< row; i++)
            superArray[i] = input.nextInt();
        
        sub.splitArray(superArray);
    }
}