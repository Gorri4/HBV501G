package is.hi.byrjun.service;

import java.util.*;

import is.hi.byrjun.model.Eydufyllingar;
import is.hi.byrjun.model.Spurningar;
/**
 * 
 * @author gudmundurorripalsson
 *	Interface fyrir föll sem EydufyllingaServiceImp implementar
 */
public interface EydufyllingaService {

	//Athugar hvort nafn er á réttu formi
    public boolean erNafnRett(String nafn);

    //Bætir við spurningu í eyðufyllingagagnagrunn
    public void addEydufylling(Eydufyllingar k);

    //Sækir lista af eyðufyllingaspurningum í gagnagrunn
    public List<Eydufyllingar> allarEydufyllingar();
     
    //Vistar eyðufyllingaspurningu í gagnagrunn
    public Eydufyllingar save(Eydufyllingar eydufyllingar);
      
    //Sækir spurningu eftir ID
    public Eydufyllingar getbyId(int i);
             
}
