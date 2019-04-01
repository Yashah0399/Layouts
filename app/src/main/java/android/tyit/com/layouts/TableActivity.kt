package android.tyit.com.layouts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_table.*

class TableActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table)

        btn1.setOnClickListener {
            Toast.makeText(this, "1", Toast.LENGTH_LONG).show()
        }
        btn2.setOnClickListener {
            Toast.makeText(this, "2", Toast.LENGTH_LONG).show()
        }
        btn3.setOnClickListener {
            Toast.makeText(this, "3", Toast.LENGTH_LONG).show()
        }
        btn4.setOnClickListener {
            Toast.makeText(this, "4", Toast.LENGTH_LONG).show()
        }
        btn5.setOnClickListener {
            Toast.makeText(this, "5", Toast.LENGTH_LONG).show()
        }
        btn6.setOnClickListener {
            Toast.makeText(this, "6", Toast.LENGTH_LONG).show()
        }
        btn7.setOnClickListener {
            Toast.makeText(this, "7", Toast.LENGTH_LONG).show()
        }
        btn8.setOnClickListener {
            Toast.makeText(this, "8", Toast.LENGTH_LONG).show()
        }
        btn9.setOnClickListener {
            Toast.makeText(this, "9", Toast.LENGTH_LONG).show()
        }

    }
}
