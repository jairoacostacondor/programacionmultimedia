fun main() {
    // Creación de una instancia de la clase Song con los detalles de la canción "Need to Know"
    val dojaCatHit = Song("Need to Know", "Doja Cat", 2021, 353_000_000)

    // Llamada al método que imprime la descripción de la canción
    dojaCatHit.showDetails()

    // Verifica si la canción es popular según el número de reproducciones
    println(dojaCatHit.isTrending)
}

class Song(
    val trackTitle: String,        // Título de la canción
    val performer: String,         // Artista que interpreta la canción
    val releaseYear: Int,          // Año en que se publicó
    val totalPlays: Int            // Número de reproducciones de la canción
) {
    // Propiedad que determina si la canción es trending (más de 1000 reproducciones)
    val isTrending: Boolean
        get() = totalPlays >= 1_000

    // Función que imprime una descripción detallada de la canción
    fun showDetails() {
        println("$trackTitle, interpretada por $performer, se lanzó en $releaseYear.")
    }
}
