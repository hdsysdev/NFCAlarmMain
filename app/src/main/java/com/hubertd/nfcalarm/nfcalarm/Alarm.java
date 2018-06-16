package com.hubertd.nfcalarm.nfcalarm;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

public class Alarm {
    public String title = "jeff";
    public Date currentTime = Calendar.getInstance().getTime();

    public Alarm(String title, Date currentTime) {
        this.title = title;
        this.currentTime = currentTime;
    }

    public String getTitle() {
        return title;
    }

    public Date getCurrentTime() {
        return currentTime;
    }
}
