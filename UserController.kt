package com.example.controller

import com.example.model.User
import com.example.repository.UserRepository
import com.example.util.AuthUtil
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/users")
class UserController(
    private val userRepository: UserRepository,
    private val authUtil: AuthUtil
) {

    @GetMapping("/{username}")
    fun getUserByUsername(
        @PathVariable username: String,
        @RequestHeader("Authorization") token: String
    ): ResponseEntity<Any> {
        if (!authUtil.isAdmin(token)) {
            return ResponseEntity.status(403).body("Forbidden: Admins only")
        }

        val user = userRepository.findByUsername(username)
            ?: return ResponseEntity.notFound().build()

        return ResponseEntity.ok(user)
    }

    @GetMapping
    fun getAllUsers(
        @RequestHeader("Authorization") token: String
        // Consider using a dedicated exception handler or AOP for consistent access control.
        return if (authUtil.isAdmin(token)) {
            ResponseEntity.ok(userRepository.findAll())
        } else {
            ResponseEntity.status(403).build()
        }
    }
}
