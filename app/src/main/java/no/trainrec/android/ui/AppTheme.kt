package no.trainrec.android.ui;

import androidx.compose.Composable
import androidx.ui.material.MaterialTheme
import androidx.ui.material.darkColorPalette

@Composable
fun MyAppTheme(content: @Composable() () -> Unit) {
    MaterialTheme(colors = darkColorPalette()) {
        content()
    }
}