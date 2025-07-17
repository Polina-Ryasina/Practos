package com.example.practos2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager

class ListItemAdapter(
    private val modelsList: List<OneModel>,
    private val requestManager: RequestManager,
    private val onItemClickAdapter: (Int) -> Unit,
    private val onImageClickAdapter: (Int) -> Unit,
) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.one_model, parent, false)
        return ViewHolder(
            item = view,
            request = requestManager,
            clickItemViewHolder = onItemClickAdapter,
            clickImageViewHolder = onImageClickAdapter
        )
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(oneItem = modelsList[position], position = position, amount = itemCount)
    }

    override fun getItemCount(): Int = modelsList.size
}