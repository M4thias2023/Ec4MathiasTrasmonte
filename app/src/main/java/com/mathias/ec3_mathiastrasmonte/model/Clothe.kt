package com.mathias.ec3_mathiastrasmonte.model

data class Clothe(
    val image: String,
    val title: String,
    val price: String,
)


fun getData():List<Clothe>{
return listOf(
    Clothe("","Polo Rojo","30.00"),
    Clothe("","Polo Rojo","30.00"),
    Clothe("","Polo Rojo","30.00"),
    Clothe("","Polo Rojo","30.00"),
    Clothe("","Polo Rojo","30.00"),
    Clothe("","Polo Rojo","30.00"),
    Clothe("","Polo Rojo","30.00"),
    Clothe("","Polo Rojo","30.00"),
    )
}
