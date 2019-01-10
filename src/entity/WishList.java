package entity;

import java.util.List;

public class WishList {
	private int wishEntry;
	private List<Children> childID;
	private List<PossibleWishes> wishID;

	WishList (int wishEntry, List<Children> childID, List<PossibleWishes> wishID){
		this.setWishEntry(wishEntry);
		this.setChildID(childID);
		this.setWishID(wishID);
	}

	public List<PossibleWishes> getWishID() {
		return wishID;
	}

	public void setWishID(List<PossibleWishes> wishID) {
		this.wishID = wishID;
	}

	public List<Children> getChildID() {
		return childID;
	}

	public void setChildID(List<Children> childID) {
		this.childID = childID;
	}

	public int getWishEntry() {
		return wishEntry;
	}

	public void setWishEntry(int wishEntry) {
		this.wishEntry = wishEntry;
	}

}
