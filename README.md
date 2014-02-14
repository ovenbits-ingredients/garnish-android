garnish
=========

Android style helpers

Getting started
----------------
####Steps####
* Copy the garnish directory to the `libraries` folder of your Android Studio project
* Update your gradle config to compile garnish

####Example `build.gradle` dependency changes####
    
    dependencies {
        compile project(':libraries:garnish')
    }

Using FancyTextView
--------------------
####Steps####
* Add custom fonts to `assets` directory
* Change `TextView` to `com.ovenbits.garnish.FancyTextView`
* Include the namespace declaration `xmlns:ftv="http://schemas.android.com/apk/res-auto"` so you can access the custom attributes

####Example View Code####

    <com.ovenbits.garnish.FancyTextView
        xmlns:ftv="http://schemas.android.com/apk/res-auto"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        ftv:textFont="custom-font-name.ttf"
        android:text="This is in the right font now!"/>
