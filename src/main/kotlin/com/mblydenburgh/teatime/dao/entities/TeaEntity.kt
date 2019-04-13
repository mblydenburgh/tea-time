package com.mblydenburgh.teatime.dao.entities

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "teas")
data class TeaEntity(
        @Id
        val id: String = UUID.randomUUID().toString(),

        @Column
        val name: String,

        @Column
        val maker: String,

        @Column
        val type: String,

        @Column
        val caffeine: String,

        @Column
        val rating: Int
)