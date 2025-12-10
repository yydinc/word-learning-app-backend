package com.ytuce.wordlearningapp.repositories;

import com.ytuce.wordlearningapp.models.WordRelation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRelationRepository extends JpaRepository<WordRelation, Long> {
}
