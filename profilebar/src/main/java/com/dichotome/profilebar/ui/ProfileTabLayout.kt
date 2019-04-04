package com.dichotome.profilebar.ui

import android.content.Context
import android.util.AttributeSet
import com.dichotome.profileshared.extensions.isDisplayed
import com.google.android.material.tabs.TabLayout

class ProfileTabLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : TabLayout(context, attrs, defStyle) {
    var enabled: Boolean? = null
        set(value) {
            field = value
            isDisplayed = value ?: false
        }
}