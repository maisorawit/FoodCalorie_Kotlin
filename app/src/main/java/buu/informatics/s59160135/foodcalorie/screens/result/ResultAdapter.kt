package buu.informatics.s59160135.foodcalorie.screens.result

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import buu.informatics.s59160135.foodcalorie.R

class ResultAdapter : RecyclerView.Adapter<ResultAdapter.ViewHolder>(){
    var data = listOf<MyData>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.i("test","Start")
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.contentTextView1.text = data[position].name
        holder.contentTextView2.text = data[position].quality
        holder.contentTextView3.text = data[position].kcal

    }

    fun replaceItems(items: List<MyData>) {
        this.data = items
    }

    override fun getItemCount(): Int = data.size

    class ViewHolder private constructor(itemView: View) : RecyclerView.ViewHolder(itemView){
        val contentTextView1: TextView = itemView.findViewById(R.id.text_nameMenu)
        val contentTextView2: TextView = itemView.findViewById(R.id.text_quality)
        val contentTextView3: TextView = itemView.findViewById(R.id.text_cal)



        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val view = layoutInflater
                    .inflate(R.layout.result_list_item, parent, false)

                return ViewHolder(view)
            }
        }
    }
}