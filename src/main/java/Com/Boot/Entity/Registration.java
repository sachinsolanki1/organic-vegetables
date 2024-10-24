package Com.Boot.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Registration {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String name;
	private String email;
	private int password;
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Registration(int id, String name, String email,int password) {
		super();
		Id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	
	
	

	
}
