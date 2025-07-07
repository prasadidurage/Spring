package com.example.back_end.controller;

import com.example.back_end.dto.JobDTO;
import com.example.back_end.entity.Job;
import com.example.back_end.service.impl.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/job")
@RequiredArgsConstructor
public class JobController {

    @Autowired
    private JobService jobService;

    @PostMapping("addjob")
    public String addJob(@RequestBody JobDTO jobDTO) {
        jobService.saveJob(jobDTO);
        return "Create Job";
    }

    @PutMapping("updatejob")
    public String updateJob(@RequestBody Job job) {
        jobService.updateJob(job);
        return "Update Job";
    }

    @GetMapping("getjob")
    public List<JobDTO> getAllJobs() {
   return jobService.getAll();


    }
}
