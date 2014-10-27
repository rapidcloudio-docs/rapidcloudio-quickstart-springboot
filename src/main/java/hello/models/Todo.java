package hello.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Todo {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    private String task;
    
    @Temporal(TemporalType.TIMESTAMP)
    public Date dateCreation;
    
    protected Todo() {
    	super();
    }
    
    public Todo(String task) {
    	this.task = task;
    	this.dateCreation = new Date();
    }
	
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


}
