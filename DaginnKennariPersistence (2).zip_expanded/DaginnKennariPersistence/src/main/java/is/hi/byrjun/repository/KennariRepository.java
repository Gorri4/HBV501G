/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.byrjun.repository;

import is.hi.byrjun.model.Kennari;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Ebba Þóra Hvannberg
 */

public interface KennariRepository extends JpaRepository<Kennari, Long>{
    /**
     * Nær í alla kennara
     * @return listi af kennurum 
     */
    List<Kennari> findAll();
    
    /**
     * Bætir við kennara
     * @param kennari 
     */
    Kennari save (Kennari kennari);
    /**
     * Finnum alla kennara sem hafa lengra nafn en 3 stafir
     * 
     * @return lista af kennurum með nafn lengra en 3 stafir
     */ 
    @Query(value = "SELECT p FROM Kennari p where length(p.nafn) >= 3 ")
    List<Kennari> findAllWithNameLongerThan3Chars();

   List<Kennari> findAllByOrderByIdDesc();

   @Override
   Kennari findOne(Long id);
   
   // Notið sama nafn og dálkanafn í töflunni/tilviksbreytan (e. attribute) 
   List<Kennari> findByNafn(String nafn);
}
