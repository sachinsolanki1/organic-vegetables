package Com.Boot.Service;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import Com.Boot.Entity.Registration;
import Com.Boot.Repository.Reg_Repo;


@Service
public class Reg_Service {

	@Autowired
	public Reg_Repo reg_Repo;
	
	public void AddUser(Registration registration) {
		reg_Repo.save(registration);
	}
	
	
	public Registration loginuser(Registration registration) {
		Registration rg = reg_Repo.getLogin(registration.getEmail(),registration.getPassword());
		return rg;
	}
}
