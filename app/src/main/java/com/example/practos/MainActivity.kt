package com.example.practos
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlin.random.Random

class MainActivity: AppCompatActivity() {
    private val picList = listOf(
        "https://i.pinimg.com/1200x/b3/d5/d8/b3d5d8f951d8ab52f8d45a322111ce21.jpg",
        "https://i.pinimg.com/736x/79/11/d0/7911d02c09e6db29d41c19de3748347c.jpg",
        "https://i.pinimg.com/736x/34/82/b4/3482b4d5daf03165dc6de97d20f5b306.jpg",
        "https://i.pinimg.com/736x/2b/8b/54/2b8b5453ac134f51af7bbdc997a8a716.jpg",
        "https://i.pinimg.com/736x/e9/05/06/e90506b8c178cef14582672762d2146d.jpg",
        "https://i.pinimg.com/736x/21/37/d6/2137d655c5d753754a4782ec13645e88.jpg",
        "https://i.pinimg.com/736x/24/24/d7/2424d760be7a72996969c12dc4ae79e3.jpg",
        "https://i.pinimg.com/736x/52/39/80/52398030f19e225e56ff838f6579bf47.jpg",
        "https://i.pinimg.com/736x/6f/b7/26/6fb726d46f5894ed0c67399b8b42f4c0.jpg",
        "https://i.pinimg.com/736x/36/f3/25/36f3251f7d40377ce7c5eccd7b9c0ef3.jpg"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val image = findViewById<ImageView>(R.id.image1)
        val but1 = findViewById<Button>(R.id.but)
        val but2 = findViewById<Button>(R.id.but2)
        but1.setOnClickListener {
            val index = Random.nextInt(0, 9)
            val picIndex = picList[index]
            Glide.with(this).load(picIndex).into(image)
        }
        but2.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}