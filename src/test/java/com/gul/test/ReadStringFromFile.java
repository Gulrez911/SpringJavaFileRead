package com.gul.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class ReadStringFromFile {


	public static void main(String[] args) throws IOException {
		File file = new File("data"+File.separator+"test.txt");
		String string = FileUtils.readFileToString(file);
		System.out.println("Read in: " + string);
	}
}
