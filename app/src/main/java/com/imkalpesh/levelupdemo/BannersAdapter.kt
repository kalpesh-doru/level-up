package com.imkalpesh.levelupdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_banner.view.*

class BannersAdapter(
    diffCallback: BannersDiffCallback,
): ListAdapter<BannersModel, ViewHolder>(diffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_banner, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = getItem(position)
        if (model != null) {
            holder.itemView.apply {
                ivItem.setImageResource(model.imgResource!!)
            }
        }
    }
}
class ViewHolder(root: View): RecyclerView.ViewHolder(root)