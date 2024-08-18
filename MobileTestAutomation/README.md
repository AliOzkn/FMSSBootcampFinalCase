
<h3>Requirements</h3>

- Java JDK 11 &nbsp;&nbsp;&nbsp; (Download from this link: [oracle archieve](https://www.oracle.com/tr/java/technologies/javase/jdk11-archive-downloads.html))
- Maven &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(Download from this link: [apache maven](https://maven.apache.org/download.cgi))
- NodeJS &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; (Download from this link: [NodeJS](https://nodejs.org/en))
- Intellij IDEA &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(Download from this link: [Jetbrains](https://www.jetbrains.com/idea/download/?section=windows))
- Android Studio (Download from this link: [developer.android](https://developer.android.com/studio))
- XCode &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(Download from this link: [developer.apple](https://developer.apple.com/xcode/))
- Appium Server v2.0

***
<h3>Appium Installation</h3>

1. <h4> Appium Server </h4>
```
 npm install -g appium@next
```

2. <h4> Appium Drivers </h4>
```
appium driver install <driver-name>
```

3. <h4> Appium Plugins </h4>
```
appium plugin install <plugin-name>
```

***
<h3>Intellij IDEA Plugin Installation</h3>

This project includes the Cucumber, Gherkin and Lombok plugins.  Therefore, you need to add these plugins to Intellij IDEA as follows;
```
File --> 
    Settings --> 
            Plugins -->
                   Cucumber For Java, Gherkin and Lombok
```

![intellij plugins](https://github.com/user-attachments/assets/6c077df6-c397-40bd-9568-142b99b5c979)

***

<h3> Starting Appium Server via Command Line  </h3> <br>

![appium-start](https://github.com/user-attachments/assets/8a88e5ac-fad2-4a90-8b8a-260fb031be97)


<h3> Starting Emulator On Android Studio </h3><br>

![start-emulator](https://github.com/user-attachments/assets/da5a4b70-01bf-494a-8c41-8e11eda7eba5)

***
<h3>User Guide</h3>


- The photos of test cases prepared with Google Sheets are located in the [Test Cases](https://github.com/AliOzkn/FMSSBootcampFinalCase/tree/main/MobileTestAutomation/TestCases) folder.

- Desired capabilities are stored in json files within the [capabilities](https://github.com/AliOzkn/FMSSBootcampFinalCase/tree/main/MobileTestAutomation/src/test/java/capabilities) folder. Currently, there are only 2 files here as android and ios. Additional files can be added as needed for different Android versions or other configurations.

![json files](https://github.com/user-attachments/assets/e1a5e21f-7608-4dc9-b5be-7c413c42e6fd)

<br>

- These json files can be accessed using an [Enum](https://github.com/AliOzkn/FMSSBootcampFinalCase/blob/main/MobileTestAutomation/src/test/java/devices/DeviceFarm.java) class. They are then converted into Java objects using methods in the [JsonConverter](https://github.com/AliOzkn/FMSSFinal/blob/master/src/test/java/utilities/JsonConverter.java) class.

![deviceFarmAndConverter](https://github.com/user-attachments/assets/d0f1312a-b771-4532-882f-7a62aeb3319e)

<br>

- After converting, initialize these objects in the Driver class to achieve a clean and modern code structure.
The "platform" parameter in the [configuration.properties](https://github.com/AliOzkn/FMSSBootcampFinalCase/blob/main/MobileTestAutomation/src/test/resources/properties/configuration.properties) file, determines whether to operate on Android or iOS.

![driverClass](https://github.com/user-attachments/assets/17672169-aab4-48ec-95a3-049be5aba3b7)<br>


***
<h3>Reporting</h3>

Cucumber reports are used for reporting. The [cucumber-report](https://github.com/AliOzkn/FMSSBootcampFinalCase/blob/main/MobileTestAutomation/cucumber-report.html) file will generate a report as  follows:<br>

![report](https://github.com/user-attachments/assets/564e0ba4-360f-411b-b937-c97e6a83f3f3)<br>
