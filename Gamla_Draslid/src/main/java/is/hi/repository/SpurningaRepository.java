package is.hi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import is.hi.byrjun.controller.Spurningar;

public interface SpurningaRepository extends JpaRepository<Spurningar, Long> {
	/**
     * Nær í allar spurningar
     * @return listi af kennurum 
     */
    List<Spurningar> findAll();
    
    /**
     * Bætir við kennara
     * @param kennari 
     */
    Spurningar save (Spurningar spurningar);
    /**
     * Finnum alla kennara sem hafa lengra nafn en 3 stafir
     * 
     * @return lista af kennurum með nafn lengra en 3 stafir
     */ 
    @Query(value = "")
    List<Spurningar> findAllWithNameLongerThan3Chars();

   List<Spurningar> findAllByOrderByIdDesc();

   @Override
   Spurningar findOne(Long id);
   
   // Notið sama nafn og dálkanafn í töflunni/tilviksbreytan (e. attribute) 
   List<Spurningar> findByNafn(String spurning);
}
