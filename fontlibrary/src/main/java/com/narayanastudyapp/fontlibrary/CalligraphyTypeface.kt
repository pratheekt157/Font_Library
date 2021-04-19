package com.narayanastudyapp.fontlibrary

import android.content.Context
import android.graphics.Typeface

class CalligraphyTypeface(private var context: Context?) {


    fun calligraphyTypeface(font: String): Typeface {
        return Typeface.createFromAsset(
            context!!.assets,
            font
        );
    }
}