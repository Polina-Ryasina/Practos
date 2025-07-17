package com.example.practos2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class FragmentList: Fragment(R.layout.fragment_recycler_view) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val modelsList = Models.returnList()
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerview)
        val adapter = ListItemAdapter(
            modelsList = modelsList,
            requestManager = Glide.with(this),
            onItemClickAdapter = {position ->
                val model=modelsList[position]
                val bundle = Bundle().apply {
                    putParcelable("key", model)
                }
                findNavController().navigate(R.id.action_fragmentList_to_fragmentDetail, bundle)
            },
            onImageClickAdapter = {position ->
                val model=modelsList[position]
                model.changePic()
                val viewHolder = recyclerView.findViewHolderForAdapterPosition(position) as? ViewHolder
                viewHolder?.bindImage(model)
            }
        )
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
    }
}