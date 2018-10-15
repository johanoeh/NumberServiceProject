/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package https.se_havero.generator;


import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author johan
 */
public class NumberGenerator {
    
    private int N;
    public static final String N_072 ="072";
    public static final int NUM_LENGTH =7;
    /**
     * Genearates a string of integervalues
     * @param length the lenth of the string
     * @return the string of integers
     */
    public String nextRandomString(int length){
        
    String number ="";
        for (int i = 0; i < length; i++) {
            number += ThreadLocalRandom.current().nextInt(0, 10);
        }
        return number;
    }
    
    public Set<String> getNumbers( int N){
     Set<String>  numbers = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String number = N_072+"-"+nextRandomString(NUM_LENGTH);
            while(numbers.contains(number)){
                 number = N_072+"-"+nextRandomString(NUM_LENGTH);
            }
            numbers.add(number);
        }
        return numbers;
    }
    
    
    
}
