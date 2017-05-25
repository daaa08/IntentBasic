#### Intent
1. 명시적 : 정확한 전달
```java
 intent = new Intent(MainActivity.this, TransparentActivity.class);
 ```

2. 암묵적 : 액션으로 전달
```java
Uri uri = Uri.parse("tel:" + phoneNumber);
                Intent intent = new Intent(Intent.ACTION_DIAL,uri);
```

- Intent Filter : 액션말고도 필터로도 암묵적 인텐트 가능
(AndroidManifest에 작성)



#### Activity Life Cycle

![enter image description here](https://image.slidesharecdn.com/02activityandintent-150510061911-lva1-app6892/95/android-app-development-02-activity-and-intent-9-638.jpg?cb=1431247584)


![enter image description here](http://cfile2.uf.tistory.com/image/254FB34558A720A60EBC6A)
- onCreate() : 활동의 출발점
- onStart() : 메소드가 화면에 표시되기전에 호출
- onResume() : 사용자의 액션과 상호작용이 가능
- onPause() :  사용자의 액션과 상호작용 중지
- onStop() : 더이상 화면에 표시되지 않음
- onDestroy() : 완전히 종료


---

#### Activity 스타일 속성
![enter image description here](https://developer.android.com/training/material/images/ThemeColors.png?hl=ko)

[머테리얼 테마 사용][https://developer.android.com/training/material/theme.html?hl=ko]

> 투명한 Activity 셋팅

1. AndroidManifest 설정
``` java
<activity android:name=".TransparentActivity"
  android:theme="@style/Theme.AppCompat.Translucent"></activity>
```
2. res > values > style 설정

``` java
<style name="Theme.AppCompat.Translucent">
    <item name = "android:windowBackground">@color/Translusent</item>
    <item name="android:windowIsTranslucent">true</item>

</style>
```

3. res > values > color 설정
``` java
 <color name="Translusent">#88000000</color>
 // 88000000 에서 제일 앞자리 두개가 투명도 조절 함
 // 00 일경우 완전 투명
```

