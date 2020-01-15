package com.gul.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jxls.reader.ReaderBuilder;
import org.jxls.reader.XLSReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.ResourceUtils;

public class TestClass2 {
	@Autowired
	ResourceLoader resourceLoader;

	public static void main(String[] args) throws Exception {

//		Excelh
		File file2 = ResourceUtils.getFile("C:/Users/gulfa/OneDrive/Desktop/LMS.xlsx");
//		String streamPath = ;
//		InputStream stream = new FileInputStream(
//				"C:/Users/gulfa/OneDrive/Desktop/STS4 1.1/SpringExcelUpload/personData.xlsx");
		InputStream stream = new FileInputStream(file2.getPath());
		System.out.println("stream :	" + stream);
//		File file = new File("E:/STS 4/SpringJavaFileRead/personConfig.xml");
		File file = new File("C:/Users/gulfa/OneDrive/Desktop/course.xml");
		System.out.println("file" + file.getAbsolutePath());

		List<CourseDto> persons = TestClass2.parseExcelFileToBeans(stream, file);
		System.out.println("Person List: " + persons);

		for (CourseDto person : persons) {
			System.out.println("First Name: " + person.getCourse());
			System.out.println("Last Name: " + person.getImageUrl());
			System.out.println("Age: " + person.getLearningPath());
		}
	}

	public static <T> List<T> parseExcelFileToBeans(final InputStream xlsFile, final File jxlsConfigFile)
			throws Exception {
		System.out.println("test");
		final XLSReader xlsReader = ReaderBuilder.buildFromXML(jxlsConfigFile);
		System.out.println("test 2");
		final List<T> result = new ArrayList<>();
		final Map<String, Object> beans = new HashMap<>();
		beans.put("result", result);
		try {
			xlsReader.read(xlsFile, beans);
		} catch (Exception r) {
			r.printStackTrace();
//			throw new AssessmentGenericException("Problems in converting excel into java beans");
		}
		return result;
	}
}
