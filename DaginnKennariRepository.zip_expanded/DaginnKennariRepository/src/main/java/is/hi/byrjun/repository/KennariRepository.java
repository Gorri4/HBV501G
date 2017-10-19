/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.byrjun.repository;

import is.hi.byrjun.model.Kennari;
import java.util.List;

/**
 * @date september 2017
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 * @author Ebba Þóra Hvannberg
 * 
 * Geymsla fyrir alla kennara
 * 
 */

public interface KennariRepository  {
    /**
     * Nær í alla kennara
     * @return listi af kennurum 
     */
    List <Kennari> getAll();
    
    /**
     * Bætir við kennara
     * @param kennari 
     */
    void add (Kennari kennari);
}
