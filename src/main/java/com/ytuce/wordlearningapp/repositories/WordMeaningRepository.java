package com.ytuce.wordlearningapp.repositories;

import com.ytuce.wordlearningapp.models.WordMeaning;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordMeaningRepository extends JpaRepository<WordMeaning, Long> {
}
