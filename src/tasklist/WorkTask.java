package tasklist;


public class WorkTask extends Task {
	private String project;
	
	public WorkTask() {
		super();
		project = "for what?";
	}
	
	public WorkTask(String description, int dueInDays, boolean repeat, String project) {
		super(description, dueInDays, repeat, false);
		this.project = project;
	}
	
	public String toString() {
		return "Task - Description: " + getDescription() + ", " +
				"For: " + project + ", " +
				"Due In: " + getDueInDays() + 
				" days, Complete: " + getComplete();
	}
}