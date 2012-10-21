package taskFilter;

import tasklist.*;

public class FilterByDueDate implements TaskFilter {
	
	private int numDays;
	
	public FilterByDueDate() {
		numDays = 5;
	}
	
	public FilterByDueDate(int days) {
		numDays = days;
	}

	public Task[] filter(Task[] tasks) {
		
		int counter = 0;
		int elementNumber = 0;
		
		for(int i=0; i<tasks.length; i++) {
			if(tasks[i].getDueInDays()<numDays) {
				counter++;
				
			}
		}
		Task[] filteredTasks = new Task[counter];
		for (int i=0; i<tasks.length; i++) {
			if(tasks[i].getDueInDays()<numDays) {
				filteredTasks[elementNumber] = tasks[i];
				elementNumber++;
			}
		}
		
		return filteredTasks;
	}
	public String toString() {
		return "Filter for tasks due in less than " + numDays + " day(s).";
	}

}
