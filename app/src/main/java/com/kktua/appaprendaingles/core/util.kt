package com.kktua.appaprendaingles.core

import android.media.MediaPlayer
import androidx.fragment.app.FragmentActivity

fun playSound(sound: Int, activity: FragmentActivity?) {
    val mediaPlayer = MediaPlayer.create(activity, sound)

    if (mediaPlayer != null) {
        mediaPlayer.start()
        mediaPlayer.setOnCompletionListener {
            mediaPlayer.release()
        }
    }
}