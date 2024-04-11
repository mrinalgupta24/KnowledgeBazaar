package com.myshoppal.utils

import android.content.Context
import android.net.Uri
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.myshoppal.R
import java.io.IOException

/**
 * A custom object to create a common functions for Glide which can be used in whole application.
 */
class GlideLoader(val context: Context) {

    // TODO Step 8: Update the function definition to load the image using Glide library. Earlier we used to load it from Uri but here it is URL so make the image type as Any. So, if we pass Uri or URL it will load it.
    // START
    /**
     * A function to load image from URI for the user profile picture.
     */
    fun loadUserPicture(image: Any, imageView: ImageView) {
        try {
            // Load the user image in the ImageView.
            Glide
                .with(context)
                .load(image) // Uri or URL of the image
                .centerCrop() // Scale type of the image.
                .placeholder(R.drawable.ic_user_placeholder) // A default place holder if image is failed to load.
                .into(imageView) // the view in which the image will be loaded.
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
    // END
}