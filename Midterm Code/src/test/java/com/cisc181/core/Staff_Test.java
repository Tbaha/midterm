package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() throws PersonException {
		ArrayList<Staff> staffList= new ArrayList<Staff>();
        Staff one = new Staff("Travis", "Ramroop", "Bahadur", new Date(1999,1,14), "101 Twighlight Drive Newark Delaware 19711", "302-313-0001", "trb@udel.edu", "11-5pm", 1, 200000.00, new Date(2022,6,1), eTitle.MR);
        Staff two = new Staff("Steve", "Edward", "Sheehan", new Date(1998,9,23), "102 Twighlight Drive Newark Delaware 19711", "302-424-0002", "ses@udel.edu", "11-5pm", 1, 200000.00, new Date(2022,6,1), eTitle.MR);
        Staff three = new Staff("Jake", "Stephen", "Screen", new Date(1998,9,11), "103 Twightlight Drive Newark Delaware 19711", "302-535-0003", "jss@udel.edu", "11-5pm", 1, 200000.00, new Date(2022,6,1), eTitle.MR);
        Staff four = new Staff("Anton", "Derek", "Hovanec", new Date(1999,3,25), "104 Twighlight Drive Newark Delaware 19711", "302-646-0004", "adh@udel.edu", "11-5pm", 1, 200000.00, new Date(2022,6,1), eTitle.MR);
        Staff five = new Staff("Bert", "Wizard", "Gibbons", new Date(1973,2,29), "105 Twightlight Drive Newark Delaware 19711", "302-757-0005", "bwg@udel.edu", "2-6pm", 1, 800000.00, new Date(1998,1,1), eTitle.MR);
	
    staffList.add(one);
	staffList.add(two);
	staffList.add(three);
	staffList.add(four);
	staffList.add(five);
	
	double TotalSalary = 0;
	for(Staff name : staffList) {
		TotalSalary = TotalSalary + name.getSalary();
	}
	int AverageSalary = (int) TotalSalary / staffList.size();
	
	assertEquals(AverageSalary, 320000);
	}
	@Test(expected = PersonException.class)
	public void TestDataException() throws PersonException{
	Staff Staff1 = new Staff("Travis", "Ramroop", "Bahadur", new Date(1800, 1, 14), "Twighlight Drive Newark Delaware 19711", "302-313-0001", "trb@udel.edu", "11-5pm", 1, 200000.00, new Date(2022,6,1), eTitle.MR);
}
	@Test(expected = PersonException.class)
	public void TestPhoneNumber() throws PersonException{
	Staff Staff1 = new Staff("Travis", "Ramroop", "Bahadur", new Date(1800, 1, 14), "Twighlight Drive Newark Delaware 19711", "302-313-000", "trb@udel.edu", "11-5pm", 1, 200000.00, new Date(2022,6,1), eTitle.MR);
	}
}
