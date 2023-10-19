package za.co.varsitycollege.st10122517.settingspage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    private lateinit var distanceCalculator: DistanceCalculator
    /*private lateinit var mapView: MapView // Replace with your MapView reference
    private lateinit var distanceTextView: TextView // TextView for displaying distance on the map*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the DistanceCalculator
        distanceCalculator = DistanceCalculator()

        // Find the Switch in your layout
        val distanceSwitch = findViewById<Switch>(R.id.distanceSwitch)

        // Set an OnCheckedChangeListener to toggle units
        distanceSwitch.setOnCheckedChangeListener { _, isChecked ->
            // Toggle between metric and imperial units
            distanceCalculator.toggleUnits()

            // Update the distance on the map
            val distanceInKilometers = 10.0 // Replace with your actual distance value
            val calculatedDistance = distanceCalculator.calculateDistance(distanceInKilometers)
            // distanceTextView.text = "$calculatedDistance ${if (distanceCalculator.isMetricSystem) "km" else "mi"}"

            // Update other map-related components as needed
            // Example: mapView.updateDistance(calculatedDistance)
        }
    }
}
