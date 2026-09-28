package github.com.biloschycki.clima_app.ui.navigation

sealed class Screen(val route: String) {
    object Search : Screen("search")
    object Favorites : Screen("favorites")
    object Details : Screen("details")
}
