package org.sample.dto;


import java.io.Serializable;

public class User implements Serializable {
   
    private static final long serialVersionUID = 1L;
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private String date;
   
    
    public User() {}

    public  User(int id,String firstName, String lastName, String email, String username, String password,String date)
    {
        super();
        this.id=id;
        this.firstName =firstName;
        this.lastName = lastName;
        this.email=email;
        this.username=username;
        this.password=password;
        this.date=date;
    }
    public int getId() 
    {
    	return id;
    }
    public void setId(int id)
    {
    	this.id=id;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getEmail() 
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

	public String getDate()
	{
		return date;
	}

	public void setDate(String date)
	{
		this.date = date;
	}
}