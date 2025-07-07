package com.example.back_end.service;

import com.example.back_end.dto.JobDTO;
import com.example.back_end.entity.Job;

import java.util.List;

public interface Jobservise {
    public void saveJob(JobDTO jobDTO);
    void updateJob(Job job);

    List<JobDTO> getAll();
}
