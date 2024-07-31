package sv.edu.ufg.fis.amb.enviocapturadatos

// SendActivity.kt


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class SendActivity : AppCompatActivity() {

    private lateinit var editTextName: EditText
    private lateinit var editTextSurname: EditText
    private lateinit var editTextAge: EditText
    private lateinit var buttonSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send)

        editTextName = findViewById(R.id.editTextName)
        editTextSurname = findViewById(R.id.editTextSurname)
        editTextAge = findViewById(R.id.editTextAge)
        buttonSend = findViewById(R.id.buttonSend)

        buttonSend.setOnClickListener {
            val name = editTextName.text.toString()
            val surname = editTextSurname.text.toString()
            val age = editTextAge.text.toString()

            val intent = Intent(this, ReceiveActivity::class.java).apply {
                putExtra("NAME", name)
                putExtra("SURNAME", surname)
                putExtra("AGE", age)
            }
            startActivity(intent)
        }
    }
}

