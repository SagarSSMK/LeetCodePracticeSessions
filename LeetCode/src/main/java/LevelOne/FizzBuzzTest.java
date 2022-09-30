package LevelOne;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzTest {

    public static void main(String[] args) {

        int n=3;

        List<String> output = new ArrayList<String >();
        for(int i=1; i<=n; i++){
            String toBeAdded = "";
            if(i%3==0 && i%5==0) toBeAdded="FizzBuzz";
            else if (i%3==0 ) toBeAdded="Fizz";
            else if (i%5==0 ) toBeAdded="Buzz";
            else toBeAdded= ""+i+"";
            output.add(toBeAdded);
        }
        for(String i: output){
            System.out.println(i);
        }

    }
}
