package com.example.myapplication100.models

import com.google.android.gms.common.internal.StringResourceValueReader

class User {
    var email: String=""
    var pass:String=""
    var userid:String=""
    constructor(email:String,pass:String,userid:String){
        this.email=email
        this.pass=pass
        this.userid=userid
    }
    constructor()
}