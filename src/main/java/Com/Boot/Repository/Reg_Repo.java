package Com.Boot.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import Com.Boot.Entity.Registration;

public interface Reg_Repo extends CrudRepository<Registration,String> {
	@Query("select c from Registration c where c.email=?1 AND c.password=?2")
	public Registration getLogin(String email, int password);

}
