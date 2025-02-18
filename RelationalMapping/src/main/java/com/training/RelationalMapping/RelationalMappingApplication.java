package com.training.RelationalMapping;

import com.training.RelationalMapping.entities.Post;
import com.training.RelationalMapping.entities.Profile;
import com.training.RelationalMapping.entities.User;
import com.training.RelationalMapping.repo.ProfileRepository;
import com.training.RelationalMapping.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class RelationalMappingApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

//	@Autowired
//	private ProfileRepository profileRepository;

	public static void main(String[] args) {
		SpringApplication.run(RelationalMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		User user = new User();
//		user.setId(1);
//		user.setName("bhavin");
//
//		Profile profile = new Profile();
//		profile.setId(100);
//		profile.setBio("feeling happy");
//
//		user.setProfile(profile);
//		profile.setUser(user);
//
//		userRepository.save(user);
//
//		User foundUser = userRepository.findById(1).get();
//		System.out.println(foundUser.getProfile().getId());
//
//		Profile foundProfile = profileRepository.findById(100).get();
//		System.out.println(foundProfile.getUser().getName());

		User user = new User();
		user.setId(1);
		user.setName("bhavin");

		Post post1 = new Post();
		post1.setId(100);
		post1.setContent("post 1 content");
		post1.setUser(user);

		Post post2 = new Post();
		post2.setId(200);
		post2.setContent("post 2 content");
		post2.setUser(user);

		Post post3 = new Post();
		post3.setId(300);
		post3.setContent("post 3 content");
		post3.setUser(user);

		List<Post> postList = List.of(post1,post2,post3);

		user.setPostList(postList);

		userRepository.save(user);
	}
}
