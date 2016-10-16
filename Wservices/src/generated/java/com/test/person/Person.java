package com.test.person;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-10-16T21:09:46.628+07:00
 * Generated source version: 3.1.7
 * 
 */
@WebService(targetNamespace = "http://www.test.com/Person/", name = "Person")
@XmlSeeAlso({blabla.personservice.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Person {

    @WebMethod(operationName = "GetPersonDetails", action = "http://www.briansjavablog.com/Person/GetPersonDetails")
    @WebResult(name = "PersonDetailsResponse", targetNamespace = "http://blabla/personservice", partName = "parameters")
    public blabla.personservice.PersonDetailsResponse getPersonDetails(
        @WebParam(partName = "parameters", name = "PersonDetailsRequest", targetNamespace = "http://blabla/personservice")
        blabla.personservice.PersonDetailsRequest parameters
    );
}