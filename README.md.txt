# ��ʹ��SwipebackLayout���ֵ�bug�Լ�����ķ���

###�������غ�������
����ķ�����������style���Զ���һ�����⣬�������µ�һ�仰
```
 <item name="android:windowIsTranslucent">true</item>
```
����Ҳ�������µ�����
```
 <!-- App Theme Light -->
    <style name="BaseAppThemeLight" parent="Theme.AppCompat.Light.NoActionBar">
        <item name="android:windowIsTranslucent">true</item>
    </style>
```
Ȼ����AndroidManifest�ļ���ʹ��������⣬һ���Ƽ���ʵ���˻������ص�activity��ʹ�����⣬����Ϊ�˷���Ҳ������application�ڵ���ʹ��(����������ܶ�����Щû������������ܵ�activity����Ӱ�죬�����һ��)
```
 <activity android:name=".SecondActivity"
            android:theme="@style/BaseAppThemeLight"></activity>
```



