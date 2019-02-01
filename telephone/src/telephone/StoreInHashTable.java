package telephone;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class StoreInHashTable {

	public static void main(String[] args)throws Exception {
		Map<String,String> a=new Hashtable<>();
		FileReader file =new FileReader("C:/Users/BHANU/Desktop/JAVA/practice/telephone/phonebook.txt");
		BufferedReader reader=new BufferedReader(file);
		String str="";
		str=reader.readLine();
		while(str!=null)
		{
			//System.out.println(str);
			a.put(str.substring(11, str.length()),str.substring(0, 10));
			
			str=reader.readLine();
			
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name :");
		str=sc.next();
		if(a.get(str)!=null)
		System.out.print("Mobile Number:"+a.get(str));
		else
			System.out.println("Name not found");
		sc.close();
		reader.close();
		
	}

}
