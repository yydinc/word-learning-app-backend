package com.ytuce.wordlearningapp.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "example_sentences")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExampleSentence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "meaning_id")
    private WordMeaning meaning;

    @Column(name = "sentence_en", columnDefinition = "TEXT")
    private String sentenceEn;

    @Column(name = "sentence_tr", columnDefinition = "TEXT")
    private String sentenceTr;
}
