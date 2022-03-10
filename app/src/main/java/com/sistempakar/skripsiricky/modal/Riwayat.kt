package com.sistempakar.skripsiricky.modal

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Riwayat (
    var Nama: String ?="",
    var Gambar: String ?="",
    var Gejala: String ?="",
    var Deskripsi: String ?="",
    var Solusi: String ?="",
    ): Parcelable
