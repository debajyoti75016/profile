package com.profile_2.service;

import java.util.List;

import com.profile_2.entities.Post;

public interface postService {

	void createPost(Post post);

	List<Post> fetchAllPosts();

	Post getPost(Long id);

	void updatePost(Post post);

}
