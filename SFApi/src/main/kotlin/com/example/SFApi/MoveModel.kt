package com.example.SFApi

class MoveModel {
    // Not adding stun since we're going to adapt this for street fighter 6.
    data class Move(
        val name: String, val input: String, val damage: Int, val activeFrames: Int?, val recovery: Int, val onHit: Int,
        val block: Int, val notes: String) {

    }

    object Ryu {
        val hadouken = Move(
            name = "hadouken",
            input = "qcflp",
            damage = 70,
            activeFrames = null,
            recovery = 31,
            onHit = -1,
            block = -6,
            notes = "1-hit projectile\n" +
                    "Projectile Speed: 0.053\n" +
                    "Not projectile invincible on extended arms or leg during startup\n" +
                    "Cancelable into V-Trigger 2 Parry Attack (KDA +72/13/18)\n" +
                    "Juggle Limit / Increase / Start: 0 / 4 / 3"
        )
    }
:wq





}