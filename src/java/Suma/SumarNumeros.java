
package Suma;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "SumarNumeros")
public class SumarNumeros {


    @WebMethod(operationName = "sumar")
    public int sumar(@WebParam(name = "Numero1") int Numero1, @WebParam(name = "Numero2") int Numero2) {
        
        return Numero1+Numero2;
    }

    /**
     * Web service operation
     * @param Numero1
     * @param Numero2
     * @return 
     */
    @WebMethod(operationName = "Resta")
    public int Resta(@WebParam(name = "Numero1") int Numero1, @WebParam(name = "Numero2") int Numero2) {
        //TODO write your implementation code here:
        return Numero1-Numero2;
    }

    /**
     * Web service operation
     * @param Numero1
     * @param Numero2
     * @return 
     */
    @WebMethod(operationName = "Multiplicacion")
    public int Multiplicacion(@WebParam(name = "Numero1") int Numero1, @WebParam(name = "Numero2") int Numero2) {
        //TODO write your implementation code here:
        return Numero1*Numero2;
    }
}
