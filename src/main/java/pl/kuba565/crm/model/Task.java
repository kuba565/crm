package pl.kuba565.crm.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date created;

    private String topic;

    @ManyToOne
    private Project project;

    private String description;

    @OneToOne
    private TaskStatus taskStatus;

    @OneToOne
    private TaskPriority taskPriority;

    @OneToMany
    private List<User> currentlyAssignedUsers;

    public Task() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public TaskPriority getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(TaskPriority taskPriority) {
        this.taskPriority = taskPriority;
    }

    public List<User> getCurrentlyAssignedUsers() {
        return currentlyAssignedUsers;
    }

    public void setCurrentlyAssignedUsers(List<User> currentlyAssignedUsers) {
        this.currentlyAssignedUsers = currentlyAssignedUsers;
    }
}
