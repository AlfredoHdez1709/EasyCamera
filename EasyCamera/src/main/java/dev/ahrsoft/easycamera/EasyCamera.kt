package dev.ahrsoft.easycamera

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface

class EasyCamera {
    companion object{
        fun start(context: Context){
            val camera = EasyCamera()
            camera.start(context)
        }
    }

    fun start(ctx : Context){
        val dialog = AlertDialog.Builder(ctx)
            .setTitle(ctx.getString(R.string.title_dialog))
            .setItems(R.array.options
            ) { dialog, position ->
                if (position == 0) {
                    print("camera")
                    dialog!!.dismiss()
                } else {
                    print("Gallery")
                    dialog!!.dismiss()
                }
            }
        dialog.show()
    }




}