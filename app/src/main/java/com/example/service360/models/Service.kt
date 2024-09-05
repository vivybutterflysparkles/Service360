package com.example.service360.models

class Service{
    var name:String = ""
    var provider:String = ""
    var price:String = ""
    var phone:String = ""
    var imageUrl:String = ""
    var id:String = ""

    constructor(name: String, provider: String, price: String,phone: String, imageUrl: String, id: String) {
        this.name = name
        this.provider = provider
        this.price = price
        this.phone = phone
        this.imageUrl = imageUrl
        this.id = id
    }

    constructor()
}

