/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.byrjun.repository;

import is.hi.byrjun.model.Spurningar;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Gummi
 */

public interface SpurningaRepository extends JpaRepository<Spurningar, Long>{
    /**
     * Nær í allar spurningar
     * @return listi af kennurum 
     */
    List<Spurningar> findAll();
    
    /**
     * Bætir við kennara
     * @param kennari 
     */
    Kennari save (Spurningar kennari);
    /**
     * Finnum alla kennara sem hafa lengra nafn en 3 stafir
     * 
     * @return lista af kennurum með nafn lengra en 3 stafir
     */ 
    @Query(value = "SELECT p FROM Kennari p where length(p.nafn) >= 3 ")
    List<Spurningar> findAllWithNameLongerThan3Chars();

   List<Spurningar> findAllByOrderByIdDesc();

   @Override
   Spurningar findOne(Long id);
   
   // Notið sama nafn og dálkanafn í töflunni/tilviksbreytan (e. attribute) 
   List<Spurningar> findByNafn(String spurning);
}
