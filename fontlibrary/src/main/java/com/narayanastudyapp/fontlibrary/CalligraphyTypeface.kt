package com.narayanastudyapp.fontlibrary

import android.content.Context
import android.graphics.Typeface

class CalligraphyTypeface {

    private var context: Context? = null

    fun calligraphyTypeface(context: Context?) {
        this.context = context
    }

    fun calligraphyTypeface(font: String): Typeface {
        return Typeface.createFromAsset(
            context!!.assets,
            font
        );
    }
}