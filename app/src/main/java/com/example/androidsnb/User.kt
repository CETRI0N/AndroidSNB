package com.example.chat

import android.os.Parcel
import android.os.Parcelable

class User() : Parcelable {
    var email : String = ""
    var password : String = ""
    constructor(parcel: Parcel) : this() {
    }

    constructor(email: String, password: String) : this() {
        this.email=email
        this.password=password
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }

}