/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.havero.sater.ws;


import https.se_havero.phonenumber.GetPhoneNumberRequest;
import https.se_havero.phonenumber.GetPhoneNumberResponse;
import https.se_havero.phonenumber.GetphoneNumberListResponse;
import https.se_havero.phonenumber.PhoneNumbers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PhoneNumberEndpoint {

    private static final String NAMESPACE_URI = "https://se.havero/phonenumber";
    private final Repo repo;

    @Autowired
    public PhoneNumberEndpoint(Repo repo) {
        this.repo = repo;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetPhoneNumberRequest")
    @ResponsePayload
    GetPhoneNumberResponse getNumber(@RequestPayload GetPhoneNumberRequest request) {   
        GetPhoneNumberResponse response = new GetPhoneNumberResponse();
        response.setNumber(repo.getPhoneNumber(request.getNumber()));
        return response;
    }
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetPhoneNumberListRequest")
    @ResponsePayload
    GetphoneNumberListResponse getNumberList(){
        GetphoneNumberListResponse response = new GetphoneNumberListResponse();
        PhoneNumbers phoneNumbers = new PhoneNumbers();
        phoneNumbers.setNumbers(repo.getNumbers());
        response.setList(phoneNumbers);
        return response;
    }
    
    

}
