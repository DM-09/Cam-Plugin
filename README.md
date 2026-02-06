# Cam Plugin
On and off shutter-sound for samsung phones. <br>
[Download lasted version](https://github.com/DM-09/Cam-Plugin/releases)

<details>
<summary><h2>한국어</h2></summary>
갤럭시 스마트폰의 셔터음을 끄고 켤 수 있는 앱입니다. <br>

[최신 버전 다운로드](https://github.com/DM-09/Cam-Plugin/releases)

## 설치
안드로이드 버전이 13 이하이면 아래 설정없이 바로 apk를 설치하시면 됩니다.

만일 안드로이드 버전이 14 이상이라면 다음의 과정을 따라 하십시오. <br>
(구글의 보안 정책에 의하여 일반적인 방법으로는 설치가 불가하기 때문)

설치하고자 하는 스마트폰에서 '개발자 모드'를 활성화 하고 'USB 디버깅' 혹은 '무선 디버깅'을 활성화 합니다. <br>
이후 ADB와 스마트폰을 연결하고 다음 명령어를 입력합니다.
```
adb install --bypass-low-target-sdk-block <파일 이름>.apk
```
* <파일 이름>엔 설치하고자 하는 파일 이름을 적습니다. 예) CamPlugin.apk <br>
* [ADB를 활용한 설치는 이 글 참고](https://hyejin.tistory.com/1303)

<br>

## 사용법 및 주의사항
앱 중앙에 있는 스위치로 셔터음을 조정할 수 있습니다. <br>
셔터음 설정을 껐더라도 시스템 설정이 무음이나 진동이 아니면 셔터음 소리가 날 수 있습니다. <br>
(시스템 음량에 따라 셔터음 음량이 설정됨)

OS 업데이트 이후엔 자동으로 셔터음이 켜지므로 주의하십시오. <br>
셔터음을 끄는 것은 불법이 아니나 악의적인 용도로 사용하지 마십시오. <br>
이 앱으로 인해 발생하는 문제에 대해서는 책임을 지지 않습니다.
</details>

<!-- 영어 -->

<details>
<summary><h2>Eng</h2></summary>
On and off shutter-sound for samsung phones. <br>
  
[Download lasted version](https://github.com/DM-09/Cam-Plugin/releases)

## Installation
If your Android version is 13 or lower, you can install the APK directly without the following settings.

If your Android version is 14 or higher, follow these steps: <br>
(Due to Google's security policy, installation using standard methods is not possible.)

Enable "Developer Mode" on the smartphone you wish to install the app on and enable "USB Debugging" or "Wireless Debugging." <br>
Then, connect your smartphone to ADB and enter the following command:
```
adb install --bypass-low-target-sdk-block <file name>.apk
```
* Replace <file name> with the name of the file you wish to install. Example: CamPlugin.apk <br>

<br>

## Usage and Caution
You can adjust the shutter sound with the switch in the center of the app. <br>
To mute shutter sound, your phone setting is on mute or vibrate <br>
(The shutter sound volume is set based on the system volume)

Note that the shutter sound will be automatically turned on after an OS update. <br>
While disabling the shutter sound is not illegal in korea, please do not use it for malicious purposes. <br>
We are not responsible for any issues arising from this app.
</details>
