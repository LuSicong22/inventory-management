package team5.test;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import team5.model.RoleType;
import team5.model.User;
import team5.repo.UserRepository;

@SpringBootTest
public class test1 {
	
	@Autowired
	UserRepository urepo;
	
	@Test
	public void adduser() {
		urepo.save(new User("admin1","admin1",RoleType.ADMIN));
		urepo.save(new User("admin2","admin2",RoleType.ADMIN));
		urepo.save(new User("mec1","mec1",RoleType.MECHANIC));
		urepo.save(new User("mec2","mec2",RoleType.MECHANIC));
		
		ArrayList<User> user =new ArrayList<User>();
		user =(ArrayList<User>) urepo.findAll();
		for (Iterator iterator = user.iterator(); iterator.hasNext();) {
			User user2 = (User) iterator.next();
			System.out.println(user2.toString());
		}
	}

	
}
