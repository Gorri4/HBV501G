package is.hi.byrjun.service;


import is.hi.byrjun.model.Eydufyllingar;
import is.hi.byrjun.repository.EydufyllingaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EydufyllingarServiceImp implements EydufyllingaService {

	
	 // Tenging yfir í safn af spurningum 
    @Autowired
    EydufyllingaRepository eydufyllingRepo;

	@Override
	public List<Eydufyllingar> allarEydufyllingar() {
		return eydufyllingRepo.findAll();
	}

	@Override
	public void addEydufylling(Eydufyllingar k) {
		// TODO Auto-generated method stub
		eydufyllingRepo.save(k);
	}

	@Override
	public Eydufyllingar save(Eydufyllingar eydufyllingar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean erNafnRett(String nafn) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Eydufyllingar> finnaAlla3Stafi() {
		// TODO Auto-generated method stub
		return null;
	}

}

