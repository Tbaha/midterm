package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	static  ArrayList<Course> courseList = new ArrayList<Course>();
	
    static ArrayList<Semester> semesterList = new ArrayList<Semester>();

    static ArrayList<Section> sectionList = new ArrayList<Section>();

    static ArrayList<Student> studentList = new ArrayList<Student>();
    
    static ArrayList<Enrollment> enrollmentList = new ArrayList<Enrollment>();

	@BeforeClass
	public static void setup() throws PersonException{
	        try{
	        Course c1 = new Course(UUID.randomUUID(), "math1", 01, eMajor.COMPSI);
	        Course c2 = new Course(UUID.randomUUID(), "math2", 02, eMajor.PHYSICS);
	        Course c3 = new Course(UUID.randomUUID(), "math3", 03, eMajor.CHEM);
	        courseList.add(c1);
	        courseList.add(c2);
	        courseList.add(c3);
	       
	        Semester s1 = new Semester(UUID.randomUUID(), new Date(2017, 9, 1), new Date(2017, 12, 14));
	        Semester s2 = new Semester(UUID.randomUUID(), new Date(2018, 2, 4), new Date(2018, 5, 24));
	        semesterList.add(s1);
	        semesterList.add(s2);
	       
	        Section section1 = new Section(c1.getCourseID(), s1.getSemesterID(), UUID.randomUUID(), 101);
	        Section section2 = new Section(c1.getCourseID(), s2.getSemesterID(), UUID.randomUUID(), 102);
	        Section section3 = new Section(c2.getCourseID(), s1.getSemesterID(), UUID.randomUUID(), 103);
	        Section section4 = new Section(c2.getCourseID(), s2.getSemesterID(), UUID.randomUUID(), 104);
	        Section section5 = new Section(c3.getCourseID(), s1.getSemesterID(), UUID.randomUUID(), 105);
	        Section section6 = new Section(c3.getCourseID(), s2.getSemesterID(), UUID.randomUUID(), 106);
	        sectionList.add(section1);
	        sectionList.add(section2);
	        sectionList.add(section3);
	        sectionList.add(section4);
	        sectionList.add(section5);
	        sectionList.add(section6);
	       
	        Student student1 = new Student("Wizard", "status", "newbie", new Date(1999,2,29), eMajor.COMPSI,  "212 Unkown to muggles Los Country 99999 ", "010 101 0110", "wsn@udel.edu");
	        Student student2 = new Student("Wizard", "status", "newbie", new Date(1999,2,29), eMajor.COMPSI,  "212 Unkown to muggles Los Country 99999 ", "010 101 0110", "wsn@udel.edu");
	        Student student3 = new Student("Wizard", "status", "newbie", new Date(1999,2,29), eMajor.COMPSI,  "212 Unkown to muggles Los Country 99999 ", "010 101 0110", "wsn@udel.edu");
	        Student student4 = new Student("Wizard", "status", "newbie", new Date(1999,2,29), eMajor.COMPSI,  "212 Unkown to muggles Los Country 99999 ", "010 101 0110", "wsn@udel.edu");
	        Student student5 = new Student("Wizard", "status", "newbie", new Date(1999,2,29), eMajor.COMPSI,  "212 Unkown to muggles Los Country 99999 ", "010 101 0110", "wsn@udel.edu");
	        Student student6 = new Student("Wizard", "status", "newbie", new Date(1999,2,29), eMajor.COMPSI,  "212 Unkown to muggles Los Country 99999 ", "010 101 0110", "wsn@udel.edu");
	        Student student7 = new Student("Wizard", "status", "newbie", new Date(1999,2,29), eMajor.COMPSI,  "212 Unkown to muggles Los Country 99999 ", "010 101 0110", "wsn@udel.edu");
	        Student student8 = new Student("Wizard", "status", "newbie", new Date(1999,2,29), eMajor.COMPSI,  "212 Unkown to muggles Los Country 99999 ", "010 101 0110", "wsn@udel.edu");
	        Student student9 = new Student("Wizard", "status", "newbie", new Date(1999,2,29), eMajor.COMPSI,  "212 Unkown to muggles Los Country 99999 ", "010 101 0110", "wsn@udel.edu");
	        Student student10 = new Student("Wizard", "status", "newbie", new Date(1999,2,29), eMajor.COMPSI,  "212 Unkown to muggles Los Country 99999 ", "010 101 0110", "wsn@udel.edu");
	        studentList.add(student1);
	        studentList.add(student2);
	        studentList.add(student3);
	        studentList.add(student4);
	        studentList.add(student5);
	        studentList.add(student6);
	        studentList.add(student7);
	        studentList.add(student8);
	        studentList.add(student9);
	        studentList.add(student10);
	       
	        Enrollment Sect1Stud1 = new Enrollment(section1.getSectionID(), student1.getStudentID());
	        Enrollment Sect1Stud2 = new Enrollment(section1.getSectionID(), student2.getStudentID());
	        Enrollment Sect1Stud3 = new Enrollment(section1.getSectionID(), student3.getStudentID());
	        Enrollment Sect1Stud4 = new Enrollment(section1.getSectionID(), student4.getStudentID());
	        Enrollment Sect1Stud5 = new Enrollment(section1.getSectionID(), student5.getStudentID());
	        Enrollment Sect1Stud6 = new Enrollment(section1.getSectionID(), student6.getStudentID());
	        Enrollment Sect1Stud7 = new Enrollment(section1.getSectionID(), student7.getStudentID());
	        Enrollment Sect1Stud8 = new Enrollment(section1.getSectionID(), student8.getStudentID());
	        Enrollment Sect1Stud9 = new Enrollment(section1.getSectionID(), student9.getStudentID());
	        Enrollment Sect1Stud10 = new Enrollment(section1.getSectionID(), student10.getStudentID());
	        Sect1Stud1.setGrade(100.00);
	        Sect1Stud2.setGrade(90.00);
	        Sect1Stud3.setGrade(90.00);
	        Sect1Stud4.setGrade(90.00);
	        Sect1Stud5.setGrade(90.00);
	        Sect1Stud6.setGrade(90.00);
	        Sect1Stud7.setGrade(90.00);
	        Sect1Stud8.setGrade(90.00);
	        Sect1Stud9.setGrade(90.00);
	        Sect1Stud10.setGrade(90.00);
	       
	        Enrollment Sect2Stud1 = new Enrollment(section1.getSectionID(), student1.getStudentID());
	        Enrollment Sect2Stud2 = new Enrollment(section1.getSectionID(), student2.getStudentID());
	        Enrollment Sect2Stud3 = new Enrollment(section1.getSectionID(), student3.getStudentID());
	        Enrollment Sect2Stud4 = new Enrollment(section1.getSectionID(), student4.getStudentID());
	        Enrollment Sect2Stud5 = new Enrollment(section1.getSectionID(), student5.getStudentID());
	        Enrollment Sect2Stud6 = new Enrollment(section1.getSectionID(), student6.getStudentID());
	        Enrollment Sect2Stud7 = new Enrollment(section1.getSectionID(), student7.getStudentID());
	        Enrollment Sect2Stud8 = new Enrollment(section1.getSectionID(), student8.getStudentID());
	        Enrollment Sect2Stud9 = new Enrollment(section1.getSectionID(), student9.getStudentID());
	        Enrollment Sect2Stud10 = new Enrollment(section1.getSectionID(), student10.getStudentID());
	        Sect2Stud1.setGrade(100.00);
	        Sect2Stud2.setGrade(90.00);
	        Sect2Stud3.setGrade(90.00);
	        Sect2Stud4.setGrade(90.00);
	        Sect2Stud5.setGrade(90.00);
	        Sect2Stud6.setGrade(90.00);
	        Sect2Stud7.setGrade(90.00);
	        Sect2Stud8.setGrade(90.00);
	        Sect2Stud9.setGrade(90.00);
	        Sect2Stud10.setGrade(90.00);
	       
	        Enrollment Sect3Stud1 = new Enrollment(section1.getSectionID(), student1.getStudentID());
	        Enrollment Sect3Stud2 = new Enrollment(section1.getSectionID(), student2.getStudentID());
	        Enrollment Sect3Stud3 = new Enrollment(section1.getSectionID(), student3.getStudentID());
	        Enrollment Sect3Stud4 = new Enrollment(section1.getSectionID(), student4.getStudentID());
	        Enrollment Sect3Stud5 = new Enrollment(section1.getSectionID(), student5.getStudentID());
	        Enrollment Sect3Stud6 = new Enrollment(section1.getSectionID(), student6.getStudentID());
	        Enrollment Sect3Stud7 = new Enrollment(section1.getSectionID(), student7.getStudentID());
	        Enrollment Sect3Stud8 = new Enrollment(section1.getSectionID(), student8.getStudentID());
	        Enrollment Sect3Stud9 = new Enrollment(section1.getSectionID(), student9.getStudentID());
	        Enrollment Sect3Stud10 = new Enrollment(section1.getSectionID(), student10.getStudentID());
	        Sect3Stud1.setGrade(100.00);
	        Sect3Stud2.setGrade(90.00);
	        Sect3Stud3.setGrade(90.00);
	        Sect3Stud4.setGrade(90.00);
	        Sect3Stud5.setGrade(90.00);
	        Sect3Stud6.setGrade(90.00);
	        Sect3Stud7.setGrade(90.00);
	        Sect3Stud8.setGrade(90.00);
	        Sect3Stud9.setGrade(90.00);
	        Sect3Stud10.setGrade(90.00);
	       
	        Enrollment Sect4Stud1 = new Enrollment(section1.getSectionID(), student1.getStudentID());
	        Enrollment Sect4Stud2 = new Enrollment(section1.getSectionID(), student2.getStudentID());
	        Enrollment Sect4Stud3 = new Enrollment(section1.getSectionID(), student3.getStudentID());
	        Enrollment Sect4Stud4 = new Enrollment(section1.getSectionID(), student4.getStudentID());
	        Enrollment Sect4Stud5 = new Enrollment(section1.getSectionID(), student5.getStudentID());
	        Enrollment Sect4Stud6 = new Enrollment(section1.getSectionID(), student6.getStudentID());
	        Enrollment Sect4Stud7 = new Enrollment(section1.getSectionID(), student7.getStudentID());
	        Enrollment Sect4Stud8 = new Enrollment(section1.getSectionID(), student8.getStudentID());
	        Enrollment Sect4Stud9 = new Enrollment(section1.getSectionID(), student9.getStudentID());
	        Enrollment Sect4Stud10 = new Enrollment(section1.getSectionID(), student10.getStudentID());
	        Sect4Stud1.setGrade(100.00);
	        Sect4Stud2.setGrade(90.00);
	        Sect4Stud3.setGrade(90.00);
	        Sect4Stud4.setGrade(90.00);
	        Sect4Stud5.setGrade(90.00);
	        Sect4Stud6.setGrade(90.00);
	        Sect4Stud7.setGrade(90.00);
	        Sect4Stud8.setGrade(90.00);
	        Sect4Stud9.setGrade(90.00);
	        Sect4Stud10.setGrade(90.00);
	       
	        Enrollment Sect5Stud1 = new Enrollment(section1.getSectionID(), student1.getStudentID());
	        Enrollment Sect5Stud2 = new Enrollment(section1.getSectionID(), student2.getStudentID());
	        Enrollment Sect5Stud3 = new Enrollment(section1.getSectionID(), student3.getStudentID());
	        Enrollment Sect5Stud4 = new Enrollment(section1.getSectionID(), student4.getStudentID());
	        Enrollment Sect5Stud5 = new Enrollment(section1.getSectionID(), student5.getStudentID());
	        Enrollment Sect5Stud6 = new Enrollment(section1.getSectionID(), student6.getStudentID());
	        Enrollment Sect5Stud7 = new Enrollment(section1.getSectionID(), student7.getStudentID());
	        Enrollment Sect5Stud8 = new Enrollment(section1.getSectionID(), student8.getStudentID());
	        Enrollment Sect5Stud9 = new Enrollment(section1.getSectionID(), student9.getStudentID());
	        Enrollment Sect5Stud10 = new Enrollment(section1.getSectionID(), student10.getStudentID());
	        Sect5Stud1.setGrade(100.00);
	        Sect5Stud2.setGrade(90.00);
	        Sect5Stud3.setGrade(90.00);
	        Sect5Stud4.setGrade(90.00);
	        Sect5Stud5.setGrade(90.00);
	        Sect5Stud6.setGrade(90.00);
	        Sect5Stud7.setGrade(90.00);
	        Sect5Stud8.setGrade(90.00);
	        Sect5Stud9.setGrade(90.00);
	        Sect5Stud10.setGrade(90.00);
	       
	        Enrollment Sect6Stud1 = new Enrollment(section1.getSectionID(), student1.getStudentID());
	        Enrollment Sect6Stud2 = new Enrollment(section1.getSectionID(), student2.getStudentID());
	        Enrollment Sect6Stud3 = new Enrollment(section1.getSectionID(), student3.getStudentID());
	        Enrollment Sect6Stud4 = new Enrollment(section1.getSectionID(), student4.getStudentID());
	        Enrollment Sect6Stud5 = new Enrollment(section1.getSectionID(), student5.getStudentID());
	        Enrollment Sect6Stud6 = new Enrollment(section1.getSectionID(), student6.getStudentID());
	        Enrollment Sect6Stud7 = new Enrollment(section1.getSectionID(), student7.getStudentID());
	        Enrollment Sect6Stud8 = new Enrollment(section1.getSectionID(), student8.getStudentID());
	        Enrollment Sect6Stud9 = new Enrollment(section1.getSectionID(), student9.getStudentID());
	        Enrollment Sect6Stud10 = new Enrollment(section1.getSectionID(), student10.getStudentID());
	        Sect6Stud1.setGrade(100.00);
	        Sect6Stud2.setGrade(90.00);
	        Sect6Stud3.setGrade(90.00);
	        Sect6Stud4.setGrade(90.00);
	        Sect6Stud5.setGrade(90.00);
	        Sect6Stud6.setGrade(90.00);
	        Sect6Stud7.setGrade(90.00);
	        Sect6Stud8.setGrade(90.00);
	        Sect6Stud9.setGrade(90.00);
	        Sect6Stud10.setGrade(90.00);
	
	        
	        enrollmentList.add(Sect1Stud1);
	        enrollmentList.add(Sect1Stud2);
	        enrollmentList.add(Sect1Stud3);
	        enrollmentList.add(Sect1Stud4);
	        enrollmentList.add(Sect1Stud5);
	        enrollmentList.add(Sect1Stud6);
	        enrollmentList.add(Sect1Stud7);
	        enrollmentList.add(Sect1Stud8);
	        enrollmentList.add(Sect1Stud9);
	        enrollmentList.add(Sect1Stud10);
	        
	        enrollmentList.add(Sect2Stud1);
	        enrollmentList.add(Sect2Stud2);
	        enrollmentList.add(Sect2Stud3);
	        enrollmentList.add(Sect2Stud4);
	        enrollmentList.add(Sect2Stud5);
	        enrollmentList.add(Sect2Stud6);
	        enrollmentList.add(Sect2Stud7);
	        enrollmentList.add(Sect2Stud8);
	        enrollmentList.add(Sect2Stud9);
	        enrollmentList.add(Sect2Stud10);
	        
	        enrollmentList.add(Sect3Stud1);
	        enrollmentList.add(Sect3Stud2);
	        enrollmentList.add(Sect3Stud3);
	        enrollmentList.add(Sect3Stud4);
	        enrollmentList.add(Sect3Stud5);
	        enrollmentList.add(Sect3Stud6);
	        enrollmentList.add(Sect3Stud7);
	        enrollmentList.add(Sect3Stud8);
	        enrollmentList.add(Sect3Stud9);
	        enrollmentList.add(Sect3Stud10);
	        
	        enrollmentList.add(Sect4Stud1);
	        enrollmentList.add(Sect4Stud2);
	        enrollmentList.add(Sect4Stud3);
	        enrollmentList.add(Sect4Stud4);
	        enrollmentList.add(Sect4Stud5);
	        enrollmentList.add(Sect4Stud6);
	        enrollmentList.add(Sect4Stud7);
	        enrollmentList.add(Sect4Stud8);
	        enrollmentList.add(Sect4Stud9);
	        enrollmentList.add(Sect4Stud10);
	        
	        enrollmentList.add(Sect5Stud1);
	        enrollmentList.add(Sect5Stud2);
	        enrollmentList.add(Sect5Stud3);
	        enrollmentList.add(Sect5Stud4);
	        enrollmentList.add(Sect5Stud5);
	        enrollmentList.add(Sect5Stud6);
	        enrollmentList.add(Sect5Stud7);
	        enrollmentList.add(Sect5Stud8);
	        enrollmentList.add(Sect5Stud9);
	        enrollmentList.add(Sect5Stud10);
	        
	        enrollmentList.add(Sect6Stud1);
	        enrollmentList.add(Sect6Stud2);
	        enrollmentList.add(Sect6Stud3);
	        enrollmentList.add(Sect6Stud4);
	        enrollmentList.add(Sect6Stud5);
	        enrollmentList.add(Sect6Stud6);
	        enrollmentList.add(Sect6Stud7);
	        enrollmentList.add(Sect6Stud8);
	        enrollmentList.add(Sect6Stud9);
	        enrollmentList.add(Sect6Stud10);
	        }
	
	catch(PersonException e) {
		e.printStackTrace();
	}
	}
	
	@Test
	public void S1gpa() {
		double gpa = ((enrollmentList.get(0).getGrade() + enrollmentList.get(10).getGrade() + enrollmentList.get(20).getGrade()
                + enrollmentList.get(30).getGrade() + enrollmentList.get(40).getGrade() + enrollmentList.get(50).getGrade())/100/6)*4;
        assertEquals(gpa, 4.00, .01);	
	}
	
	@Test
	public void S2gpa() {
		double gpa = ((enrollmentList.get(1).getGrade() + enrollmentList.get(11).getGrade() + enrollmentList.get(21).getGrade()
                + enrollmentList.get(31).getGrade() + enrollmentList.get(41).getGrade() + enrollmentList.get(51).getGrade())/100/6)*4;
        assertEquals(gpa, 3.60, .01);
	}
	
	@Test
	public void S3gpa() {
		double gpa = ((enrollmentList.get(2).getGrade() + enrollmentList.get(12).getGrade() + enrollmentList.get(22).getGrade()
                + enrollmentList.get(32).getGrade() + enrollmentList.get(42).getGrade() + enrollmentList.get(52).getGrade())/100/6)*4;
        assertEquals(gpa, 3.60, .01);	
	}
	
	@Test
	public void S4gpa() {
		double gpa = ((enrollmentList.get(3).getGrade() + enrollmentList.get(13).getGrade() + enrollmentList.get(23).getGrade()
                + enrollmentList.get(33).getGrade() + enrollmentList.get(43).getGrade() + enrollmentList.get(53).getGrade())/100/6)*4;
        assertEquals(gpa, 3.60, .01);	
	}
	@Test
	public void S5gpa() {
		double gpa = ((enrollmentList.get(4).getGrade() + enrollmentList.get(14).getGrade() + enrollmentList.get(24).getGrade()
                + enrollmentList.get(34).getGrade() + enrollmentList.get(44).getGrade() + enrollmentList.get(54).getGrade())/100/6)*4;
        assertEquals(gpa, 3.60, .01);	
	}
	@Test
	public void S6gpa() {
		double gpa = ((enrollmentList.get(5).getGrade() + enrollmentList.get(15).getGrade() + enrollmentList.get(25).getGrade()
                + enrollmentList.get(35).getGrade() + enrollmentList.get(45).getGrade() + enrollmentList.get(55).getGrade())/100/6)*4;
        assertEquals(gpa, 3.60, .01);	
	}
	@Test
	public void S7gpa() {
		double gpa = ((enrollmentList.get(6).getGrade() + enrollmentList.get(16).getGrade() + enrollmentList.get(26).getGrade()
                + enrollmentList.get(36).getGrade() + enrollmentList.get(46).getGrade() + enrollmentList.get(56).getGrade())/100/6)*4;
        assertEquals(gpa, 3.60, .01);	
	}
	@Test
	public void S8gpa() {
		double gpa = ((enrollmentList.get(7).getGrade() + enrollmentList.get(17).getGrade() + enrollmentList.get(27).getGrade()
                + enrollmentList.get(37).getGrade() + enrollmentList.get(47).getGrade() + enrollmentList.get(57).getGrade())/100/6)*4;
        assertEquals(gpa, 3.60, .01);	
	}
	@Test
	public void S9gpa() {
		double gpa = ((enrollmentList.get(8).getGrade() + enrollmentList.get(18).getGrade() + enrollmentList.get(28).getGrade()
                + enrollmentList.get(38).getGrade() + enrollmentList.get(48).getGrade() + enrollmentList.get(58).getGrade())/100/6)*4;
        assertEquals(gpa, 3.60, .01);	
	}
	@Test
	public void S10gpa() {
		double gpa = ((enrollmentList.get(9).getGrade() + enrollmentList.get(19).getGrade() + enrollmentList.get(29).getGrade()
                + enrollmentList.get(39).getGrade() + enrollmentList.get(49).getGrade() + enrollmentList.get(59).getGrade())/100/6)*4;
        assertEquals(gpa, 3.60, .01);	
	}
	
	@Test
    public void C1Avg() {
        int avg = (int) (enrollmentList.get(0).getGrade() + enrollmentList.get(1).getGrade() + enrollmentList.get(2).getGrade() +
                enrollmentList.get(3).getGrade() + enrollmentList.get(4).getGrade() + enrollmentList.get(5).getGrade() +
                enrollmentList.get(6).getGrade() + enrollmentList.get(7).getGrade() + enrollmentList.get(8).getGrade() +
                enrollmentList.get(9).getGrade() + enrollmentList.get(10).getGrade() + enrollmentList.get(11).getGrade() + enrollmentList.get(12).getGrade() +
                enrollmentList.get(13).getGrade() + enrollmentList.get(14).getGrade() + enrollmentList.get(15).getGrade() +
                enrollmentList.get(16).getGrade() + enrollmentList.get(17).getGrade() + enrollmentList.get(18).getGrade() +
                enrollmentList.get(19).getGrade());
        avg = avg/20;
        assertEquals(avg, 91); 		
    }

	@Test
    public void C2Avg() {
        int avg = (int) (enrollmentList.get(20).getGrade() + enrollmentList.get(21).getGrade() + enrollmentList.get(22).getGrade() +
                enrollmentList.get(23).getGrade() + enrollmentList.get(24).getGrade() + enrollmentList.get(25).getGrade() +
                enrollmentList.get(26).getGrade() + enrollmentList.get(27).getGrade() + enrollmentList.get(28).getGrade() +
                enrollmentList.get(29).getGrade() + enrollmentList.get(30).getGrade() + enrollmentList.get(31).getGrade() + enrollmentList.get(32).getGrade() +
                enrollmentList.get(33).getGrade() + enrollmentList.get(34).getGrade() + enrollmentList.get(35).getGrade() +
                enrollmentList.get(36).getGrade() + enrollmentList.get(37).getGrade() + enrollmentList.get(38).getGrade() +
                enrollmentList.get(39).getGrade());
        avg = avg/20;
        assertEquals(avg, 91); 		
    }
	
	@Test
    public void C3Avg() {
        int avg = (int) (enrollmentList.get(40).getGrade() + enrollmentList.get(41).getGrade() + enrollmentList.get(42).getGrade() +
                enrollmentList.get(43).getGrade() + enrollmentList.get(44).getGrade() + enrollmentList.get(45).getGrade() +
                enrollmentList.get(46).getGrade() + enrollmentList.get(47).getGrade() + enrollmentList.get(48).getGrade() +
                enrollmentList.get(49).getGrade() + enrollmentList.get(50).getGrade() + enrollmentList.get(51).getGrade() + enrollmentList.get(52).getGrade() +
                enrollmentList.get(53).getGrade() + enrollmentList.get(54).getGrade() + enrollmentList.get(55).getGrade() +
                enrollmentList.get(56).getGrade() + enrollmentList.get(57).getGrade() + enrollmentList.get(58).getGrade() +
                enrollmentList.get(59).getGrade());
        avg = avg/20;
        assertEquals(avg, 91); 		
    }
}