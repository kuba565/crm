package pl.kuba565.crm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date created;

    private String topic;

    private Project project;

    private String description;

    private TaskStatus taskStatus;

    private TaskPriority taskPriority;
}
