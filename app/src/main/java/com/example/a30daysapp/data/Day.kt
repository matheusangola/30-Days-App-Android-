package com.example.a30daysapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30daysapp.R


data class Day(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val dayNumber: Int,
    @StringRes val toDo: Int
)

val days = listOf(
    Day(R.drawable.run1, R.string.challenge_day, 1, R.string.day_1),
    Day(R.drawable.run, R.string.challenge_day, 2, R.string.day_2),
    Day(R.drawable.rest, R.string.challenge_day, 3, R.string.day_3),
    Day(R.drawable.run2, R.string.challenge_day, 4, R.string.day_4),
    Day(R.drawable.run3, R.string.challenge_day, 5, R.string.day_5),
    Day(R.drawable.run4, R.string.challenge_day, 6, R.string.day_6),
    Day(R.drawable.rest1, R.string.challenge_day, 7, R.string.day_7),
    Day(R.drawable.run6, R.string.challenge_day, 8, R.string.day_8),
    Day(R.drawable.run7, R.string.challenge_day, 9, R.string.day_9),
    Day(R.drawable.rest2, R.string.challenge_day, 10, R.string.day_10),
    Day(R.drawable.run9, R.string.challenge_day, 11, R.string.day_11),
    Day(R.drawable.run10, R.string.challenge_day, 12, R.string.day_12),
    Day(R.drawable.run11, R.string.challenge_day, 13, R.string.day_13),
    Day(R.drawable.rest3, R.string.challenge_day, 14, R.string.day_14),
    Day(R.drawable.run13, R.string.challenge_day, 15, R.string.day_15),
    Day(R.drawable.run14, R.string.challenge_day, 16, R.string.day_16),
    Day(R.drawable.rest4, R.string.challenge_day, 17, R.string.day_17),
    Day(R.drawable.run16, R.string.challenge_day, 18, R.string.day_18),
    Day(R.drawable.run17, R.string.challenge_day, 19, R.string.day_19),
    Day(R.drawable.run321, R.string.challenge_day, 20, R.string.day_20),
    Day(R.drawable.run19, R.string.challenge_day, 21, R.string.day_21),
    Day(R.drawable.run20, R.string.challenge_day, 22, R.string.day_22),
    Day(R.drawable.run15, R.string.challenge_day, 23, R.string.day_23),
    Day(R.drawable.rest6, R.string.challenge_day, 24, R.string.day_24),
    Day(R.drawable.run5, R.string.challenge_day, 25, R.string.day_25),
    Day(R.drawable.run8, R.string.challenge_day, 26, R.string.day_26),
    Day(R.drawable.run12, R.string.challenge_day, 27, R.string.day_27),
    Day(R.drawable.rest7, R.string.challenge_day, 28, R.string.day_28),
    Day(R.drawable.rest8, R.string.challenge_day, 29, R.string.day_29),
    Day(R.drawable.run123, R.string.challenge_day, 30, R.string.day_30),
    )
