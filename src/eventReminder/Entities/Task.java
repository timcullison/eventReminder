package eventReminder.Entities;

import java.sql.Date;
import java.util.List;

public class Task {
	private Integer taskId;
	private Integer userId;
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private boolean	recurDaily;
    private boolean	recurWeekly;
    private boolean	recurMonthly;
    private boolean	recurYearly;
    
    public Task() {
    }

    public Task(Integer userId, String name, String description, Date startDate, Date endDate, boolean recurDaily, boolean recurWeekly, boolean recurMonthly, boolean recurYearly) {
    	this.userId = userId;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.recurDaily = recurDaily;
        this.recurWeekly = recurWeekly;
        this.recurMonthly = recurMonthly;
        this.recurYearly = recurYearly;
    }

    public Task(Integer taskId, Integer userId, String name, String description, Date startDate, Date endDate, boolean recurDaily, boolean recurWeekly, boolean recurMonthly, boolean recurYearly) {
        this.taskId = taskId;
        this.userId = userId;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.recurDaily = recurDaily;
        this.recurWeekly = recurWeekly;
        this.recurMonthly = recurMonthly;
        this.recurYearly = recurYearly;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getUserId() {
        return userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Date getStartDate() {
    	return startDate;
    }
    
    public void setStartDate(Date startDate) {
    	this.startDate = startDate;
    }
    
    public Date getEndDate() {
    	return endDate;
    }
    
    public void setEndDate(Date endDate) {
    	this.endDate = endDate;
    }
    
    public boolean getRecurDaily() {
    	return recurDaily;
    }
    
    public void setRecurDaily(boolean recur) {
    	this.recurDaily = recur;
    }
    
    public boolean getRecurWeekly() {
    	return recurWeekly;
    }
    
    public void setRecurWeekly(boolean recur) {
    	this.recurWeekly = recur;
    }
    
    public boolean getRecurMonthly() {
    	return recurMonthly;
    }
    
    public void setRecurMonthly(boolean recur) {
    	this.recurMonthly = recur;
    }
    
    public boolean getRecurYearly() {
    	return recurYearly;
    }
    
    public void setRecurYearly(boolean recur) {
    	this.recurYearly = recur;
    }
}
