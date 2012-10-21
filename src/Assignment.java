import taskFilter.*;
import tasklist.*;


public class Assignment {

	public static void main(String[] args) {
		Task[] filteredTasksAnon;
		Task[] tasks = new Task[] {
			new WorkTask("Add page", 2, false, "Website Redesign"),
			new WorkTask(),
			new ShoppingTask("Get Milk", 0, true, "Stop and Shop"),
			new ShoppingTask(),
			new BuyGiftTask(4, true, "birthday", "Mom"),
			new BuyGiftTask(),
		};
		TaskFilter[] filters = new TaskFilter[] {
			new FilterByDueDate(3),
			new FilterByDueDate()
		};
		Task[][] filteredTasks = new Task[filters.length][];
		TaskFilter dueTodayFilter = new TaskFilter() {

			public Task[] filter(Task[] tasks) {
				
				int counter = 0;
				int elementNumber = 0;
				
				for(int i=0; i<tasks.length; i++) {
					if(tasks[i].getDueInDays()==0) {
						counter++;
						
					}
				}
				Task[] filteredTasks = new Task[counter];
				for (int i=0; i<tasks.length; i++) {
					if(tasks[i].getDueInDays()==0) {
						filteredTasks[elementNumber] = tasks[i];
						elementNumber++;
					}
				}
				
				return filteredTasks;
			}
			public String toString() {
				return "Filter for tasks due today. (Anonymous class)";
			}
		};
		
		System.out.println("Task collection:");
		for(int i=0; i<tasks.length; i++) {
			printTask(tasks[i]);
		}
		System.out.println("Filter collection:");
		for(int i=0; i<filters.length; i++) {
			printFilter(filters[i]);
		}
		printFilter(dueTodayFilter);
		System.out.println("Filtering...");
		for(int i=0; i<filters.length; i++) {
			filteredTasks[i] = filters[i].filter(tasks);
			printFilter(filters[i]);
			for (int j=0; j<filteredTasks[i].length; j++) {
				printTask(filteredTasks[i][j]);
			}
		}
		filteredTasksAnon = dueTodayFilter.filter(tasks);
		printFilter(dueTodayFilter);
		for(int i=0; i<filteredTasksAnon.length; i++) {
			printTask(filteredTasksAnon[i]);
		}
		
		
	}
	
	private static void printTask(Task taskName) {
		System.out.println(taskName);
	}
	
	private static void printFilter(TaskFilter filterName) {
		System.out.println(filterName);
	}
}








