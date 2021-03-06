package com.ethdenver.boulderbrackets.model

import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection="matches")
data class Match (
    val id: String,
    @DBRef
    val tournament: Tournament,
    @DBRef
    var player1: User?,
    @DBRef
    var player2: User?,
    @DBRef
    var winner: User?,
    @DBRef
    val match1: Match?,
    @DBRef
    val match2: Match?
)
