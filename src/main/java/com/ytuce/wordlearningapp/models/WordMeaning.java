package com.ytuce.wordlearningapp.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "word_meanings")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WordMeaning {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "word_id")
    private Word word;

    @Column(name = "meaning_tr")
    private String meaningTr;

    @Column(name = "meaning_en")
    private String meaningEn;

    @OneToMany(mappedBy = "meaning", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ExampleSentence> examples = new ArrayList<>();
}
