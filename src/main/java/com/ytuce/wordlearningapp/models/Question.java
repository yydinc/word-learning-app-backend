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
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionId;

    private String questionType;
    private String questionSentence;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

    @ManyToOne
    @JoinColumn(name = "meaning_id")
    private Meaning meaning;

    @OneToMany(mappedBy = "question")
    private List<Answer> correctAnswers;

    @OneToMany(mappedBy = "question")
    private List<Answer> userAnswers;

    public void addUserAnswer(Answer answer) {
        answer.setQuestion(this);
        this.userAnswers.add(answer);
    }

    public void addCorrectAnswer(Answer answer) {
        answer.setQuestion(this);
        this.userAnswers.add(answer);
    }
}