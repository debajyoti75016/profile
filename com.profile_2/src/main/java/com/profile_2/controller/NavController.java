package com.profile_2.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.profile_2.entities.Post;

@Controller
public class NavController {
@GetMapping("/")
public String newPost() {
	return "newPost";
}


}
