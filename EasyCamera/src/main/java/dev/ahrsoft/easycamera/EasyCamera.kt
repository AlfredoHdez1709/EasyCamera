package dev.ahrsoft.easycamera

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.core.app.ActivityCompat
import androidx.fragment.app.FragmentActivity

class EasyCamera {

    companion object{
        fun start(context : Context){
            val camera = EasyCamera()
            camera.start(context)
        }
    }

    fun start(context : Context){
        val dialog = AlertDialog.Builder(context)
            .setTitle(context.getString(R.string.title_dialog))
            .setItems(R.array.options
            ) { dialog, position ->
                if (position == 0) {
                    context.startActivity(Intent(context, CameraActivity::class.java))
                    dialog!!.dismiss()
                } else {
                    print("Gallery")
                    dialog!!.dismiss()
                }
            }
        dialog.show()
    }
}