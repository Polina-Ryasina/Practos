package com.example.practos2

import android.view.View
import android.view.textclassifier.ConversationActions.Request
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager

class ViewHolder(
    item: View,
    private val request: RequestManager,
    private val clickItemViewHolder: (Int) -> Unit,
    private val clickImageViewHolder: (Int) -> Unit
): RecyclerView.ViewHolder(item) {
    private val title = item.findViewById<TextView>(R.id.title)
    private val description = item.findViewById<TextView>(R.id.desc)
    private val image = item.findViewById<ImageView>(R.id.image)
    private val number = item.findViewById<TextView>(R.id.numb)
    private val divider = item.findViewById<View>(R.id.divider)

    fun bindData(oneItem: OneModel, position: Int, amount: Int) {
        title.text = oneItem.name
        description.text = oneItem.description
        request.load(oneItem.getCurrentPic()).into(image)
        number.text = (position+1).toString()
        divider.isVisible = position != amount-1
        itemView.setOnClickListener {
            clickItemViewHolder.invoke(adapterPosition)
        }
        image.setOnClickListener {
            clickImageViewHolder.invoke(adapterPosition)
        }
    }
    fun bindImage(oneItem: OneModel) {
        request.load(oneItem.getCurrentPic()).into(image)
    }
}