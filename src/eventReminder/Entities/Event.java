package eventReminder.Entities;

import java.sql.Date;
import java.util.List;

public class Event {
	private Integer eventId;
	private Integer userId;
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private boolean isRecurring;
    private List<WishlistItem> wishlistItems;
    
    public Event() {
    }

    public Event(Integer userId, String name, String description, Date startDate, Date endDate, boolean isRecurring, List<WishlistItem> wishlistItems) {
    	this.userId = userId;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isRecurring = isRecurring;
        this.wishlistItems = wishlistItems;
    }

    public Event(Integer eventId, Integer userId, String name, String description, Date startDate, Date endDate, boolean isRecurring, List<WishlistItem> wishlistItems) {
        this.eventId = eventId;
        this.userId = userId;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isRecurring = isRecurring;
        this.wishlistItems = wishlistItems;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
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
    
    public boolean getIsRecurring() {
    	return isRecurring;
    }
    
    public void setIsRecurring(boolean isRecurring) {
    	this.isRecurring = isRecurring;
    }
    
    public List<WishlistItem> getWishlistItems() {
    	return wishlistItems;
    }
    
    public void setWishlistItems(List<WishlistItem> wishlistItems) {
    	this.wishlistItems = wishlistItems;
    }
}
