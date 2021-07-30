package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity(name="skill")
public class Skill extends AbstractEntity {
//    @Id
//    @GeneratedValue
//    private int id;
//
//    @NotBlank(message = "Name is required")
//    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
//    private String name;

    @Size(max = 200, message = "Description cannot be more than 200 characters")
    private String description;

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs;

    public Skill() {
    }

    public Skill(String name, String skillDescription) {
        super();
        this.name = name;
        this.description = skillDescription;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String skillDescription) {
        this.description = skillDescription;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void addJob(Job job) {
        this.jobs.add(job);
    }
}
