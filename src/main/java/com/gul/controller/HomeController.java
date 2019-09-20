package com.gul.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@Autowired
	ResourceLoader resourceLoader;

	@GetMapping("/")
	public String view() throws IOException {
//		Resource resource = resourceLoader.getResource("classpath:sample.txt");
//		InputStream input = resource.getInputStream();
//		File f = resource.getFile();
//		String absolute = f.getAbsolutePath();
//		System.out.println("Original  path: " + f.getPath());
//		System.out.println("Absolute  path: " + absolute);

		File file = ResourceUtils.getFile("classpath:sample.txt");

		// File is found
		System.out.println("File Found : " + file.exists());

		// Read File Content
		String content = new String(Files.readAllBytes(file.toPath()));
		System.out.println(content);
		return "test";
	}
}
