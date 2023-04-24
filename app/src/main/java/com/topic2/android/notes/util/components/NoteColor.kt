package com.topic2.android.notes.util.components

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.background
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun NoteColor(){
    Box(
        modifier = Modifier.size(40.dp).background(Color.Red)
    )
}

@Preview
@Composable
fun NoteColorPreview(){
    NoteColor()
}

