package sv.edu.ufg.fis.amb.enviocapturadatos
// ReceiveActivity.kt

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ReceiveActivity : AppCompatActivity() {

    private lateinit var textViewName: TextView
    private lateinit var textViewSurname: TextView
    private lateinit var textViewAge: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receive)

        textViewName = findViewById(R.id.textViewName)
        textViewSurname = findViewById(R.id.textViewSurname)
        textViewAge = findViewById(R.id.textViewAge)

        val name = intent.getStringExtra("NAME")
        val surname = intent.getStringExtra("SURNAME")
        val age = intent.getStringExtra("AGE")

        textViewName.text = "Nombre: $name"
        textViewSurname.text = "Apellido: $surname"
        textViewAge.text = "Edad: $age"
    }
}
