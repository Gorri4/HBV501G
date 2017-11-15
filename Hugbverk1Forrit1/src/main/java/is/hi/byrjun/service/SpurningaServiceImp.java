package is.hi.byrjun.service;


import is.hi.byrjun.model.Login;
import is.hi.byrjun.model.Spurningar;
import is.hi.byrjun.repository.SpurningaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpurningaServiceImp implements SpurningaService {

	
	 // Tenging yfir í safn af spurningum 
    @Autowired
    SpurningaRepository spurningRep;

    //Aðferðir skilgreindar í SpurningaService
	@Override
	public boolean erNafnRett(String nafn) {
		return true;
	}

	@Override
	public void addSpurning(Spurningar k) {
		spurningRep.save(k);    
	}

	@Override
	public Spurningar save(Spurningar spurningar) {
		return null; 
	}

	@Override
	public List<Spurningar> allarSpurningar() {
		return spurningRep.findAll();
	}

	@Override
	public Spurningar getbyId(int i) {
		return spurningRep.findById(i);
	}

}

