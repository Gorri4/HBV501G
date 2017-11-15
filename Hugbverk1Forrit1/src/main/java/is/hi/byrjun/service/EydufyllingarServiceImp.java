package is.hi.byrjun.service;


import is.hi.byrjun.model.Eydufyllingar;
import is.hi.byrjun.repository.EydufyllingaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EydufyllingarServiceImp implements EydufyllingaService {

	
	//Tenging yfir í safn af spurningum 
    @Autowired
    EydufyllingaRepository eydufyllingRepo;

    //Aðferðir sem eru skilgreindar í EydufyllingarService
	@Override
	public List<Eydufyllingar> allarEydufyllingar() {
		return eydufyllingRepo.findAll();
	}

	@Override
	public void addEydufylling(Eydufyllingar k) {
		eydufyllingRepo.save(k);
	}

	@Override
	public Eydufyllingar save(Eydufyllingar eydufyllingar) {
		return null;
	}

	@Override
	public boolean erNafnRett(String nafn) {
		return false;
	}

	@Override
	public Eydufyllingar getbyId(int i) {
		return eydufyllingRepo.findById(i);
	}

}

