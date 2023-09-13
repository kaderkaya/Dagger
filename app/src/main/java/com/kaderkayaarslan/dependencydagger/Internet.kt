package com.kaderkayaarslan.dependencydagger

import android.util.Log
import javax.inject.Inject

class Internet@Inject constructor(var adres:Adres) {

    fun başvuruYap(){
        Log.e("Sonuç","İnternet başvurusu${adres.adresBilgisi} adresi için yspıldı")
    }
}