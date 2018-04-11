package thuy.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        backToFirstButton.setOnClickListener {
            finish()
        }
        Log.d(SecondActivity::class.java.simpleName, "onCreate()")
    }

    override fun onPause() {
        super.onPause()
        Thread.sleep(1000)
    }

    override fun onDestroy() {
        Log.d(SecondActivity::class.java.simpleName, "onDestroy()")
        super.onDestroy()
    }
}
