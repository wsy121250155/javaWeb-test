
package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import model.Point;

public class Loader {

	public static void main(String[] args){
		Loader loader = new Loader();
		String path = "src/tables/000001.csv";
		File file = new File(path);
		List<String> list = loader.readLines(file,true);
		for(String s : list){
			System.out.println(s);
		}
	}
	private String path = "D:/file/workspace-ee/Ajax-Demo/WebContent/tables/000001.csv";
	
	public List<Point> getPoints(){
		LinkedList<Point> list = new LinkedList<Point>();
		File file = new File(path);
		String str = file.getAbsolutePath();
		List<String> lines = readLines(file,true);
		for(String s : lines){
			String[] temp = s.split(",");
			double close = Double.valueOf(temp[0]);
			double volume = Double.valueOf(temp[1]);
			Point p = new Point(close,volume);
			list.add(p);
		}
		return list;
	}
	public List<String> getLines(){
//		LinkedList<Point> list = new LinkedList<Point>();
		File file = new File(path);
//		String str = file.getAbsolutePath();
		List<String> lines = readLines(file,true);
		return lines;
	}
	private List<String> readLines(File	file,boolean hasHeader){
		FileReader fr = null;
		BufferedReader br = null;
		LinkedList<String> list = new LinkedList<String>();
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			if(hasHeader){
				br.readLine();
			}
			String line = null;
			while((line = br.readLine()) != null){
				list.add(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
				if(br!= null){
					br.close();
				}
				if(fr != null){
					fr.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		return list;
	}
}
