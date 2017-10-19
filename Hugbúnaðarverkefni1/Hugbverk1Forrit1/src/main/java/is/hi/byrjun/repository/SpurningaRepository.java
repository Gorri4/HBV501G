package is.hi.byrjun.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import is.hi.byrjun.model.Spurningar;

@Repository
public interface SpurningaRepository extends JpaRepository<Spurningar, Long> {
    /**
     * Nær í alla kennara
     * @return listi af kennurum 
     */
    @Override
    List<Spurningar> findAll();
    
    /**
     * Bætir við kennara
     * @param kennari 
     */
    @Override
    Spurningar save (Spurningar kennari);
    /**
     * Finnum alla kennara sem hafa lengra nafn en 3 stafir
     * 
     * @return lista af kennurum með nafn lengra en 3 stafir
     */ 
//    @Query(value = "SELECT p FROM Kennari p where length(p.nafn) >= 3 ")
//    List<Spurningar> findAllWithNameLongerThan3Chars();

   List<Spurningar> findAllByOrderByIdDesc();

   @Override
   Spurningar findOne(Long id);
   
//   // Notið sama nafn og dálkanafn í töflunni/tilviksbreytan (e. attribute) 
//   List<Spurningar> findByNafn(String nafn);
}
