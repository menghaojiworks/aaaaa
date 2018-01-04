package com.user.ac.redpackge;

import com.user.ac.common.ActivityEvent;

import java.util.Date;

public class ReadActivityEvent implements ActivityEvent {
    //需要由工厂方法生成event
    private int eventType;

    private Date readTime;



    public int getEventType() {
        return eventType;
    }
}
