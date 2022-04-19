package create.kotlin.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import create.kotlin.app.R
import create.kotlin.app.databinding.*

class MainActivity : AppCompatActivity() {
  private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.textView.text = "test"
    }

}
