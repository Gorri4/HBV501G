package is.hi.byrjun.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import is.hi.byrjun.model.Eydufyllingar;

@Repository
public interface EydufyllingaRepository extends JpaRepository<Eydufyllingar, Long>{
	
	Eydufyllingar save (Eydufyllingar spurningar);
	
	List<Eydufyllingar> findAll();
		
}
