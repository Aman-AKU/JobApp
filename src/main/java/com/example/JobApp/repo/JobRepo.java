package com.example.JobApp.repo;

import com.example.JobApp.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo
{
    List<JobPost> jobs=new ArrayList<>(Arrays.asList(


    ));

    public List<JobPost> getAllJobs(){
        return jobs;

    }
    public void addJobs(JobPost job){
        jobs.add(job);
    }

}
