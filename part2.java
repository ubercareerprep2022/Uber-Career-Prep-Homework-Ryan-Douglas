import java.util.ArrayList;

public class part2{
    public static boolean isStringPermataion(String str1, String str2){
        int counter =0;

        if(str1.length() != str2.length()){
            return false;
        }
        for(int i =0; i< str1.length(); i++){
            for(int j=0; j< str2.length(); j++){
                if(str2.charAt(j) == str1.charAt(i)){
                    counter++;
                }
                
            }
        }

        if(counter == str1.length()){
            return true;
        }
        return false;
    }

    public static ArrayList<ArrayList<Integer>> pairsThatEqualSum(ArrayList<Integer> inputArray, Integer targetSum){
        ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<inputArray.size(); i++){
            for(int j=0; j< inputArray.size()/2; j++){
                if(inputArray.get(i) + inputArray.get(j) == targetSum){
                    ArrayList<Integer> anotherList = new ArrayList<Integer>();
                    anotherList.add(inputArray.get(i));
                    anotherList.add(inputArray.get(j));
                    output.add(anotherList);
                }
            }

        }
        return output;

    }
    public static void main (String[] args){

        String s1 = "abcd";
        
       System.out.println("Should be true : "+ isStringPermataion(s1,  "dbca"));
       System.out.println("Should be true : "+ isStringPermataion(s1, "bdac"));
       System.out.println("Should be false : "+ isStringPermataion(s1, "aaaa"));
       System.out.println("Should be false : "+ isStringPermataion(s1, "see"));

       ArrayList<Integer> arr = new ArrayList<Integer>();
       arr.add(1);
       arr.add(2);
       arr.add(3);
       arr.add(4);
       arr.add(5);

       System.out.print(pairsThatEqualSum(arr, 5));



    }
}