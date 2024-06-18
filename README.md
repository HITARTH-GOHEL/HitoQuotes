# Hitoquotees

Hitoquotees is a simple Android application built with Jetpack Compose and Kotlin. This project allows users to view a list of quotes using a lazy loading approach with LazyColumn and LazyGrid. The app focuses on clean navigation and efficient rendering of a large number of quotes.

## Features

- **Quotes List**: Displays a list of quotes using LazyColumn and LazyGrid for efficient performance.
- **Navigation**: Seamless navigation within the app.
- **Jetpack Compose**: Utilizes modern Android UI toolkit for building native UIs.
- **Kotlin**: Fully written in Kotlin for a more concise and idiomatic codebase.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Android Studio Bumblebee or later
- Kotlin 1.5 or later
- Gradle 7.0 or later

### Installation

1. **Clone the repository**:

    ```sh
    git clone https://github.com/hitoquotes/hitoquotees.git
    ```

2. **Open the project in Android Studio**:

    Open Android Studio, click on `Open an existing project`, and select the `hitoquotees` directory.

3. **Build the project**:

    Click on `Build` in the menu and then `Rebuild Project` to ensure all dependencies are downloaded and the project is set up correctly.

### Running the App

1. **Connect an Android device or start an emulator**.

2. **Run the app**:

    Click on the `Run` button in Android Studio or use `Shift + F10`.

## Project Structure

- `app/src/main/java/com/example/hitoquotees/`: Contains the Kotlin source files.
  - `MainActivity.kt`: The main entry point of the app.
  - `ui/`: Contains UI-related components.
    - `navigation/`: Contains navigation-related classes.
    - `listscreens/`: Contains composable functions for different screens.
    - `components/`: Contains reusable UI components.
  - `data class/`: Contains data class.

## Usage

The app showcases a list of quotes. Users can scroll through the quotes, which are efficiently loaded using Jetpack Compose's `LazyColumn` and `LazyGrid`.


## Built With

- [Jetpack Compose](https://developer.android.com/jetpack/compose) - Android's modern toolkit for building native UI.
- [Kotlin](https://kotlinlang.org/) - A modern programming language for Android development.
- [Android Studio](https://developer.android.com/studio) - The official IDE for Android development.

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on the code of conduct, and the process for submitting pull requests.


---

Feel free to fork and contribute to this project to make it even better! If you encounter any issues, please open a new issue in the repository. Enjoy coding!
