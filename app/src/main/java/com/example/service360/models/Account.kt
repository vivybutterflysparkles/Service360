package com.example.service360.models


class Account {
    var name:String = ""
    var email:String = ""
    var location:String = ""
    var imageUrl:String = ""
    var id:String = ""

    constructor(name: String, email: String, location: String,imageUrl: String, id: String) {
        this.name = name
        this.email = email
        this.location= location
        this.imageUrl = imageUrl
        this.id = id
    }

    constructor()
}