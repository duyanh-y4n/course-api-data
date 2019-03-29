package io.javabrains.springbootstarter.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

// Tell JPA that the objects of this class will be stored as entity in sql
@Entity
public class Topic {
    // Tell JPA that the attribute right below is the main key (Id) of the table
    @Id
    private  String id;
    private  String name;
    private  String description;

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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
}
