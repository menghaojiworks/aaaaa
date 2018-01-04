package com.user.ac.redpackge;

import com.user.ac.common.Activity;
import com.user.ac.common.ActivityEvent;
import com.user.ac.common.IncentiveSpecification;

public class EffectiveReadSpecification implements IncentiveSpecification {
    //对应数据库这条政策的id,方便以后做政策关键参数更新
    private String specificationId;
    //有效读取的次数，触发事件的点
    private int readNum;

    private int eventType;

    public boolean isSatisfied(Activity activity) {
        ActivityEvent activityEvent = activity.getLatestEvent();

        if(true){

        }
        return true;
    }
}
