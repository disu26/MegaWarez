package com.example.megawarez.dao;

import com.example.megawarez.domain.Session;
import org.springframework.data.repository.CrudRepository;

public interface SessionDao extends CrudRepository<Session, Long> {
}
