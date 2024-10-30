package com.profile_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.profile_2.entities.Post;

public interface postRepository extends JpaRepository<Post, Long>{
	

}
