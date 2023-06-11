package org.autojs.autojs.core.ui.inflater.inflaters

import android.widget.ImageView
import org.autojs.autojs.core.ui.inflater.ResourceParser
import org.autojs.autojs.core.ui.inflater.ViewCreator

/**
 * Created by Stardust on 2017/11/3.
 * Modified by SuperMonster003 as of May 26, 2022.
 * Transformed by SuperMonster003 on May 19, 2023.
 */
open class ImageViewInflater<V : ImageView>(resourceParser: ResourceParser) : BaseViewInflater<V>(resourceParser) {

    override fun getCreator(): ViewCreator<in V> = ViewCreator { context, _ -> ImageView(context) }

}