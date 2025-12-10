package com.ytuce.wordlearningapp.repositories;

import com.ytuce.wordlearningapp.models.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, Long> {
}
