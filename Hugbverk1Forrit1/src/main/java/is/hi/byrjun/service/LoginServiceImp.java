package is.hi.byrjun.service;


import is.hi.byrjun.model.Login;
import is.hi.byrjun.model.Spurningar;
import is.hi.byrjun.repository.LoginRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImp implements LoginService {

	
	// Tenging yfir í safn af notendum 
    @Autowired
    LoginRepository loginRepo;
	
    //Aðferðir sem eru skilgreindar í LoginService
	@Override
	public void addNotandi(Login k) {
		loginRepo.save(k);
	}

	@Override
	public List<Login> allirNotendur() {
		return loginRepo.findAll();
	}

	@Override
	public Login save(Login notandi) {
		return null;
	}

	@Override
	public Login getbyId(int i) {
		return loginRepo.findById(i);
	}

/*
	@Override
	public Login changeValue(int a, String b) {
		return loginRepo.findAllWithID3(a, b);
	}
*/
}