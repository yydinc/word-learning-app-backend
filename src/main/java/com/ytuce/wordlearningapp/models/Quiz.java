package com.ytuce.wordlearningapp.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quizId;

    @ManyToOne
    @JoinColumn(name = "word_list_id")
    private WordList wordList;

    @OneToMany(mappedBy = "quiz")
    private List<Question> questions;

    public void addQuestion(Question question) {
        question.setQuiz(this);
        this.questions.add(question);
    }
}