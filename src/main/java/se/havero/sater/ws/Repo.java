/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.havero.sater.ws;

import https.se_havero.generator.NumberRepository;
import https.se_havero.phonenumber.PhoneNumber;
import javax.annotation.PostConstruct;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Component;

/**
 *
 * @author johan
 */
@Component
public class Repo {

    private  List<PhoneNumber> numbers;
    private static final NumberRepository  NUMBER_REPOSITORY = new NumberRepository(100);

    @PostConstruct
    public void initData() {
        numbers = new ArrayList<>(NUMBER_REPOSITORY.getPhoneNumbers().values());
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setId(100000);
        phoneNumber.setUid(50006);
        phoneNumber.setNumber("076-1341071");
        phoneNumber.setReserved(true);
        NUMBER_REPOSITORY.add(phoneNumber);
      
    }

    public List<PhoneNumber> getNumbers() {
        return numbers;
    }
    
    public PhoneNumber getPhoneNumber(String number){
        return NUMBER_REPOSITORY.getPhoneNumbers().get(number);
    }

}
