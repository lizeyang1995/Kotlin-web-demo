package com.example.WebDemo.po

import javax.persistence.*

@Entity
class User(
        @Id @GeneratedValue(strategy = GenerationType.AUTO) var id: Long = 0,
        @Column(name = "first_name") var firstName: String,
        @Column(name = "last_name") var lastName: String
)