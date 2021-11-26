package com.example.notes.utils
import com.example.notes.model.ModelNote

interface onClickItemListener {
    fun onClick(modelNote: ModelNote, position: Int)
}