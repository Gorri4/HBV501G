package is.hi.byrjun.service;

import java.util.*;

import is.hi.byrjun.model.Eydufyllingar;
import is.hi.byrjun.model.Spurningar;

public interface EydufyllingaService {

    /**
     * Athugar hvort nafn er á réttu formi, þ.e. verða að vera a.m.k. tvö orð.
     *
     * @param nafn
     * @return skilar satt ef nafn er á réttu formi annars ósatt
     */
    public boolean erNafnRett(String nafn);

    /**
     * Bætir við kennara í kennariRep
     *
     * @param k Kennari
     */
    public void addEydufylling(Eydufyllingar k);

    /**
     * Skilar öllum kennurum í kennariRep
     *
     * @return listi af kennurum
     */
    public List<Eydufyllingar> allarEydufyllingar();
      
      public Eydufyllingar save(Eydufyllingar eydufyllingar);
        
      public List<Eydufyllingar> finnaAlla3Stafi();
      
      public Eydufyllingar getbyId(int i);
             
}
