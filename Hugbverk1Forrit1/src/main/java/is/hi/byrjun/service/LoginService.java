package is.hi.byrjun.service;

import java.util.*;

import is.hi.byrjun.model.Login;

public interface LoginService {


	//Bætir við notanda
    public void addNotandi(Login k);

    public List<Login> allirNotendur();
    
     public Login save(Login notandi);

     public Login getbyId(int i);
     
     public int getbyIdQuery(String i);
}
