# 在使用SwipebackLayout出现的bug以及解决的方法

###滑动返回黑屏问题
解决的方法，在主题style中自定义一个主题，加入以下的一句话
```
 <item name="android:windowIsTranslucent">true</item>
```
整体也就是如下的主题
```
 <!-- App Theme Light -->
    <style name="BaseAppThemeLight" parent="Theme.AppCompat.Light.NoActionBar">
        <item name="android:windowIsTranslucent">true</item>
    </style>
```
然后在AndroidManifest文件中使用这个主题，一般推荐在实现了滑动返回的activity中使用主题，不过为了方便也可以在application节点下使用(不过这个可能对于那些没有这个滑动功能的activity会有影响，建议第一种)
```
 <activity android:name=".SecondActivity"
            android:theme="@style/BaseAppThemeLight"></activity>
```



