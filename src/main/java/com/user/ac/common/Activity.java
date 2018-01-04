package com.user.ac.common;

import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by hc on 2018/1/4.
 */
public interface Activity {
    //事件发生，每个事件到来，将触发监听者模式
    public void addEvent(ActivityEvent event);

    public ActivityEvent getLatestEvent();
//    //活动是否还生效，该标志应该由外部维护，配置文件
//    public boolean isActive();
//    //活动开始时间
//    public Date getStartTime();
//    //从specifications跟获取所有incentivespecification以及对应的incentiveaction
//    public ConcurrentHashMap<IncentiveSpecification,IncentiveAction> getSpeci


}
