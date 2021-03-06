package com.ethdenver.boulderbrackets.model

import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection="tournaments")
data class Tournament (
    val id: String,
    var name: String,
    var description: String,
    var status: String = "NEW",
    var prize: String,
    @DBRef
    val owner: User,
    val maxPlayers: Int,
    @DBRef
    var game: Game,
    @DBRef
    val participants: ArrayList<User>,
    @DBRef
    val matches: org.bson.Document,
    @Indexed(unique = true)
    val contractAddress: String
)
