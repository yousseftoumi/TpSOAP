package ws;

import metier.Compte;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import java.util.*;


@WebService(name = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "Conversion")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt+12.3;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") Long code){
        return new Compte(code, 69000.0,new Date());
    }
    @WebMethod
    public List<Compte> listComptes(){
        return Arrays.asList(
                new Compte(1L,20000.1,new Date()),
                new Compte(2L,20004.1,new Date()),
                new Compte(4L,2077.1,new Date()),
                new Compte(5L,0.1,new Date())
        );
    }
}
