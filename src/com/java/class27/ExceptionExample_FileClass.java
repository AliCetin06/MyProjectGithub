package com.java.class27;

import java.io.File;
import java.io.IOException;

public class ExceptionExample_FileClass {

	// Compile-time Exception

	public static void main(String[] args) {

		createNewFile();
	}

	public static void createNewFile() {
		
		// File object ??
		File file = new File("resources/nonexistentFile.txt");   // creating a object on that path
		try {
			file.createNewFile();  // checking that nonexistentFile.txt file exit or not
		} catch (IOException e) {
			
			System.out.println("Directory does not exist");
			
			e.printStackTrace(); // all message of exception 
		}
	}

}

/*				
 *                             File Class in Java
 *                             
 * The File class is Java’s representation of a file or directory pathname. Because file and directory names 
 * have different formats on different platforms, a simple string is not adequate to name them. 
 * The File class contains several methods for working with the pathname, deleting and renaming files, 
 * creating new directories, listing the contents of a directory, and determining several common attributes
 *  of files  and directories. 
 *  			How to create a File Object? 
 *  	 File a = new File("/usr/local/bin/geeks");
 * 
 * 
 */


