/*
[paper’s title, paper’s id number, course code, course incharge, semester and program names, the
date and time of the paper, type of the exam, invigilator, location, number of students in the
paper, and whether the paper is collected or not]
 */
package paper;

/**
 *
 * @author HP
 */
public final class Paper {
    /**
     * @param args the command line arguments
     */
    //The paper detail
    private String paper_tile;
    private String paper_id;
    private int course_code;
    private String incharge;
    private String semister;
    
    
    private DateTime dateTime;
    
    private static final double maxMarks = 100;
    private String exam_type;
    private String invigilator;
    private String location;
    private int numofstudent;
    private boolean collected;

    public Paper(String paper_tile, String paper_id, int course_code, String incharge, String semister, DateTime dateTime, String exam_type, String invigilator, String location, int numofstudent, boolean collected) {
        this.paper_tile = paper_tile;
        this.paper_id = paper_id;
        this.course_code = course_code;
        this.incharge = incharge;
        this.semister = semister;
        this.dateTime = dateTime;
        this.exam_type = exam_type;
        this.invigilator = invigilator;
        this.location = location;
        this.numofstudent = numofstudent;
        this.collected = collected;
    }

    public void setPaper_tile(String paper_tile) {
        this.paper_tile = paper_tile;
    }

    public void setPaper_id(String paper_id) {
        this.paper_id = paper_id;
    }

    public void setCourse_code(int course_code) {
        this.course_code = course_code;
    }

    public void setIncharge(String incharge) {
        this.incharge = incharge;
    }

    public void setSemister(String semister) {
        this.semister = semister;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setExam_type(String exam_type) {
        this.exam_type = exam_type;
    }

    public void setInvigilator(String invigilator) {
        this.invigilator = invigilator;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNumofstudent(int numofstudent) {
        this.numofstudent = numofstudent;
    }

    public void setCollected(boolean collected) {
        this.collected = collected;
    }

    public String getPaper_tile() {
        return paper_tile;
    }

    public String getPaper_id() {
        return paper_id;
    }

    public int getCourse_code() {
        return course_code;
    }

    public String getIncharge() {
        return incharge;
    }

    public String getSemister() {
        return semister;
    }

    public DateTime getDateTime() {
        return dateTime;
    }

    public static double getMaxMarks() {
        return maxMarks;
    }

    public String getExam_type() {
        return exam_type;
    }

    public String getInvigilator() {
        return invigilator;
    }

    public String getLocation() {
        return location;
    }

    public int getNumofstudent() {
        return numofstudent;
    }

    public boolean isCollected() {
        return collected;
    }

   
    
   /* public Paper(String paper_tile,String paper_id,int course_code,String incharge,String semister,int date,int month,int year,int time,int second,String exam_type,String invigilator,String location,int numofstudent,boolean collected){
       setPaper_tile(paper_tile);
       setPaper_id(paper_id);
       setCourse_code(course_code);
       setIncharge(incharge);
       setSemister(semister);
       setDate(date);
       setMonth(month);
       setYear(year);
       setTime(time);
       setExam_type(exam_type);
       setInvigailator(invigilator);
       setLocation(location);
       setNumberOfStudent(numofstudent);
       setCollected(collected);
       setsecond(sec);
    }

    public void setPaper_tile(String paper_tile) {
        this.paper_tile = paper_tile;
    }

    public void setPaper_id(String paper_id) {
        this.paper_id = paper_id;
    }

    public void setCourse_code(int course_code) {
        this.course_code = course_code;
    }

    public void setIncharge(String incharge) {
        this.incharge = incharge;
    }

    public void setSemister(String semister) {
        this.semister = semister;
    }

    public void setDate(int date) {
        this.date = date;
    }
    
    public void setMonth(int month){
        this.month=month;
    }
    
    public void setYear(int year){
        this.year=year;
    }
    
    public void setTime(int time) {
        this.time = time;
    }
    
    public void setsecond(int sec){
        this.sec=sec;
    }
    public void setExam_type(String exam_type) {
        this.exam_type = exam_type;
    }

    public void setInvigailator(String invigilator) {
        this.invigilator = invigilator;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNumberOfStudent(int numofstudent) {
        this.numofstudent = numofstudent;
    }

    public void setCollected(boolean collected) {
        this.collected = collected;
    }

    public String getPaper_tile() {
        return paper_tile;
    }

    public String getPaper_id() {
        return paper_id;
    }

    public int getCourse_code() {
        return course_code;
    }

    public String getIncharge() {
        return incharge;
    }

    public String getSemister() {
        return semister;
    }

    public int getDate() {
        return date;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getTime() {
        return time;
    }
    
    public int getsecond(){
        return sec;
    }
    public String getExam_type() {
        return exam_type;
    }

    public String getInvigilator() {
        return invigilator;
    }

    public String getLocation() {
        return location;
    }

    public int getNumofstudent() {
        return numofstudent;
    }

    public boolean isCollected() {
        return collected;
    }*/
   
    @Override
    public String toString() {
        return  "Type of exam :"+exam_type+"\t\t\t\t"+"Semister :"+semister+"\t\t\t\tDate :"+dateTime+"\nPaper title :"+paper_tile+"\t\t\t\tPaper_id :"+paper_id+"\nCode Code :"+course_code+"\t\t\t\t\tIncharge Name :"+incharge+"\nInvigilotor Name :"+invigilator+"\t\t\n"+"Number Of The Student :"+numofstudent+"\t\t\t\t\t\t\t\t\tLocation :"+location+"\n"+"The max marks of the paper :"+maxMarks+"\t\tIs paper is collected :"+collected;
    }
}
    
    
