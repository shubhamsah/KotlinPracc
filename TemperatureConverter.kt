class TemperatureConverter {
    fun start() {
        println("Welcome to the Temperature Converter!")
        
        val temperature = getTemperatureInput()
        val unit = getUnitInput()
        
        val result = when (unit) {
            "C" -> {
                val fahrenheit = celsiusToFahrenheit(temperature)
                "$temperature°C is equal to $fahrenheit°F"
            }
            "F" -> {
                val celsius = fahrenheitToCelsius(temperature)
                "$temperature°F is equal to $celsius°C"
            }
            else -> "Invalid unit. Please enter C or F."
        }
        
        println(result)
    }

    private fun getTemperatureInput(): Double {
        while (true) {
            print("Please enter the temperature value: ")
            val input = readLine()?.toDoubleOrNull()
            if (input != null) {
                return input
            }
            println("Invalid input. Please enter a number.")
        }
    }

    private fun getUnitInput(): String {
        while (true) {
            print("Is this temperature in (C)elsius or (F)ahrenheit? Enter C or F: ")
            val input = readLine()?.trim()?.uppercase()
            if (input == "C" || input == "F") {
                return input
            }
            println("Invalid input. Please enter C or F.")
        }
    }

    private fun celsiusToFahrenheit(celsius: Double): Double {
        return celsius * 9/5 + 32
    }

    private fun fahrenheitToCelsius(fahrenheit: Double): Double {
        return (fahrenheit - 32) * 5/9
    }
}

fun main() {
    val converter = TemperatureConverter()
    converter.start()
}
