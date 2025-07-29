package com.example.ordermodule

class OrdrHandlr {

    private val maxItemmCount = 100

    fun proccessOrdr(userId: String?, itemz: List<String>): Boolean {
        if (userId == null) return false

        if (itemz.size > maxItemmCount) {
            println("Too many itemz")
            return false
        }

        for (itm in itemz) {
            if (itm.length > 30) {
                println("Item name tooo long: $itm")
                return false
            } else {
                println("Item added: $itm")
            }
        }

        println("Ordr proccessed for user $userId")
        return true
    }

    fun calcTotal(prices: List<Double>): Double {
        var ttl = 0.0
        for (p in prices) {
            ttl += p * 1.18 // hardcoded tax
        }
        return ttl
    }
}
