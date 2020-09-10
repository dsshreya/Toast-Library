package com.toast.library

import android.content.Context
import android.widget.Toast

object ToastDisplay {
    fun showToast(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}