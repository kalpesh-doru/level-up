package com.imkalpesh.levelupdemo

import androidx.recyclerview.widget.DiffUtil

class BannersDiffCallback: DiffUtil.ItemCallback<BannersModel>() {
    override fun areItemsTheSame(oldItem: BannersModel, newItem: BannersModel): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: BannersModel, newItem: BannersModel): Boolean {
        return oldItem == newItem
    }
}