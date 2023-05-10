package com.example.SFApi

import com.example.SFApi.MoveIndex.saveMovesToJson
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SfApiApplication

fun main(args: Array<String>) {
	runApplication<SfApiApplication>(*args)

	val hadouken = MoveModel.Ryu.hadouken

	saveMovesToJson(hadouken, "moves.json")
}
