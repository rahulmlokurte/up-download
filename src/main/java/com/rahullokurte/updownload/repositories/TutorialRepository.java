package com.rahullokurte.updownload.repositories;

import com.rahullokurte.updownload.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
}
