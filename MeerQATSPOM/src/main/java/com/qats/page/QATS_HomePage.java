package com.qats.page;

import java.io.IOException;

import com.qats.utilities.TestBase;

public class QATS_HomePage extends TestBase {
	
	

	public QATS_HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public String HomePageTitle(){
		
		return driver.getTitle();
	}

}
