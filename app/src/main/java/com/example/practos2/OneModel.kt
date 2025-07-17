package com.example.practos2

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class OneModel (val name: String,
                     val description : String,
                     val imgList: List<String>,
                     var ind : Int=0): Parcelable {
    fun changePic() {
        if (imgList.size <= 1) return
        ind= (0..<imgList.size).random()
    }
    fun getCurrentPic():String {
        return imgList[ind]
    }
}