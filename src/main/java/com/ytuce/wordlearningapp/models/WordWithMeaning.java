package com.ytuce.wordlearningapp.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WordWithMeaning {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descriptionEn;
    private String descriptionTr;

    @ManyToOne
    @JoinColumn(name = "word_id")
    private Word word;

    @ManyToOne
    @JoinColumn(name = "meaning_id")
    private Meaning meaning;
}