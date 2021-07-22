package sg.edu.ep.c346.id20029318.demotodolist;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ToDoItem {

    private String title;
    private Calendar date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public ToDoItem(String title, Calendar date){

        this.title = title;
        this.date = date;

    }

    @Override
    public String toString() { // form date into string
        Date date = this.date.getTime();
        SimpleDateFormat dateForm1 = new SimpleDateFormat("dd/MM/yyyy");
        String theDate = dateForm1.format(date);

        SimpleDateFormat dateForm2 = new SimpleDateFormat("EEEE");
        String theDay = dateForm2.format(date);

        String str = theDate + " ("+ theDay + ")";

        return str;
    }


}
