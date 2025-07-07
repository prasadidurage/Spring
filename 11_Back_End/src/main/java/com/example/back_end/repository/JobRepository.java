package com.example.back_end.repository;

import com.example.back_end.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository  extends JpaRepository<Job, Integer> {
}
