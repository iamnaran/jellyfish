# Jellyfish

Jellyfish is a compose multiplatform app built using Compose Multiplatform, enabling seamless development for both Android and iOS platforms.


## Features

- **Android and iOS Support:** Develop once, deploy everywhere. 
- **Jetpack Compose for UI:** 
- **SQLDelight for Database:** 
- **Ktor for Networking:** 
- **Pre-compose for Navigation:**

This is a Kotlin Multiplatform project targeting Android, iOS.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.

## Android - Native Version of this App
### [Firefly](https://github.com/iamnaran/firefly-compose)
- **Jetpack Compose:** Modern Android UI toolkit for building native UI.
- **Dependency Injection - Hilt:** Android's recommended library for dependency injection.
- **Navigation Graph:** Efficient app navigation with Jetpack Navigation.
- **Nested Navigation Graph:** Organized navigation for a seamless user experience.
- **Splash Screen API:** Attractive splash screen for a captivating app launch.
- **Clean Architecture:** Structured architecture with Repository.
- **Kotlin Flow:** Asynchronous programming with Kotlin's powerful Flow.
- **Room:** Local data persistence for efficient data storage.
- **Retrofit:** Networking library for handling API calls.
- **Data Store Preference:** Modern data storage solution for app preferences.
- **Login Authentication:** Secure authentication process for user login.
- **Kotlin Coroutine NetworkResourceBound:** Efficient network-bound resource handling with coroutines.
- **Product Listing with Offline First:** Dynamic product listing rendered in Lazy Column with offline functionality.

## iOS - Native Version of this App
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

Feel free to explore the codebase, customize components, and integrate additional features based on your project requirements.
