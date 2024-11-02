package eventReminder.Entities;

import java.util.List;

public class SystemUser {
	private Integer userId;
    private String username;
    private String email;
    private String password;
    private List<Event> events;
    
    public SystemUser() {
    }

    public SystemUser(String username, String email, String password, List<Event> events) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public SystemUser(Integer userId, String username, String email, String password, List<Event> events) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Integer getId() {
        return userId;
    }

    public void setId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }
    
    public String getemail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public List<Event> getEvents() {
    	return this.events;
    }
    
    public void setEvents(List<Event> events) {
    	this.events = events;
    }
}
