package book_transport_apps;

public class User {
	protected int id;
	protected String name;
	protected int phoneNo;
	protected String email;

public User() {
	
}

public User(String name, int phoneNo, String email, int id) {
	
	this.name = name;
	this.phoneNo = phoneNo;
	this.email = email;
	this.id = id;
}

public int getId()
{
	return id;
}

public void setId(int id)
{
	this.id = id;
}

public String getName()
{
	return name;
}

public void setName(String name)
{
	this.name = name;
}

public int getPhoneNo()
{
	return phoneNo;
}

public void setPhoneNo(int phoneNo)
{
	this.phoneNo = phoneNo;
}

public String getEmail()
{
	return email;
}

public void setEmail(String email)
{
	this.email = email;
}

@Override
public String toString() {
	return "ID: " + id + ", NAME: " + name + ", PHONE NO.: " + phoneNo + ", EMAIL: " + email;
}		
}
