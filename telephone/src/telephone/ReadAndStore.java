package telephone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class ReadAndStore {

	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		File newfile=new File("C:/Users/BHANU/Desktop/JAVA/practice/telephone/phonebook.txt");
		FileWriter fileW=new FileWriter(newfile,true);
		BufferedWriter buffW=new BufferedWriter(fileW);
		String number="",name="";
		FileReader file =new FileReader("C:/Users/BHANU/Desktop/JAVA/practice/telephone/phonebook.txt");
		BufferedReader reader=new BufferedReader(file);
		int t,k=0,n=0;
		do {
			System.out.print("Enter mobile number:");
			number=sc.next();
			System.out.print("Enter name:");
			name=sc.next();
			String str=reader.readLine();
			while(str!=null)
			{
				//System.out.println(str);
				String temp=str.substring(11, str.length());
				String temp1=str.substring(0, 10);
				if(number.equals(temp1))
				{
					n=1;
				}
				if(name.equals(temp))
				{k=1;
				}
				str=reader.readLine();
			}
			if(n==1)
			{System.out.print("Number already exists ! \nPlease enter other number:");
			number=sc.next();
			}
			if(k==1)
				{System.out.print("Name already exists ! \nPlease enter other name:");
				name=sc.next();
				}
			buffW.write(number+" "+name+"\n");
			System.out.print("Enter 0 to exit or 1 to add another no:");
			t=sc.nextInt();
		}while(t!=0);
		buffW.close();
		fileW.close();
		reader.close();
		sc.close();
	}

}
