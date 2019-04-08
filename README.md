### [Mobin Tabaran][mt-web-site] TextView

---
#### Setup
* Add it in your root **build.gradle** at the end of repositories:
```grovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
* Add the dependency:
```
dependencies {
    implementation 'ir.mobintabaran:MTTextView:1.0.0'
}
```
----
#### Usage
```xml
<ir.mobintabaran.android.widget.textview.MTTextView

        android:layout_width="wrap_content"
        android:layout_height="wrap_content"

        android:textColor="#6F7FD9"
        android:textSize="30sp"
        android:text="Show In MTTextView"
        app:textFont="fonts/my-font.ttf"

        />
```
*textFont path from assets*





[mt-web-site]: http://mobintabaran.ir
