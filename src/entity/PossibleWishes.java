package entity;

public class PossibleWishes {
	private int wishID;
	private String wishName;
	private String descriptrion;
	
	PossibleWishes (int wishID, String wishName, String description) {
		this.setWishID(wishID);
		this.setWishName(wishName);
		this.setDescriptrion(description);
		
	}

	public String getDescriptrion() {
		return descriptrion;
	}

	public void setDescriptrion(String descriptrion) {
		this.descriptrion = descriptrion;
	}

	public int getWishID() {
		return wishID;
	}

	public void setWishID(int wishID) {
		this.wishID = wishID;
	}

	public String getWishName() {
		return wishName;
	}

	public void setWishName(String wishName) {
		this.wishName = wishName;
	}
}
