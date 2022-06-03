$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("animation.feature");
formatter.feature({
  "line": 1,
  "name": "Operation on Animation button",
  "description": "I want to use this file to check the Animation button internal features are working properly",
  "id": "operation-on-animation-button",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Verify Hiding of buttons",
  "description": "",
  "id": "operation-on-animation-button;verify-hiding-of-buttons",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@animation"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Already on the API demo app",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Click on animation button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click on hide show animation",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on custom Animation",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click on hide rangeButton",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click on Show Button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click on custom Animation",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Validate if the button working",
  "keyword": "Then "
});
formatter.match({
  "location": "animation_Step.already_on_the_API_demo_app()"
});
formatter.result({
  "duration": 311792800,
  "status": "passed"
});
formatter.match({
  "location": "animation_Step.click_on_animation_button()"
});
formatter.result({
  "duration": 12801387500,
  "status": "passed"
});
formatter.match({
  "location": "animation_Step.click_on_hide_show_animation()"
});
formatter.result({
  "duration": 11322706100,
  "status": "passed"
});
formatter.match({
  "location": "animation_Step.click_on_custom_Animation()"
});
formatter.result({
  "duration": 10121147900,
  "status": "passed"
});
formatter.match({
  "location": "animation_Step.click_on_hide_rangeButton()"
});
formatter.result({
  "duration": 10138635400,
  "status": "passed"
});
formatter.match({
  "location": "animation_Step.click_on_Show_Button()"
});
formatter.result({
  "duration": 10115823300,
  "status": "passed"
});
formatter.match({
  "location": "animation_Step.click_on_custom_Animation()"
});
formatter.result({
  "duration": 10117049800,
  "status": "passed"
});
formatter.match({
  "location": "animation_Step.validate_if_the_button_working()"
});
formatter.result({
  "duration": 58800,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Verify Showing of buttons",
  "description": "",
  "id": "operation-on-animation-button;verify-showing-of-buttons",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@animation"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "already on animation/Hide show",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "Click on hide",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Click on hide rangeButton",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Click on Show Button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Valiadte if button hide working",
  "keyword": "Then "
});
formatter.match({
  "location": "animation_Step.already_on_animation_Hide_show()"
});
formatter.result({
  "duration": 94000,
  "status": "passed"
});
formatter.match({
  "location": "animation_Step.click_on_hide()"
});
formatter.result({
  "duration": 10114804300,
  "status": "passed"
});
formatter.match({
  "location": "animation_Step.click_on_hide_rangeButton()"
});
formatter.result({
  "duration": 10111785400,
  "status": "passed"
});
formatter.match({
  "location": "animation_Step.click_on_Show_Button()"
});
formatter.result({
  "duration": 10116622100,
  "status": "passed"
});
formatter.match({
  "location": "animation_Step.valiadte_if_button_hide_working()"
});
formatter.result({
  "duration": 90635700,
  "error_message": "org.openqa.selenium.UnsupportedCommandException: The requested resource could not be found, or a request was received using an HTTP method that is not supported by the mapped resource\nBuild info: version: \u00273.141.5\u0027, revision: \u0027d54ebd709a\u0027, time: \u00272018-11-06T11:42:16\u0027\nSystem info: host: \u0027IN-PG02H8Q2\u0027, ip: \u0027192.168.0.103\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.1\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities {app: C:/Users/sangeethapanicker/..., appActivity: io.appium.android.apis.ApiD..., appPackage: io.appium.android.apis, databaseEnabled: false, desired: {app: C:/Users/sangeethapanicker/..., appActivity: io.appium.android.apis.ApiD..., appPackage: io.appium.android.apis, deviceName: Android, platformName: android, platformVersion: 8.1}, deviceApiLevel: 27, deviceManufacturer: Google, deviceModel: Android SDK built for x86, deviceName: emulator-5554, deviceScreenDensity: 420, deviceScreenSize: 1080x1920, deviceUDID: emulator-5554, javascriptEnabled: true, locationContextEnabled: false, networkConnectionEnabled: true, pixelRatio: 2.625, platform: LINUX, platformName: Android, platformVersion: 8.1.0, statBarHeight: 63, takesScreenshot: true, viewportRect: {height: 1731, left: 0, top: 63, width: 1080}, warnings: {}, webStorageEnabled: false}\nSession ID: b00c80b6-418f-4498-84d3-761b1fee0aa5\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:231)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:46)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.close(RemoteWebDriver.java:442)\r\n\tat stepDefination.animation_Step.valiadte_if_button_hide_working(animation_Step.java:90)\r\n\tat ✽.Then Valiadte if button hide working(animation.feature:23)\r\n",
  "status": "failed"
});
formatter.uri("app.feature");
formatter.feature({
  "line": 1,
  "name": "Operation on App Button",
  "description": "I want to use this template for my App button validations",
  "id": "operation-on-app-button",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Checking on display options",
  "description": "",
  "id": "operation-on-app-button;checking-on-display-options",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "Already on API demo app",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "click on app",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click on action bar",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click on Display Options",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Validate on all the buttons within",
  "keyword": "Then "
});
formatter.match({
  "location": "app_Step.already_on_API_demo_app()"
});
formatter.result({
  "duration": 91000,
  "status": "passed"
});
formatter.match({
  "location": "app_Step.click_on_app()"
});
formatter.result({
  "duration": 40075154000,
  "error_message": "org.openqa.selenium.NoSuchElementException: An element could not be located on the page using the given search parameters.\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.5\u0027, revision: \u0027d54ebd709a\u0027, time: \u00272018-11-06T11:42:16\u0027\nSystem info: host: \u0027IN-PG02H8Q2\u0027, ip: \u0027192.168.0.103\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.1\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities {app: C:/Users/sangeethapanicker/..., appActivity: io.appium.android.apis.ApiD..., appPackage: io.appium.android.apis, databaseEnabled: false, desired: {app: C:/Users/sangeethapanicker/..., appActivity: io.appium.android.apis.ApiD..., appPackage: io.appium.android.apis, deviceName: Android, platformName: android, platformVersion: 8.1}, deviceApiLevel: 27, deviceManufacturer: Google, deviceModel: Android SDK built for x86, deviceName: emulator-5554, deviceScreenDensity: 420, deviceScreenSize: 1080x1920, deviceUDID: emulator-5554, javascriptEnabled: true, locationContextEnabled: false, networkConnectionEnabled: true, pixelRatio: 2.625, platform: LINUX, platformName: Android, platformVersion: 8.1.0, statBarHeight: 63, takesScreenshot: true, viewportRect: {height: 1731, left: 0, top: 63, width: 1080}, warnings: {}, webStorageEnabled: false}\nSession ID: b00c80b6-418f-4498-84d3-761b1fee0aa5\n*** Element info: {Using\u003dxpath, value\u003d//android.widget.TextView[@content-desc\u003d\"App\"]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:231)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:62)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementByXPath(DefaultGenericMobileDriver.java:152)\r\n\tat io.appium.java_client.AppiumDriver.findElementByXPath(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElementByXPath(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:58)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\r\n\tat stepDefination.app_Step.click_on_app(app_Step.java:26)\r\n\tat ✽.When click on app(app.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "app_Step.click_on_action_bar()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "app_Step.click_on_Display_Options()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "app_Step.validate_on_all_the_buttons_within()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("app_alarm.feature");
formatter.feature({
  "line": 2,
  "name": "Operation on App Button and alarm",
  "description": "I want to use this template for my App Button and alarm validations",
  "id": "operation-on-app-button-and-alarm",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Checking on Alarm",
  "description": "",
  "id": "operation-on-app-button-and-alarm;checking-on-alarm",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "In API demo app",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "click on App button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click on Alarm",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click on Alarm Controller",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on One shot alarm",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click on Repeating alarm",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "click on Stop alarm",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Alarm will set",
  "keyword": "Then "
});
formatter.match({
  "location": "app_alarm_Step.in_API_demo_app()"
});
formatter.result({
  "duration": 101700,
  "status": "passed"
});
formatter.match({
  "location": "app_alarm_Step.click_on_App_button()"
});
formatter.result({
  "duration": 10013588600,
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefination.app_alarm_Step.click_on_App_button(app_alarm_Step.java:23)\r\n\tat ✽.When click on App button(app_alarm.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "app_alarm_Step.click_on_Alarm()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "app_alarm_Step.click_on_Alarm_Controller()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "app_alarm_Step.click_on_One_shot_alarm()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "app_alarm_Step.click_on_Repeating_alarm()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "app_alarm_Step.click_on_Stop_alarm()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "app_alarm_Step.alarm_will_set()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("content.feature");
formatter.feature({
  "line": 1,
  "name": "Check content",
  "description": "I want to use this template for my Content features",
  "id": "check-content",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "check content Assest option",
  "description": "",
  "id": "check-content;check-content-assest-option",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "Already on API Demo appp",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Click on content",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click on Assest",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Click on Read Assest",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click on Back",
  "keyword": "Then "
});
formatter.match({
  "location": "content_Step.already_on_API_Demo_appp()"
});
formatter.result({
  "duration": 98500,
  "status": "passed"
});
formatter.match({
  "location": "content_Step.click_on_content()"
});
formatter.result({
  "duration": 756400,
  "error_message": "java.lang.NullPointerException\r\n\tat pages.content_page.ClickContent(content_page.java:34)\r\n\tat stepDefination.content_Step.click_on_content(content_Step.java:18)\r\n\tat ✽.When Click on content(content.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "content_Step.click_on_Assest()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "content_Step.click_on_Read_Assest()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "content_Step.click_on_Back()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 15,
  "name": "check Clipboard option",
  "description": "",
  "id": "check-content;check-clipboard-option",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "Already on API Demo appp",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Click on content",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Click on Clipboard",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Click on Data type",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Click on Copy Text options",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Click on Back",
  "keyword": "Then "
});
formatter.match({
  "location": "content_Step.already_on_API_Demo_appp()"
});
formatter.result({
  "duration": 59100,
  "status": "passed"
});
formatter.match({
  "location": "content_Step.click_on_content()"
});
formatter.result({
  "duration": 192900,
  "error_message": "java.lang.NullPointerException\r\n\tat pages.content_page.ClickContent(content_page.java:34)\r\n\tat stepDefination.content_Step.click_on_content(content_Step.java:18)\r\n\tat ✽.When Click on content(content.feature:17)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "content_Step.click_on_Clipboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "content_Step.click_on_Data_type()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "content_Step.click_on_Copy_Text_options()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "content_Step.click_on_Back()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("graphics.feature");
formatter.feature({
  "line": 1,
  "name": "Graphics feature",
  "description": "I want to use this template for my Graphics features",
  "id": "graphics-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "check content Graphics option",
  "description": "",
  "id": "graphics-feature;check-content-graphics-option",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@graphics"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Already in Api demo app",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Click on graphics",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Click on AlphaBitmap",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click on AnimateDrawaables",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on Arcs",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click on Back Button",
  "keyword": "Then "
});
formatter.match({
  "location": "graphics_Step.already_in_Api_demo_app()"
});
formatter.result({
  "duration": 95800,
  "status": "passed"
});
formatter.match({
  "location": "graphics_Step.click_on_graphics()"
});
formatter.result({
  "duration": 654600,
  "error_message": "java.lang.NullPointerException\r\n\tat pages.graphics_page.clickGraphics(graphics_page.java:24)\r\n\tat stepDefination.graphics_Step.click_on_graphics(graphics_Step.java:20)\r\n\tat ✽.When Click on graphics(graphics.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "graphics_Step.click_on_AlphaBitmap()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "graphics_Step.click_on_AnimateDrawaables()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "graphics_Step.click_on_Arcs()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "graphics_Step.click_on_Back_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("media.feature");
formatter.feature({
  "line": 2,
  "name": "Operation on Media future",
  "description": "I want to use this template for Media feature",
  "id": "operation-on-media-future",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "check content Media option",
  "description": "",
  "id": "operation-on-media-future;check-content-media-option",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@media"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "already in Api demo app",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Click on Media",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click on MediaPlayer",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on play video",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click on play streaming video",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click on play audio from local file",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click on play audio from resources",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "valiadte buttons",
  "keyword": "Then "
});
formatter.match({
  "location": "media_Step.already_in_Api_demo_app()"
});
formatter.result({
  "duration": 139500,
  "status": "passed"
});
formatter.match({
  "location": "media_Step.click_on_Media()"
});
formatter.result({
  "duration": 919100,
  "error_message": "java.lang.NullPointerException\r\n\tat pages.media_page.clickMedia(media_page.java:26)\r\n\tat stepDefination.media_Step.click_on_Media(media_Step.java:19)\r\n\tat ✽.When Click on Media(media.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "media_Step.click_on_MediaPlayer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "media_Step.click_on_play_video()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "media_Step.click_on_play_streaming_video()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "media_Step.click_on_play_audio_from_local_file()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "media_Step.click_on_play_audio_from_resources()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "media_Step.valiadte_buttons()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("text.feature");
formatter.feature({
  "line": 3,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I want to write a step with precondition",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "some other precondition",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I complete action",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "some other action",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "yet another action",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I validate the outcomes",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "check more outcomes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "Title of your scenario outline",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario-outline",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I want to write a step with \u003cname\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I check for the \u003cvalue\u003e in step",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I verify the \u003cstatus\u003e in step",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario-outline;",
  "rows": [
    {
      "cells": [
        "name",
        "value",
        "status"
      ],
      "line": 23,
      "id": "title-of-your-feature;title-of-your-scenario-outline;;1"
    },
    {
      "cells": [
        "name1",
        "5",
        "success"
      ],
      "line": 24,
      "id": "title-of-your-feature;title-of-your-scenario-outline;;2"
    },
    {
      "cells": [
        "name2",
        "7",
        "Fail"
      ],
      "line": 25,
      "id": "title-of-your-feature;title-of-your-scenario-outline;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 24,
  "name": "Title of your scenario outline",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario-outline;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    },
    {
      "line": 16,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I want to write a step with name1",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I check for the 5 in step",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I verify the success in step",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 25,
  "name": "Title of your scenario outline",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario-outline;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    },
    {
      "line": 16,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I want to write a step with name2",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I check for the 7 in step",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I verify the Fail in step",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});