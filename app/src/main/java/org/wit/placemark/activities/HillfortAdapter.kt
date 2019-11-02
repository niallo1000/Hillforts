package org.wit.placemark.activities


import android.view.*
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_hillfort.view.*
import org.wit.hillfort.R
import org.wit.hillfort.models.HillfortModel

class HillfortAdapter constructor(private var hillforts: List<HillfortModel>) :
    RecyclerView.Adapter<HillfortAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        return MainHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.card_hillfort, parent, false))
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        val hillfort = hillforts[holder.adapterPosition]
        holder.bind(hillfort)
    }

    override fun getItemCount(): Int = hillforts.size

    class MainHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(hillfort: HillfortModel) {
            itemView.title.text = hillfort.title
            itemView.description.text = hillfort.description
            itemView.location.text = hillfort.location
            //itemView.visited. = hillfort.visited
        }
    }
}