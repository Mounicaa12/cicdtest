package Handson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class Readdata {
	@Test
	public void Readdata() throws IOException
	{
		String path =System.getProperty("user.dir")+"/testdataamaz.csv";
		//C:\Users\GNANESHWAR\Desktop\singitha\GoogleMap\testdataamaz.csv
		//CSVReader file=new CSVReader(new FileReader(path));
		FileReader file =new FileReader(path);
		Map<String, Map<String, String>> dataMap = new HashMap<>();
		BufferedReader bf=new BufferedReader(file);
		//System.out.println(bf.readLine()
		String[] header=bf.readLine().split(",");
		String key = "Productid";
		String line;
		System.out.println(Arrays.toString(header));
		while((line = bf.readLine())!=null)
		{
			//System.out.println(line);
			String values[]=line.split(",");
			Map<String,String> eachrow=new HashMap<>();
			String keyval = null;
			for(int i=0;i<header.length;i++)
			{
				if(header[i].trim().equals(key)){
					keyval = values[i].trim();
					System.out.println("keyval"+keyval);
				} else {
					eachrow.put(header[i], values[i].trim());
				}
			}
			if(keyval != null)
				dataMap.put(keyval, eachrow);
			System.out.println("eachrow"+eachrow);
			//dataMap.put("Productid3", eachhead);
			
		}
		System.out.println("final data: "+dataMap);
		System.out.println("final Product4: "+dataMap.get("Product4"));
		System.out.println("final Product4 -> Actualproduct : "+dataMap.get("Product4").get("Actualproduct"));
	}

}
