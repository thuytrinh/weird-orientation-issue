package thuy.sample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        goToSecondButton.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
        Log.d(FirstActivity::class.java.simpleName, "onCreate()")
    }

    override fun onDestroy() {
        Log.d(FirstActivity::class.java.simpleName, "onDestroy()")
        super.onDestroy()
    }
}
