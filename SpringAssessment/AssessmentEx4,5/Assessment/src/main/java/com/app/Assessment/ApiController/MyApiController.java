package com.app.Assessment.ApiController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.app.Assessment.Entity.UserInfo;
import com.app.Assessment.service.userManagerImpl;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api")
public class MyApiController extends BaseApiController{
    @Autowired
	private userManagerImpl service;
	
	 @GetMapping(value="/user")
		public ResponseEntity<List<UserInfo>> findAllUser() {
		return new ResponseEntity<List<UserInfo>>(service.getUser(), HttpStatus.CREATED);	
		}
	 
	@PostMapping(value="/user")
	public ResponseEntity<String> addUser( @Valid @RequestBody UserInfo user) {
		service.saveUser(user);
		return new ResponseEntity<String>("record saved successfully",HttpStatus.OK);
		}
}
