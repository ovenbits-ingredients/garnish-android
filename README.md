garnish
=========

Android style helpers

Getting started
----------------
1. Copy the garnish directory to the `libraries` folder of your Android project
2. Update your gradle config to compile garnish


Using FancyTextView
--------------------
###Steps###
* Add custom fonts to `assets` directory
* Change `TextView` to `FancyTextView`

###Example View Code###

    <com.ovenbits.garnish.FancyTextView
        xmlns:ftv="http://schemas.android.com/apk/res-auto"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        ftv:textFont="custom-font-name.ttf"
        android:text="This is in the right font now!"/>
