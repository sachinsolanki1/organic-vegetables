package Com.Boot.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import Com.Boot.Entity.Messages;
import Com.Boot.Repository.Message_Repo;

@Service
public class Message_Service {

	@Autowired
	public Message_Repo repository;
	
	public void AddMessage(Messages messages) {
		repository.save(messages);
	}
	
}
