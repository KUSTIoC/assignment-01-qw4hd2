/*
 * Part of the Assignment for course CS213 Object Oriented Programming.
 * IoC KUST
 * Spring 2020
 */

package ems;


public class Paper {
    private int paperID;
    private String courseName;
    private String courseIncharge;
    private String semester;
    private String program;
    private Date date;
    private Time time;
    
    private String examType;
    private static final double maxMarks = 100;
    
    private String location;
    private String invigilator;
    private int numberOfStudents;
    private boolean isCollected;
}
