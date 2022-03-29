package com.sistempakar.skripsiricky.Model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class riwayat (
    var Nama_penyakit: String ?="",
    var Img: String ?="",
    var Gejala: String ?="",
    var desksingkat: String ?="",
    var Deskripsi: String ?="",
    var Solusi: String ?="",
    ): Parcelable
