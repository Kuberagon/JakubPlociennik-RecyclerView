import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rainbowcolors.R

class ColorAdapter(private val colors: List<Int>) : RecyclerView.Adapter<ColorAdapter.ColorViewHolder>() {

    class ColorViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val colorView: View = view.findViewById(R.id.colorView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColorViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_color, parent, false)
        return ColorViewHolder(view)
    }

    override fun onBindViewHolder(holder: ColorViewHolder, position: Int) {
        holder.colorView.setBackgroundColor(colors[position])
    }

    override fun getItemCount(): Int = colors.size
}
