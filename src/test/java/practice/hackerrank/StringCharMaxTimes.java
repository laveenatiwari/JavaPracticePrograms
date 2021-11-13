package practice.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class R2 {

    /*
     * Complete the 'maximumOccurringCharacter' function below.
     *
     * The function is expected to return a CHARACTER.
     * The function accepts STRING text as parameter.
     */
 static final int ASCII_SIZE=256;
    public static char maximumOccurringCharacter(String text) {
    int count[] = new int[ASCII_SIZE];
    int len =text.length();
    for(int i=0;i<len;i++){
        count[text.charAt(i)]++;
    }
    int max=-1;
    char result =' ';
    for(int i=0; i<len;i++){
        if(max<count[text.charAt(i)]){
            max=count[text.charAt(i)];
            result =text.charAt(i);
        }
    }
return result;
    }

}

public class StringCharMaxTimes {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String text = bufferedReader.readLine();

        char result = R2.maximumOccurringCharacter(text);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

