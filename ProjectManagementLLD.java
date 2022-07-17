package com.mathi.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

// Project POJO
class Project {
	private Integer projectId;
	private String projectName;
	private LocalDateTime createdDate;
	private LocalDateTime lastModifiedDate;
}

// Task level Model
class Task {

	private Integer projectId;
	private Integer taskId;
	private String taskName;
	private TaskType taskType;
	private Double hoursLeftForCompletion;
	private List<Integer> dependentTasks;
	private LocalDateTime createdDate;
	private LocalDateTime lastModifiedDate;

	// Getters & Setters
}

/*
 * Pre-defined task types
 */
enum TaskType {
	ANALYSIS, DEVELOPMENT, TESTING

	// Other Task types
}

/**
 * 
 * Manages all the Task related Opertations in the application
 *
 */
class ManageTasks {

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
	public List<Task> getAllTasks(Integer projectId) {

		// Using ORM Framework fetch the list of all tasks for the given project Id

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
		if (!validateTaskAndProjectId()) {
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
	private boolean validateTaskAndProjectId(Integer taskId) {
		// check if the task id is present in the DB
	}

	/**
	 * 
	 * Delete Task from the DB
	 * 
	 * @param taskId Input task Id to delete it from the DB
	 */
	private void deleteTask(Integer taskId) {

		// Validate the task Id
		if (!validateTaskAndProjectId()) {
			// throws exception
		}

	}

}

class ProjectManagement {

	ManageTasks manageTasks = new ManageTasks();

	/**
	 * Fetch all projects present in the appliaction
	 * 
	 * @return List<Project> Fetchs all the projects present in the appliaction
	 * 
	 */
	public List<Project> getAllProjects() {

	}

	/**
	 * Add a new project in the application
	 * 
	 * @param project Input project object
	 * @return Returns the project with its ID
	 * 
	 */
	public Project addProject(Project project) {

	}

	/**
	 * Fetch project by project Id
	 * 
	 * @param projectId
	 * @return
	 */
	public Project getProjectById(Integer projectId) {

	}

	/**
	 * Updates the project information
	 * 
	 * @param project
	 */
	public Project updateProject(Project project) {

	}

	/**
	 * Deletes the project from the system
	 * 
	 * @param projectId
	 */
	public void deleteProject(Integer projectId) {

	}

	/**
	 * 
	 * @param project
	 * 		Input Project 
	 * @param estimatedCompletionDate
	 * 
	 * @return
	 * 		Returns true if the estimatedCompletionDate is less than or equal to actual Completion Date
	 * @throws Exception
	 * 		
	 */
	public boolean validateProjectEstimation(Project project, LocalDate estimatedCompletionDate) throws Exception{
		
		// Step 1: Validate Project Id
		if(!validateProjectId())
			// throws exception.
		
		// Step 2: Calculate the completion date from task level
			LocalDateTime actualEndDate =	calculateCompletionDate(Project project)
		
		// Step 3: Compare if the task date is less than the estimatedCompletionDate
			// Make the estimatedCompletionDate's time as 23:59:59 and compare the dateTime that we fetched from "calculateCompletionDate" method
		
	}

	/**
	 * 
	 * @param project Input project object with its ID
	 * @return Return boolean based on the project Id validation
	 */
	private boolean validateProjectId(Project project) {

		// returns true if the project Id is present in the system

	}

	/**
	 * Returns the actual end date of the project by cumulating the tasks
	 * estimation.
	 */
	private LocalDateTime calculateCompletionDate(Project project) {

		// Step 1: using manageTasks get the list of tasks
		List<Task> lstTask;

		// Step 2: Loop through all the task and cumulate the hours for all the tasks

		// Step 3: Add the total hours to the current DateTime

		// Step 4: Return the calculated datetime

	}

}