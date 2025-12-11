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
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wordId;

    private String writing;
    private String wordType;

    @OneToMany(mappedBy = "word")
    private List<ExampleSentence> exampleSentences;

    @OneToMany(mappedBy = "word")
    private List<WordWithMeaning> meanings;
}