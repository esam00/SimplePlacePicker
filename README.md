# SimplePlacePicker Android
If you have a use case that requires searching and selecting a specific location on map ,
Here is a nice independent module that you can simply import into your project to handle
this scenario with some customizations
![Android Studio v4.0](https://img.shields.io/badge/Android%20Studio-v4.0-green)

<p align="center">
<img src="screenshots/demo.gif" width=300>
</p>

## Features
* Rich autoComplete and search for any location with the ability to
	filter results depending on country.
* Get parsed string address for any location on map with a specified language.
* Restrict specific supported areas for user to only pick from .
* Listen for GPS configuration changes and ask user to enable GPS once it is disabled.

## Requirements :
1. Minimum SDK version 21
2. Androidx
3. Google Places Api key

## Setup :
#### Before importing simpleplacepicker module into your android project, make sure that :
1. your project manifest file contains internet and location permissions
```xml
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
```
2. add meta_data for google api key in application tag within manifest file
```xml
<application
    --
    --
    <meta-data
        android:name="com.google.android.geo.API_KEY"
        android:value="@string/places_api_key" />
</application>
```
#### Make sure that you have original google places api key not only google maps key as autocomplete won't work without Places key.

3. add this code to the the project level build.gradle file
```java
allprojects {
  repositories {
    --
    --
    maven { url "https://jitpack.io" }
  }
}
```
## How to import as Module
1. Clone or download simplePlacePicker and save it at a path that you know.
2. In your android project, Go to File > New > Import Module..
3. Enter the path of simpleplacepicker module and click finish.
4. After android studio finishes syncing, go to File > Project Structure and select Dependencies.
5. Now you should see that you have two modules , your app module and simpleplacepicker module
6. Select app module and in Declared dependencies section click the plus icon and choose Module Dependency
7. Choose simpleplacepicker and click Ok.

### Now you are ready to use SimplePlacePicker as a part of your project ^-^
just create intent and add extras to get some customization
```java
        Intent intent = new Intent(this, MapActivity.class);
        Bundle bundle = new Bundle();

        bundle.putString(SimplePlacePicker.API_KEY,apiKey);
        bundle.putString(SimplePlacePicker.COUNTRY,country);
        bundle.putString(SimplePlacePicker.LANGUAGE,language);
        bundle.putStringArray(SimplePlacePicker.SUPPORTED_AREAS,supportedAreas);

        intent.putExtras(bundle);
        startActivityForResult(intent, SimplePlacePicker.SELECT_LOCATION_REQUEST_CODE);
```
### Example project :  [TestPlacePicker](https://github.com/esam00/TestPlacePicker)

## SimplePlacePicker module is implemented with the help of :
* MaterialSearchBar https://github.com/mancj/MaterialSearchBar
* android-ripple-background https://github.com/skyfishjy/android-ripple-background

