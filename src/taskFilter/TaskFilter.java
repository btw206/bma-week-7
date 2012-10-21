package taskFilter;

import tasklist.*;

public interface TaskFilter {
	public Task[] filter(Task[] tasks);
	public String toString();

}
