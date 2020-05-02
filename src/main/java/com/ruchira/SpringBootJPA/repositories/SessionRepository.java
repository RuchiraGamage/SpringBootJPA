package com.ruchira.SpringBootJPA.repositories;

import com.ruchira.SpringBootJPA.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ruchira on 5/2/2020.
 */
public interface SessionRepository extends JpaRepository<Session,Long> {
}
