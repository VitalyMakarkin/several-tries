package com.example.severaltries.core.data.model

data class Session(
    val id: Int,
    val wordVariants: List<String>,
    val currentVariant: String
)