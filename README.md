# Popular Movies Stage 2 project for the Udacity Android Nanodegree Program

## Project Overview
The app fetches data from http://api.themoviedb.org and uses it to show the top rated or most popular movies in a grid layout displayed in a recyclerview. Each item can be clicked to show more details about the specific movie

## Api key
In order for the project to work you need a themoviedb api key. The key needs to be replaced in the:
/app/src/main/java/com/example/tudor/popularmovies/utils/NetworkUtils.java
private static String API_KEY = ApiUtils.getApiKey(); // Replace with your api key

## Screenshots
<img   src="https://user-images.githubusercontent.com/17934944/38707600-a90b9c94-3eba-11e8-861d-966fdcecdd80.png" width="300">
<img  src="https://user-images.githubusercontent.com/17934944/38707611-b6dd610e-3eba-11e8-9e4b-cba85ea28d87.png" width="300">
<img  src="https://user-images.githubusercontent.com/17934944/38707624-c7bdeb4c-3eba-11e8-879a-05bded23690a.png" width="300">

## Common Project Requirements
- [x] App is written solely in the Java Programming Language.
- [x] App conforms to common standards found in the Android Nanodegree General Project Guidelines.

## User Interface - Layout
- [x] UI contains an element (e.g., a spinner or settings menu) to toggle the sort order of the movies by: most popular, highest rated.
- [x] Movies are displayed in the main layout via a grid of their corresponding movie poster thumbnails.
- [x] UI contains a screen for displaying the details for a selected movie.
- [x] Movie Details layout contains title, release date, movie poster, vote average, and plot synopsis.
- [x] Movie Details layout contains a section for displaying trailer videos and user reviews.

## User Interface - Function
- [x] When a user changes the sort criteria (most popular, highest rated, and favorites) the main view gets updated correctly.
- [x] When a movie poster thumbnail is selected, the movie details screen is launched.
- [x] When a trailer is selected, app uses an Intent to launch the trailer.
- [x] In the movies detail screen, a user can tap a button(for example, a star) to mark it as a Favorite.

## Network API Implementation
- [x] In a background thread, app queries the /movie/popular or /movie/top_rated API for the sort criteria specified in the settings menu.

- [x] App requests for related videos for a selected movie via the /movie/{id}/videos endpoint in a background thread and displays those details when the user selects a movie.

- [x] App requests for user reviews for a selected movie via the /movie/{id}/reviews endpoint in a background thread and displays those details when the user selects a movie.

## Data Persistence
- [x] The titles and IDs of the user’s favorite movies are stored in a native SQLite database and are exposed via a ContentProvider. This ContentProvider is updated whenever the user favorites or unfavorites a movie. No other persistence libraries are used.

## Data Persistence
- [x] When the "favorites" setting option is selected, the main view displays the entire favorites collection based on movie ids stored in the ContentProvider.
