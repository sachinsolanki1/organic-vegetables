package Com.Boot.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import Com.Boot.Entity.Messages;
import Com.Boot.Entity.Registration;
import Com.Boot.Service.Message_Service;
import Com.Boot.Service.Reg_Service;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class Home_Controller {
	@Autowired
	public Message_Service service;
	
	@Autowired
	public Reg_Service reg_Service;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	

	@RequestMapping("/index")
	public String index1() {
		return "index";
	}

	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}

	
	@RequestMapping("/blog")
	public String blog() {
		return "blog";
	}

	
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@RequestMapping(value = "/AddData", method = RequestMethod.POST)
	public String AddMessage(@ModelAttribute("messages") Messages messages) {
		service.AddMessage(messages);
		return "/index";
	}

	
	@RequestMapping("/detail")
	public String detail() {
		return "detail";
	}

	
	@RequestMapping("/feature")
	public String feature() {
		return "feature";
	}

	
	@RequestMapping("/product")
	public String product() {
		return "product";
	}

	
	@RequestMapping("/service")
	public String service() {
		return "service";
	}

	
	@RequestMapping("/team")
	public String team() {
		return "team";
	}

	
	@RequestMapping("/testimonial")
	public String testimonial() {
		return "testimonial";
	}

	
	@RequestMapping("/reg")
	public String reg() {
		return "reg";
	}
	
	
	@RequestMapping(value = "/AddUser", method = RequestMethod.POST)
	public String AddUser(@ModelAttribute("registration") Registration registration) {
		reg_Service.AddUser(registration);
		return "/login";
	}

	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String Userlogin(@ModelAttribute("registration") Registration registration ,HttpServletRequest req) {

	
		  Registration reg = reg_Service.loginuser(registration);	
		  HttpSession hs=req.getSession(false);
		  if(hs!=null)
		  {
			 hs.invalidate(); 
		  }
	
		 if(reg!=null)
		 {
			
		 hs=req.getSession(true);
		 hs.setAttribute("registration", reg);
		 return "index";
		 }else {
			 return "login";	 
		 }
	}
}
