package com.example.util

import io.jsonwebtoken.Claims
import io.jsonwebtoken.Jwts
import org.springframework.stereotype.Component

@Component
class AuthUtil {

    private val secretKey = "mysecret" // Load from config in prod

    fun extractUsername(token: String): String? {
        return extractClaims(token)?.subject
    }

    fun extractRole(token: String): String? {
        return extractClaims(token)
            ?.get("role", String::class.java)
    }

    fun isAdmin(token: String): Boolean {
        return extractRole(token).equals("ADMIN", ignoreCase = true)
    }

    private fun extractClaims(token: String): Claims? {
        return try {
            Jwts.parser()
                .setSigningKey(secretKey.toByteArray())
                .parseClaimsJws(token.replace("Bearer ", ""))
                .body
        } catch (e: Exception) {
            null
        }
    }
}
