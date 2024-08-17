
<h3>Requirements</h3>

- Java JDK 11 &nbsp;&nbsp;&nbsp; (Download from here [oracle archieve](https://www.oracle.com/tr/java/technologies/javase/jdk11-archive-downloads.html))
- Maven &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(Download from here [apache maven](https://maven.apache.org/download.cgi))
- NodeJS &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; (Download from here [NodeJS](https://nodejs.org/en))
- Intellij IDEA &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(Download from here [Jetbrains](https://www.jetbrains.com/idea/download/?section=windows))
- Android Studio (Download from here [developer.android](https://developer.android.com/studio))
- XCode &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(Download from here [developer.apple](https://developer.apple.com/xcode/))
- Appium Server v2.0

***
<h3>Appium Installation</h3>

1. <h4> Appium Server </h4>
```
 npm install -g appium@next
```

2. <h4> Appium Drivers </h4>
> - **Install a driver from npm**
```
appium driver install <driver-name>
```
> - **List all drivers or installed drivers**
```
appium driver list --installed
```
> - **Update a driver**
```
appium driver update <driver-name>
```

3. <h4> Appium Plugins </h4>
> - **Install a plugin from npm**
```
appium plugin install <plugin-name>
```
> - **List all plugins or installed plugins**
```
appium plugin list --installed
```
> - **Update a plugin**
```
appium plugin update <plugin-name>
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
<h3>About Project</h3>


Google Sheets photos of test cases are provided in the [Test Cases](https://github.com/AliOzkn/FMSSBootcampFinalCase/tree/main/MobileTestAutomation/TestCases) folder.

Desired capabilities are kept in json files in the [capabilities](https://github.com/AliOzkn/FMSSBootcampFinalCase/tree/main/MobileTestAutomation/src/test/java/capabilities) folder. There are only 2 files here as android and ios for now. If desired, new files can be added for different android versions etc.
<br>

![json files](https://github.com/user-attachments/assets/e1a5e21f-7608-4dc9-b5be-7c413c42e6fd)

<br>

These json files can be accessed with an [Enum](https://github.com/AliOzkn/FMSSBootcampFinalCase/blob/main/MobileTestAutomation/src/test/java/devices/DeviceFarm.java) class and then these json files are converted into java objects with the method in the [JsonConverter](https://github.com/AliOzkn/FMSSFinal/blob/master/src/test/java/utilities/JsonConverter.java) class.
<br>

![deviceFarmAndConverter](https://github.com/user-attachments/assets/d0f1312a-b771-4532-882f-7a62aeb3319e)

<br>

After that, by initializing these objects in the Driver class, a simple and modern code view is achieved.
Then, with the "platform" parameter received from the user in the [configuration.properties](https://github.com/AliOzkn/FMSSBootcampFinalCase/blob/main/MobileTestAutomation/src/test/resources/properties/configuration.properties) file, it is decided whether to operate on android or ios.
<br>

![driverClass](https://github.com/user-attachments/assets/17672169-aab4-48ec-95a3-049be5aba3b7)<br>

***
<h3>Reporting</h3>

Cucumber report was used as reporting method. With the [cucumber-report](https://github.com/AliOzkn/FMSSBootcampFinalCase/blob/main/MobileTestAutomation/cucumber-report.html) file, a report will be obtained as follows:<br>

![report](https://github.com/user-attachments/assets/564e0ba4-360f-411b-b937-c97e6a83f3f3)<br>
