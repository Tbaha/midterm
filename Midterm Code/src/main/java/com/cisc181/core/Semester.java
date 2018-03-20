package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {
private Date EndDate;
private UUID SemesterID;
private Date StartDate;
public Semester(UUID semesterID, Date startDate, Date endDate) {
	super();
	SemesterID= semesterID;
	StartDate = startDate;
	EndDate= endDate;
}
public Date getEndDate() {
	return EndDate;
}
public UUID getSemesterID() {
	return SemesterID;
}
public Date getStartDate() {
	return StartDate;
}
private void setEndDate(Date endDate) {
	EndDate = endDate;
}
private void setSemesterID(UUID semesterID) {
	SemesterID = semesterID;
}
private void setStartDate(Date startDate) {
	StartDate = startDate;
}

}
