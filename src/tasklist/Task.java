package tasklist;

public abstract class Task {
		private String description;
		private int dueInDays;
		private boolean complete;
		private boolean repeat;
		private boolean restrictedHours;
		
		Task(String description, int dueInDays, boolean repeat, boolean restrictedHours) {
			this.description = description;
			this.dueInDays = dueInDays;
			this.complete = false;
			this.repeat = repeat;
			this.restrictedHours = restrictedHours;
		}
		
		Task() {
			this("Needs description", 7, false, false);
		}
		
		public String toString() { 
			return "";
		}
		
		public String getDescription() {
			return description;
		}
		
		public int getDueInDays() {
			return dueInDays;
		}
		
		public boolean getComplete() {
			return complete;
		}
		
		public boolean getRestrictedHours() {
			return restrictedHours;
		}
		
		public void markComplete() {
			this.complete = true;
		}
		
		public void updateDueInDays(int updatedDays) {
			this.dueInDays = updatedDays;
		}
	

}
