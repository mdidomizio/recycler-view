package com.example.recyclerviewapp

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class AppAdapter : RecyclerView.Adapter<AppAdapter.ViewHolder>() {

    var data: MutableList<String> = mutableListOf()

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder)
     */

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val text: TextView

        init {
            // Define click listener for the ViewHolder's View
            text = view.findViewById(R.id.itemText)
        }
    }

// Create new views (invoked by the layout manager)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)

        return ViewHolder(view)


    }
// Replace the contents of a view (invoked by the layout manager)

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        holder.text.text = data[position]

        if (position % 2 == 0) {
            holder.itemView.setBackgroundColor(Color.CYAN)
        } else {
            holder.itemView.setBackgroundColor(Color.YELLOW)
        }

    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = data.size

}





