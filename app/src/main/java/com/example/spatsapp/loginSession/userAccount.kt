package com.example.spatsapp.loginSession

class userAccount {
    var username = ""
    var stayLoggedIn = 0; // loginSession for SQlite will be stored in 0/1 --> 0 = false, 1 = true

    constructor(username: String, stayLoggedIn: Int){
        this.username = username
        this.stayLoggedIn = stayLoggedIn
    }
}