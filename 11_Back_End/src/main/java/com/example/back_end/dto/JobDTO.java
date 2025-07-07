package com.example.back_end.dto;



public class JobDTO {
    private String jobTitle;
    private String company;
    private String location;
    private String type;
    private String jobDescription;

    // No-argument constructor
    public JobDTO() {
    }

    // All-argument constructor
    public JobDTO(String jobTitle, String company, String location, String type, String jobDescription) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.location = location;
        this.type = type;
        this.jobDescription = jobDescription;
    }

    // Getters and Setters
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
}

