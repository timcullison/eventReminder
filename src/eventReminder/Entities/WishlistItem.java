package eventReminder.Entities;

import java.util.List;

public class WishlistItem {
	private Integer wishlistItemId;
    private Integer eventId;
	private String name;
	private String description;
	private String url;
    
    
    public WishlistItem() {
    }

    public WishlistItem(Integer eventId, String name, String description, String url) {
    	this.eventId = eventId;
    	this.name = name;
    	this.description = description;
    	this.url = url;
    }

    public WishlistItem(Integer wishlistId, Integer eventId, String name, String description, String url) {
        this.wishlistItemId = wishlistId;
        this.eventId = eventId;
        this.name = name;
        this.description = description;
        this.url = url;
    }

    public Integer getId() {
        return wishlistItemId;
    }

    public void setWishlistItemId(Integer wishlistItemId) {
        this.wishlistItemId = wishlistItemId;
    }
    
    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
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
        this.name = description;
    }
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
