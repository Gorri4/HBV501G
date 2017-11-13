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
		// TODO Auto-generated method stub
		return null;
	}



}