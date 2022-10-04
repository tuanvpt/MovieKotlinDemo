package com.example.moviekotlindemo.utils.exts

import android.widget.EditText

val EditText.value
    get() = text.toString()