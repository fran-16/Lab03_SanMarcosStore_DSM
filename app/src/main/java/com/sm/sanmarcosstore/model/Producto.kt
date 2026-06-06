package com.sm.sanmarcosstore.model

data class Producto(
    val id: Int,
    val nombre: String,
    val precio: String,
    val categoria: String,
    val favorito: Boolean = false
)

val productosDePrueba = listOf(
    Producto(1, "Polo Oficial Universidad", "S/ 35.00", "Ropa", true),
    Producto(2, "Polera Universitaria", "S/ 75.00", "Ropa"),
    Producto(3, "Gorra Institucional", "S/ 25.00", "Accesorios"),
    Producto(4, "Taza con Logo de la Universidad", "S/ 18.00", "Souvenirs", true),
    Producto(5, "Llavero Institucional", "S/ 8.00", "Souvenirs"),
    Producto(6, "Tomatodo Universitario", "S/ 22.00", "Accesorios"),
    Producto(7, "Cuaderno Oficial", "S/ 15.00", "Utiles"),
    Producto(8, "Bolso Ecológico Institucional", "S/ 20.00", "Accesorios"),
    Producto(9, "Sticker Pack Universidad", "S/ 6.00", "Souvenirs"),
    Producto(10, "Pin Metálico con Escudo", "S/ 12.00", "Souvenirs", true)
)