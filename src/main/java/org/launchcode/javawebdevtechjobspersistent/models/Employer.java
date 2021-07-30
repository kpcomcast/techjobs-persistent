package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity(name="employer")
public class Employer extends AbstractEntity {
//    @Id
//    @GeneratedValue
//    private int id;

//    @NotBlank(message = "Name is required")
//    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
//    private String name;

    @NotBlank(message = "Location is required")
    @Size(min = 3, max = 30, message = "Location must be between 3 and 30 characters")
    private String location;

    @OneToMany(mappedBy = "employer")
    private List<Job> jobs;

    public Employer() {
    }

    public Employer(String name, String location) {
        super();
        this.name = name;
        this.location = location;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void addJob(Job job) {
        this.jobs.add(job);
    }
}
