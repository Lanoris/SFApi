package com.example.SFApi

import com.google.gson.Gson
import java.io.File

object MoveIndex {

    val gson = Gson()

    fun saveMovesToJson(move: MoveModel.Move, MoveIndex: String) {
        val json = gson.toJson(move)
        val file = File(MoveIndex)
        file.writeText(json)

    }
}