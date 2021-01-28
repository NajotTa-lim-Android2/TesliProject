package uz.najottalim.kinoteatr

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import uz.najottalim.kinoteatr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        val view: View = binding.root

        setContentView(view)

        binding.submitButton.setOnClickListener {

            val name: String = binding.nameInput.text.toString()
            binding.greeterText.text = "Hello ${name}"


        }

    }

}