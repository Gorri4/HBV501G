package is.hi.byrjun.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import is.hi.byrjun.model.Eydufyllingar;
import is.hi.byrjun.model.Spurningar;
/**
 * 
 * @author gudmundurorripalsson
 * Repository Interface fyrir Eyðufyllingagagnagrunn
 */
@Repository
public interface EydufyllingaRepository extends JpaRepository<Eydufyllingar, Long>{
	
	Eydufyllingar save (Eydufyllingar spurningar);
	
	List<Eydufyllingar> findAll();
		
	Eydufyllingar findById(int i);
}
