package is.hi.byrjun.service;

import java.util.*;

import is.hi.byrjun.model.Login;
import is.hi.byrjun.model.Spurningar;
/**
 * 
 * @author gudmundurorripalsson
 * 	Interface sem SpurningaServiceImp implentar
 */
public interface SpurningaService {

	//Athugar hvort nafn sé á rétti formi
    public boolean erNafnRett(String nafn);
    
    //Bætir við spurningu í gagnagrunn
    public void addSpurning(Spurningar k);

    //Sækir allar spurningarnar í gagnagrunn	
    public List<Spurningar> allarSpurningar();
    
    //Vistar spurningu í gagnagrunn
     public Spurningar save(Spurningar spurningar);
     
     //Sækir Spurningu út frá ID
     public Spurningar getbyId(int i);
             
}
