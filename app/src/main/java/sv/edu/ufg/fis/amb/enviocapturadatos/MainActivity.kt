package sv.edu.ufg.fis.amb.enviocapturadatos

// MainActivity.kt

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var buttonGoToSendActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonGoToSendActivity = findViewById(R.id.buttonGoToSendActivity)

        buttonGoToSendActivity.setOnClickListener {
            val intent = Intent(this, SendActivity::class.java)
            startActivity(intent)
        }
    }
}
