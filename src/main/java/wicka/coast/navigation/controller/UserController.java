package wicka.coast.navigation.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wicka.coast.navigation.dto.User;
import wicka.coast.navigation.service.IUserService;


@RestController
@RequestMapping("navigation/api")
public class UserController {
	@Autowired
	IUserService iUserService;
	
	@RequestMapping("/login")
	public HashMap<String,Object> LoginUser (@RequestBody User user){
		
		HashMap<String, Object> map = new HashMap<>();
		
		try {
			for (User userChecking: iUserService.showAllUsers()) {
				
				  if(userChecking.getEmail().equals(user.getEmail()))
	                {
	                    if(userChecking.getPassword().equals(user.getPassword()))
	                    {
	                        map.put("message", "All correct!");
	                        map.put("email:", user.getEmail());
	                        map.put("type User:", userChecking.getTypeUser());
	                        map.put("success:", true);
	                    }
	                    else
	                    {
	                        map.put("message", "Mail address or Password not correct");
	                        map.put("success:", false);
	                    }
	                }
	                else
	                {
	                    map.put("message", "Mail address or Password not correct");
	                    map.put("success:", false);
	                }
				  
			  }
			
		} catch (Exception e) {
			
	          map.put("message", "something went wrong! :" + e.getMessage());
	          
		}
		
		return map;
	}

}
