/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paper;

/**
 *
 * @author HP
 */
   public class DateTime
{
    private String date;
    private String time;

    public DateTime(String date, String time) {
        this.date = date;
        this.time = time;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return  "date=" + date + ", time=" + time;
    }
    
}
