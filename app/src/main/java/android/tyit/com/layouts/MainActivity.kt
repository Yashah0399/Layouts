package android.tyit.com.layouts

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linear.setOnClickListener{
            startActivity(Intent(this, LinearActivity::class.java))
        }

        relative.setOnClickListener{
            startActivity(Intent(this, RelativeActivity::class.java))
        }

        table.setOnClickListener{
            startActivity(Intent(this, TableActivity::class.java))
        }

        frame.setOnClickListener{
            startActivity(Intent(this, FrameActivity::class.java))
        }

        list.setOnClickListener{
            startActivity(Intent(this, ListsActivity::class.java))
        }

        grid.setOnClickListener{
            startActivity(Intent(this, GridActivity::class.java))
        }

    }
}
