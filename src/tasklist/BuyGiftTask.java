package tasklist;


public class BuyGiftTask extends Task {
	private String occasion;
	private String recipient;
	
	public BuyGiftTask() {
		super();
		occasion = "what?";
		recipient = "whom?";
	}
	
	public BuyGiftTask(int dueInDays, boolean restrictedHours, String occasion, String recipient) {
		super("Gift", dueInDays, false, restrictedHours);
		this.occasion = occasion;
		this.recipient = recipient;
	}
	
	public String toString() {
		return "Task - Description: " + getDescription() + ", " +
				"For: " + recipient + "'s " + occasion +
				", In: " + getDueInDays() + 
				" days, Can do anytime: " + getRestrictedHours();
	}
}
