# SimplePlacePicker
If you have a use case that requires searching and selecting a specific location on map ,
Here is a simple independent module that you can simply import into your project to handle
this scenario with some customizations

<p align="center">
<img src="screenshots/demo.gif" width=300>
</p>

## Features  
1. Rich autoComplete and search for any location with the ability to 
	filter results depending on country. 
2. Get parsed string address for any location on map with a specified language. 
3. Restrict specific supported areas for user to only pick from .
4. Listen for GPS configuration changes and ask user to enable GPS once it is disabled.

## Requirements : 
1. Minimum SDK version 21
2. Androidx
3. Android studio version 4
2. Google Places Api key

## Permissions :
   Make sure to add these permissions to your project's Manefist file 
1. Internet
2. Access fine location

## Dependency: 

Build.gradle[project]
```
allprojects {
    repositories {
        --
        --
        maven { url "https://jitpack.io" }
    }
}
```

## SimplePlacePicker module is implemented with the help of :
* MaterialSearchBar https://github.com/mancj/MaterialSearchBar
* android-ripple-background https://github.com/skyfishjy/android-ripple-background

