package com.ytuce.wordlearningapp.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "word_relations")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WordRelation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Main word (source)
    @ManyToOne
    @JoinColumn(name = "word_id")
    private Word word;

    // Related word (target)
    @ManyToOne
    @JoinColumn(name = "related_word_id")
    private Word relatedWord;

    @Column(name = "relation_type")
    private String relationType; // synonym, form, similar, etc.

}
