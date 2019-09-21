package com.gul.test;

public class PlayerParserTest {

	public static void main(String[] args) {
		try {
			PlayerParser.parseAndDisplay(
					"C:/Users/gulfa/OneDrive/Desktop/STS4 1.1/SpringJavaFileRead/personConfig.xml",
					"C:/Users/gulfa/OneDrive/Desktop/STS4 1.1/SpringJavaFileRead/Players2.xlsx");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
