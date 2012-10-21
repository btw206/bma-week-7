package tasklist;

public class ShoppingTask extends Task {
	private String store;
	
	public ShoppingTask() {
		super();
		store = "where?";
	}
	
	public ShoppingTask(String description, int dueInDays, boolean repeat, String store) {
		super(description, dueInDays, repeat, true);
		this.store = store;
	}
	
	public String toString() {
		return "Task - Description: " + getDescription() + ", " +
				"At: " + store + ", " +
				"Need Within: " + getDueInDays() + 
				" days, Complete: " + getComplete();
	}	
}