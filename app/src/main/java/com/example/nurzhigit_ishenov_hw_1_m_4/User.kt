package com.example.nurzhigit_ishenov_hw_1_m_4

import java.io.Serializable

data class User(
    val surname: String,
    val name: String,
    val middleName: String) : Serializable
