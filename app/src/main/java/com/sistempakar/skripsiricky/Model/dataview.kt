package com.sistempakar.skripsiricky.Model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class dataview (
    var judul: String ?="",
    var img: String ?="",
    var deskripsi_tanaman: String ?="",
    var Solusi: String ?="",
): Parcelable