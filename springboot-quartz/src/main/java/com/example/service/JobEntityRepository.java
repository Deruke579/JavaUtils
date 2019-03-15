package com.example.service;

import com.example.entity.JobEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kelly on 2019/1/31.
 */
public interface JobEntityRepository extends CrudRepository<JobEntity, Long> {

    JobEntity getById(Integer id);
}
