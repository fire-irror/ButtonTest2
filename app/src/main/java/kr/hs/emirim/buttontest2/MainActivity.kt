package kr.hs.emirim.buttontest2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var text1: TextView;//나중에 초기화 하겠다는 뜻
    lateinit var btn1: Button;
    lateinit var btn2: Button;
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text1 = findViewById<TextView>(R.id.text1)
        btn1 = findViewById<Button>(R.id.btn1)
        btn2 = findViewById<Button>(R.id.btn2)

        btn1.setOnClickListener {
            //text1.setText(btn1.text) 둘 다 가능한 방법
            text1.text = btn1.text
        }
        btn2.setOnClickListener {
            text1.text = btn2.text
        }
    }
}