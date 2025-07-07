package com.example.back_end.service.impl;

import com.example.back_end.dto.JobDTO;
import com.example.back_end.entity.Job;
import com.example.back_end.repository.JobRepository;
import com.example.back_end.service.Jobservise;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService implements Jobservise {
    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private ModelMapper modelMapper;



@Override
    public void saveJob(JobDTO jobDTO) {
     //   Job job = new Job();
//        job.setJobTitle(jobDTO.getJobTitle());
//        job.setCompany(jobDTO.getCompany());
//        job.setLocation(jobDTO.getLocation());
//        job.setType(jobDTO.getType());
//        job.setDescription(jobDTO.getJobDescription());
        jobRepository.save(modelMapper.map(jobDTO, Job.class));

//        System.out.println(jobDTO.getJobTitle());
//        System.out.println(jobDTO.getCompany());
//        System.out.println(jobDTO.getLocation());
//        System.out.println(jobDTO.getType());
//        System.out.println(jobDTO.getJobDescription());
    }

    @Override
    public void updateJob(Job job) {
        jobRepository.save(modelMapper.map(job, Job.class));

    }

    @Override
    public List<JobDTO> getAll() {
        List<Job> jobList = jobRepository.findAll();
        return jobList.stream()
                .map(job -> modelMapper.map(job, JobDTO.class))
                .toList();    }
}
