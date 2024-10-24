package Com.Boot.Repository;

import org.springframework.data.repository.CrudRepository;


import Com.Boot.Entity.Messages;

public interface Message_Repo extends CrudRepository<Messages,String> {

}
