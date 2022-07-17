import java.util.List;

import com.mathi.practice.Task;
import com.mathi.practice.TaskType;

class Task {

	private Integer taskId;
	private String taskName;
	private TaskType taskType;
	private Double hoursLeftForCompletion;
	private List<Integer> dependentTasks;

	// Getters & Setters
}

/*
 * Pre-defined task types
 */
enum TaskType {
	ANALYSIS, DEVELOPMENT, TESTING

	// Other Task types
}

class ProjectManagement {

	/**
	 * Creates a new task for the project
	 * 
	 * @param task Takes the input task that has to be created to complete the
	 *             project
	 * @return Task Returns the task that has been saved in the backend system. The
	 *         return task will have the task ID
	 */
	public Task addTask(Task task) {

		// Using any ORM framework the data is persisted in the backend database

		// returns the save task along with the ID

	}

	/**
	 * Fetch all tasks from DB
	 * 
	 * @return List<Task> Returns the list of tasks that is present in the backend
	 *         database.
	 */
	public List<Task> getAllTasks() {

		// Using ORM Framework fetch the list of all tasks

	}

	/**
	 * 
	 * Update the task in the DB
	 * 
	 * @param task Input Task
	 * @return
	 */
	public Task updateTask(Task task) {

		// Validate the task Id
		if (!validateTaskId()) {
			// throws exception
		}

		// Update the given task by its ID in the database

	}

	/**
	 * 
	 * Validates if the task id is present in the system or not
	 * 
	 * @param taskId Input task Id
	 * @return
	 * 
	 */
	private boolean validateTaskId(Integer taskId) {
		// check if the task id is present in the DB
	}

	/**
	 * 
	 * Delete Task from the DB
	 * @param taskId Input task Id to delete it from the DB
	 */
	private void deleteTask(Integer taskId) {

		// Validate the task Id
		if (!validateTaskId()) {
			// throws exception
		}

	}
