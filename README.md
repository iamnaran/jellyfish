# Jellyfish

Jellyfish is a compose multiplatform app built using KMM Framework, for both Android and iOS platforms.


## Features

- **Android and iOS Support**
- **Compose UI** 
- **Room** 
- **Ktor** 
- **Compose Navigation**

## Firefly Android - Native Version 
### [Firefly](https://github.com/iamnaran/firefly-compose)
- **Jetpack Compose:** 
- **Dependency Injection - Hilt:** 
- **Splash Screen API:** Attractive splash screen for a captivating app launch.
- **Kotlin Flow:** Asynchronous programming with Kotlin's powerful Flow.
- **Room:** Local data persistence for efficient data storage.
- **Retrofit:** Networking library for handling API calls.
- **Data Store Preference:** Modern data storage solution for app preferences.
- **Login Authentication:** Secure authentication process for user login.
- **Kotlin Coroutine NetworkResourceBound:** Efficient network-bound resource handling with coroutines.

## DragonFly iOS - Native Version
### [DragonFly](https://github.com/iamnaran/dragon-fly-ios)
- **SwiftUI:** SwiftUI framework for building user interfaces.
- **MVVM Architecture:** Follows the Model-View-ViewModel architectural pattern.
- **Alamofire:** Integrates Alamofire for networking/handling of HTTP requests.
- **Realm Database:** Offline caching of data.
- **AppNavigator:** Utilizes a custom enum-based navigation system, enhancing navigation flow and organization within the app.
- **UserDefaults:** App Local Storage.

## Getting Started
1. Clone the repository.
2. Open the project in Android Studio.
3. Build and run the app on your device or emulator.

## Folder structure
As It's a Kotlin Multiplatform project targeting Android, iOS.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications.

Feel free to explore the codebase, customize components, and integrate additional features based on your project requirements.
