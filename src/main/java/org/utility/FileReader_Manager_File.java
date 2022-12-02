package org.utility;

import java.io.IOException;

public  class FileReader_Manager_File {

	public static Configuration_Reader getInstance() throws IOException {

		Configuration_Reader con=new Configuration_Reader();
		return con;
	}
	
}
