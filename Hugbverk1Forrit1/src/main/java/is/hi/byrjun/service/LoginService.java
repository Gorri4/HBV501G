package is.hi.byrjun.service;

import java.util.*;

import is.hi.byrjun.model.Login;
/**
 * 
 * @author gudmundurorripalsson
 *	Interface fyrir föll sem LoginServiceImp implementar
 */
public interface LoginService {

	//Bætir við notenda í gagnagrunn
    public void addNotandi(Login k);

    //Sækir lista af öllum notendum úr gagnagrunn
    public List<Login> allirNotendur();
    
    //Vistar notenda í gagnagrunn
     public Login save(Login notandi);

     //Sækir notanda eftir ID
     public Login getbyId(int i);
     
    // public Login changeValue(int a, String b);
}
