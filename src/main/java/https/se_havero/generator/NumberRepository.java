/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package https.se_havero.generator;


import https.se_havero.phonenumber.PhoneNumber;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author johan
 */
public class NumberRepository {
    
    
    private boolean weightedRandom(){
     return ThreadLocalRandom.current().nextInt(0, 100) > 70; 
    }
    
    private int N;
    private final Map<String, PhoneNumber> phoneNumbers;
    
    public NumberRepository(int N){
        
        NumberGenerator generator = new NumberGenerator();
        Set<String> numbers = generator.getNumbers(N);
        this.N = N;
        Iterator<String> iterator = numbers.iterator();
        phoneNumbers = new TreeMap<>();
        for (int i = 0; i < N && iterator.hasNext(); i++) {
            PhoneNumber phoneNumber = 
                    new PhoneNumber();
            phoneNumber.setId(i);
            phoneNumber.setUid(ThreadLocalRandom.current().nextInt(0, Integer.MAX_VALUE));
            phoneNumber.setNumber(iterator.next());
            phoneNumber.setReserved(weightedRandom());
            
            phoneNumbers.put(phoneNumber.getNumber(),phoneNumber);
        }
    }
    
    public void add(PhoneNumber phoneNumber){
        phoneNumbers.put(phoneNumber.getNumber(), phoneNumber);
    }

    public Map<String, PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

}
