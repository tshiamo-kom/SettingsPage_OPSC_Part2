package za.co.varsitycollege.st10122517.settingspage

class DistanceCalculator {
    private var isMetricSystem = true // Start with the metric system as the default

    // Function to toggle between metric and imperial systems
    fun toggleUnits() {
        isMetricSystem = !isMetricSystem
    }

    // Function to calculate distance based on the current system
    fun calculateDistance(distanceInKilometers: Double): Double {
        return if (isMetricSystem) {
            distanceInKilometers
        } else {
            return distanceInKilometers * 0.621371
        }
    }
}

fun main() {
    val calculator = DistanceCalculator()

    // Initial calculation
    val initialDistance = 10.0 // Assume 10 kilometers
    println("Initial distance: ${calculator.calculateDistance(initialDistance)}")

    // Toggle to imperial system
    calculator.toggleUnits()
    println("Distance in imperial system: ${calculator.calculateDistance(initialDistance)}")

    // Toggle back to metric system
    calculator.toggleUnits()
    println("Distance in metric system: ${calculator.calculateDistance(initialDistance)}")
}
