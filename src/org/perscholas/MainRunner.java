package org.perscholas;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import org.perscholas.models.Cars;


public class MainRunner {

	public static void main(String[] args) {
	
		
		File fin = new File("cars.csv");
		
		System.out.println(fin.exists());
		
		
		LinkedList<Character> data = new LinkedList<>();	
		ArrayList<Cars> carList = new ArrayList<>();
		
		try(FileReader fr = new FileReader(fin);BufferedReader bf = new BufferedReader(fr);){
			bf.readLine();
			String[] oneLineOfData = bf.readLine().split(",");
			System.out.println(Arrays.toString(oneLineOfData));
			Cars carObj = new Cars(
					oneLineOfData[0],
					Double.parseDouble(oneLineOfData[1].strip()),
					Double.parseDouble(oneLineOfData[2].strip()),
					Double.parseDouble(oneLineOfData[3].strip()),
					Double.parseDouble(oneLineOfData[4].strip()),
					Double.parseDouble(oneLineOfData[5].strip()),
					Double.parseDouble(oneLineOfData[6].strip()),
					Double.parseDouble(oneLineOfData[7].strip()),
					oneLineOfData[8]);
			System.out.println(carObj);
			carList.add(carObj);
			
		} catch(IOException e){
			e.printStackTrace();
		}
		
		
//		try(FileInputStream fileInputStream = new FileInputStream(fin);
//				BufferedInputStream bis = new BufferedInputStream(fileInputStream);) {
//			
//			int i;
//			while((i=bis.read())  != -1) {
//			data.add(Character.toUpperCase((char)i)); 
//			System.out.print(Character.toUpperCase((char)i));
//			
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		
//		
//		File fout = new File("output.txt");
//		try(FileOutputStream fileOutputStream = new FileOutputStream(fout,true);
//				BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);){
//			
//
//			for(Character i: data) {
//				bufferedOutputStream.write(i);
//			}
//			
//		}catch(IOException e) {
//			e.printStackTrace();
			
		}
		
		
		
		
		
		
		
		

	}


