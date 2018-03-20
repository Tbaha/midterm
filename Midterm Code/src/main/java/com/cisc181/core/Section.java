package com.cisc181.core;

import java.util.UUID;

public class Section {
private UUID CourseID;
private int RoomID;
private UUID SectionID;
private UUID SemesterID;
public Section(UUID courseID, UUID semesterID, UUID sectionID, int roomID) {
	super();
	CourseID = courseID;
	SemesterID = semesterID;
	SectionID = sectionID;
	RoomID = roomID;
}
public UUID getCourseID() {
	return CourseID;
}
public int getRoomID() {
	return RoomID;
}
public UUID getSectionID() {
	return SectionID;
}
public UUID getSemesterID() {
	return SemesterID;
}
private void setCourseID(UUID courseID) {
	CourseID = courseID;
}
private void setRoomID(int roomID) {
	RoomID = roomID;
}
private void setSectionID(UUID sectionID) {
	SectionID = sectionID;
}
private void setSemesterID(UUID semesterID) {
	SemesterID = semesterID;
}

}
