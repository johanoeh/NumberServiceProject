//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.15 at 09:24:13 PM CEST 
//


package https.se_havero.phonenumber;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.se_havero.phonenumber package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.se_havero.phonenumber
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPhoneNumberResponse }
     * 
     */
    public GetPhoneNumberResponse createGetPhoneNumberResponse() {
        return new GetPhoneNumberResponse();
    }

    /**
     * Create an instance of {@link PhoneNumber }
     * 
     */
    public PhoneNumber createPhoneNumber() {
        return new PhoneNumber();
    }

    /**
     * Create an instance of {@link GetPhoneNumberListRequest }
     * 
     */
    public GetPhoneNumberListRequest createGetPhoneNumberListRequest() {
        return new GetPhoneNumberListRequest();
    }

    /**
     * Create an instance of {@link GetphoneNumberListResponse }
     * 
     */
    public GetphoneNumberListResponse createGetphoneNumberListResponse() {
        return new GetphoneNumberListResponse();
    }

    /**
     * Create an instance of {@link PhoneNumbers }
     * 
     */
    public PhoneNumbers createPhoneNumbers() {
        return new PhoneNumbers();
    }

    /**
     * Create an instance of {@link GetPhoneNumberRequest }
     * 
     */
    public GetPhoneNumberRequest createGetPhoneNumberRequest() {
        return new GetPhoneNumberRequest();
    }

}