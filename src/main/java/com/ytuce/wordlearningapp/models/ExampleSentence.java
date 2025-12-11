package com.ytuce.wordlearningapp.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExampleSentence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long exampleSentenceId;

    private String sentenceTr;
    private String sentenceEn;

    @ManyToOne
    @JoinColumn(name = "word_with_meaning_id")
    private WordWithMeaning word;
}