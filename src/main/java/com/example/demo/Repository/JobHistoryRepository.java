package com.example.demo.Repository;

import com.example.demo.Entity.JobHistory;
import com.example.demo.Entity.JobHistoryId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobHistoryRepository extends JpaRepository<JobHistory, JobHistoryId> {
}
