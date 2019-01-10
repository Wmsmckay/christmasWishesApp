package entity;

public class Children {
	private int childID;
	private String firstName;
	private String lastName;
	private boolean onNiceList;
	
	
	public Children(int childID, String firstName, 
			String lastName, boolean onNiceList) {
		this.setChildID(childID);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setOnNiceList(onNiceList);
	}


	public boolean isOnNiceList() {
		return onNiceList;
	}


	public void setOnNiceList(boolean onNiceList) {
		this.onNiceList = onNiceList;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public int getChildID() {
		return childID;
	}


	public void setChildID(int childID) {
		this.childID = childID;
	}
}
