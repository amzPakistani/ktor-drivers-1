package example.com.data

import example.com.data.model.Driver

val BASE_URL = "http://127.0.0.1:8010/"
val DriverList = mutableListOf(
    Driver(
        "Lewis Hamilton",
        "1",
        "Lewis Carl Davidson Hamilton MBE HonFREng is a British racing driver currently competing in Formula One for Mercedes, having previously driven for McLaren.",
        "${BASE_URL}f1_drivers/hamilton.jpg",
    ),
    Driver(
        "Max Verstappen",
        "2",
        "Max Emilian Verstappen is a Belgian-Dutch racing driver currently competing in Formula One, under the Dutch flag, with Red Bull Racing.",
        "${BASE_URL}f1_drivers/max.jpg"
    ),
    Driver(
        "Sebastian Vettel",
        "3",
        "Sebastian Vettel is a German racing driver who is set to compete in Formula One for Aston Martin in 2021.",
        "${BASE_URL}f1_drivers/vettel.jpg"
    ),
    Driver(
        "Fernando Alonso",
        "4",
        "Fernando Alonso Díaz is a Spanish racing driver currently competing for Aston Martin in Formula One.",
        "${BASE_URL}f1_drivers/alonso.jpg"
    ),
    Driver(
        "Kimi Raikonnen",
        "5",
        "Kimi-Matias Räikkönen is a Finnish racing driver currently driving in Formula One for Alfa Romeo Racing.",
        "${BASE_URL}f1_drivers/kimi.jpg"
    )
)