package com.profile_2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profile_2.entities.Post;
import com.profile_2.repository.postRepository;

@Service
public class postServiceImplementation implements postService {
	@Autowired
	 postRepository repo;

	
	public void createPost(Post post) {
		repo.save(post);
		
	}


	@Override
	public List<Post> fetchAllPosts() {
		
		return repo.findAll();
	}


	@Override
	public Post getPost(Long id) {
		return repo.findById(id).get();
	}


	@Override
	public void updatePost(Post post) {
		repo.save(post);
		
	}
	 

}
