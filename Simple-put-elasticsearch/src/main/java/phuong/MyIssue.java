package phuong;

public class MyIssue {
	private String id;

	private String subject;

	private String parentId;

	private String estimatedHours;

	private String spentHours;

	private String assignee;

	private String priorityText;

	private String doneRatio;

	private String project;

	private String author;

	private String startdate;

	private String duedate;

	private String tracker;

	private String description;

	private String createdOn;

	private String updatedOn;

	private String status;

	private String category;

	public MyIssue() {
	}

	public MyIssue(String id, String subject, String parentId, String estimatedHours, String spentHours,
			String assignee, String priorityText, String doneRatio, String project, String author, String startdate,
			String duedate, String tracker, String description, String createdOn, String updatedOn, String status,
			String category) {
		super();
		this.id = id;
		this.subject = subject;
		this.parentId = parentId;
		this.estimatedHours = estimatedHours;
		this.spentHours = spentHours;
		this.assignee = assignee;
		this.priorityText = priorityText;
		this.doneRatio = doneRatio;
		this.project = project;
		this.author = author;
		this.startdate = startdate;
		this.duedate = duedate;
		this.tracker = tracker;
		this.description = description;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.status = status;
		this.category = category;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getEstimatedHours() {
		return estimatedHours;
	}

	public void setEstimatedHours(String estimatedHours) {
		this.estimatedHours = estimatedHours;
	}

	public String getSpentHours() {
		return spentHours;
	}

	public void setSpentHours(String spentHours) {
		this.spentHours = spentHours;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getPriorityText() {
		return priorityText;
	}

	public void setPriorityText(String priorityText) {
		this.priorityText = priorityText;
	}

	public String getDoneRatio() {
		return doneRatio;
	}

	public void setDoneRatio(String doneRatio) {
		this.doneRatio = doneRatio;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getDuedate() {
		return duedate;
	}

	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}

	public String getTracker() {
		return tracker;
	}

	public void setTracker(String tracker) {
		this.tracker = tracker;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(String updatedOn) {
		this.updatedOn = updatedOn;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "MyIssue [id=" + id + ", subject=" + subject + ", parentId=" + parentId + ", estimatedHours="
				+ estimatedHours + ", spentHours=" + spentHours + ", assignee=" + assignee + ", priorityText="
				+ priorityText + ", doneRatio=" + doneRatio + ", project=" + project + ", author=" + author
				+ ", startdate=" + startdate + ", duedate=" + duedate + ", tracker=" + tracker + ", description="
				+ description + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + ", status=" + status
				+ ", category=" + category + "]";
	}

}