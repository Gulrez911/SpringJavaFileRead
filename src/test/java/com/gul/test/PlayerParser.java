package com.gul.test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jxls.reader.ReaderBuilder;
import org.jxls.reader.XLSReader;

public class PlayerParser {

	 String mappingFile;
	   String excelFile;
	   
	   private PlayerParser()
	   {
	     
	   }
	   
	   private static PlayerParser init(){
	   
	      return new PlayerParser();
	   }
	   
	   private void setExternalFileLocation(String mappingFile , String excelFile){
	      this.mappingFile=mappingFile;
	      this.excelFile=excelFile;
	   }
	   
	   
	   public static void parseAndDisplay(String mappingFile , String excelFile ) throws Exception
	   {
	      PlayerParser ref = init();
	      ref.setExternalFileLocation(mappingFile,excelFile);
	      List<Player> players = ref.doConfigtask();
	      ref.display(players);
	     
	   }
	   
	   private void display(List<Player> players ){
	      for(Player  player : players)
	      {
	          System.out.println(player);
	      }
	   }
	   
	   private List<Player>  doConfigtask() throws Exception{
	      final XLSReader xlsReader = ReaderBuilder.buildFromXML(new File(mappingFile));
	       final List<Player> result = new ArrayList<Player>();
	       final Map<String, Object> beans = new HashMap<String, Object>();
	       beans.put("players", result);
	       InputStream inputStream = new BufferedInputStream(new FileInputStream(excelFile));
	       xlsReader.read(inputStream, beans);      
	       return result;

	     
	   }
	   

}
