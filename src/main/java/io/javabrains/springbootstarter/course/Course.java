package io.javabrains.springbootstarter.course;

import io.javabrains.springbootstarter.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;

// Tell JPA that the objects of this class will be stored as entity in sql
@Entity
public class Course {
    // Tell JPA that the attribute right below is the main key (Id) of the table
    @Id
    private String id;
    private String name;
    private String description;
    private Topic topic;

    public Course(String id, String name, String description, String topicId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId, "", "");
    }

    public Course() {

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTopic(String topicId, String topicName, String topicSdescription) {
        this.topic.setId(topicId);
        this.topic.setName(topicName);
        this.topic.setDescription(topicSdescription);
    }
}
