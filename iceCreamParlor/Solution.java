import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'icecreamParlor' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER m
     *  2. INTEGER_ARRAY arr
     */
    public static Integer icecreamParlor(int m, List<Integer> arr) {
    
    
    int total = 0;
    // Write your code here
        for(int flav = 0; flav < arr.size()-1; flav++){
            for(int flav2 = 0; flav2 < arr.size()-1; flav++){
                if(arr.get(flav) + arr.get(flav2) == m){
                    total++;
                }
            }
        }
        return total/2;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int m = Integer.parseInt(bufferedReader.readLine().trim());

                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                Integer result = Result.icecreamParlor(m, arr);
                bufferedWriter.write(result.toString() + "\n");  //specifically for this problem
                //bufferedWriter.write(
                    //result.stream()
                        //.map(Object::toString)
                       // .collect(joining(" "))
                   // + "\n"
                //);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
