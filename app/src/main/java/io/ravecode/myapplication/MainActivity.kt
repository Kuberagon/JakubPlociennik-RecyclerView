package io.ravecode.myapplication
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val rainbowColors = listOf(
            ContextCompat.getColor(this, R.color.red),
            ContextCompat.getColor(this, R.color.orange),
            ContextCompat.getColor(this, R.color.yellow),
            ContextCompat.getColor(this, R.color.green),
            ContextCompat.getColor(this, R.color.blue),
            ContextCompat.getColor(this, R.color.indigo),
            ContextCompat.getColor(this, R.color.violet)
        )

        recyclerView.adapter = ColorAdapter(rainbowColors)
    }
}
