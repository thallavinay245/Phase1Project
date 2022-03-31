package com.mphasis.basics;

	
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Phase1Project {

	public static void main(String[] args) throws IOException {
		String operation;
		String rootPath = "C:\\Phase1Project\\";
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("1.retrive files in ascending order");
			System.out.println("2.Business level operation");
			System.out.println("2.1 add file");
			System.out.println("2.2 delete file");
			System.out.println("2.3 search for a file");
			System.out.println("2.4 go to main menu");
			System.out.println("3.exit from the app");
			operation = sc.nextLine();
			switch (operation) {
			case "1":
				File fileDir = new File(rootPath);
				List<String> listFile = Arrays.asList(fileDir.list());
				System.out.println("Listing files unsorted");
				for (String s : listFile) {
					System.out.println(s);
				}
				Collections.sort(listFile);
				System.out.println("---------------------------------------");
				System.out.println("Sorting by filename in ascending order");
				for (String s : listFile) {
					System.out.println(s);
				}
				System.out.println("---------------------------------------");
				break;
			case "2.1":
				System.out.println("Enter filename");
				Scanner sc1 = new Scanner(System.in);
				ArrayList<String> al = new ArrayList<>();

				String filename = sc1.next();
				String finalname = rootPath + filename;
				File f = new File(finalname);
				boolean b = f.createNewFile();
				if (b != true) {
					System.out.println("the file not created");
				} else {
					al.add(filename);
					System.out.println("file created");
				}
				break;
			case "2.2":
				Scanner sc2 = new Scanner(System.in);
				System.out.println("enter the file name to be deleted");
				String filname = sc2.nextLine();
				String finalfile = rootPath + "\\" + filname;
				System.out.print(finalfile);
				File file = new File(finalfile);
				file.delete();
				System.out.println("file deleted");
				break;
			case "2.3":
				File f1 = new File(rootPath);
				Scanner sc3 = new Scanner(System.in);
				System.out.println("enter the file name to search");
				String filsearchname = sc3.next();
				File filename1[] = f1.listFiles();
				int flag = 0;
				for (File ff : filename1) {
					if (ff.getName().equals(filsearchname)) {
						flag = 1;
						break;
					} else {
						flag = 0;
					}

				}

				if (flag == 1) {
					System.out.println("found the file");
				} else {
					System.out.println("file is not found");
				}
				break;

			case "2.4":
				break;
			case "3":
				System.exit(0);
				
			}

		}
	}

}
