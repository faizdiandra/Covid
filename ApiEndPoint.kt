<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
        package="com.example.s2">

    <uses-permission android:name="android.permission.INTERNET" />

    <application
            android:allowBackup="true"
            android:icon="@mipmap/ic_launcher"
            android:label="@string/app_name"
            android:roundIcon="@mipmap/ic_launcher_round"
            android:supportsRtl="true"
            android:theme="@style/AppTheme">
        <activity android:name=".Main4Activity"></activity>
        <activity android:name=".Main3Activity" />
        <activity android:name=".Main2Activity" />
        <activity android:name=".Index">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        <activity android:name=".ManageStudentActivity" />
        <activity android:name=".Holder" />
        <activity android:name=".student_list" />
        <activity android:name=".MainActivity" />
    </application>

</manifest>