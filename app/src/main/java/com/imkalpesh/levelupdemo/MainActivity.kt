package com.imkalpesh.levelupdemo

import android.os.Bundle
import android.widget.AbsListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val contactPgmAdapter = BannersAdapter(BannersDiffCallback())
        val contactToPgmOptionsMutableList: MutableList<BannersModel> = mutableListOf()
            contactToPgmOptionsMutableList.add(BannersModel(1, getString(R.string.spider_man),getString(R.string.spider_man_details), R.drawable.img_spider_man))
            contactToPgmOptionsMutableList.add(BannersModel(2, getString(R.string.avengers),getString(R.string.avengers_details), R.drawable.img_avenger))
            contactToPgmOptionsMutableList.add(BannersModel(3, getString(R.string.captain_america),getString(R.string.captain_america_details), R.drawable.img_captan_america))
            contactToPgmOptionsMutableList.add(BannersModel(4, getString(R.string.hulk),getString(R.string.hulk_details), R.drawable.img_hulk))
            contactToPgmOptionsMutableList.add(BannersModel(5, getString(R.string.bat_man),getString(R.string.bat_man_details), R.drawable.img_bat_man))
            contactToPgmOptionsMutableList.add(BannersModel(6, getString(R.string.thanos),getString(R.string.thanos_details), R.drawable.img_thenos))
            contactToPgmOptionsMutableList.add(BannersModel(7, getString(R.string.thor),getString(R.string.thor_details), R.drawable.img_thor))
            contactToPgmOptionsMutableList.add(BannersModel(8, getString(R.string.wonder_woman),getString(R.string.wonder_woman_details), R.drawable.img_wonder_woman))
            contactToPgmOptionsMutableList.add(BannersModel(9, getString(R.string.iron_man),getString(R.string.iron_man_details), R.drawable.img_iron_man_two))
            contactToPgmOptionsMutableList.add(BannersModel(10, getString(R.string.x_man),getString(R.string.x_man_details), R.drawable.img_x_man))
            contactToPgmOptionsMutableList.add(BannersModel(11, getString(R.string.captain_america),getString(R.string.captain_america_details), R.drawable.img_captain_america_two))
            contactToPgmOptionsMutableList.add(BannersModel(12, getString(R.string.iron_man),getString(R.string.iron_man_details), R.drawable.img_iron_man))
        tvPage.text = "1 / ${contactToPgmOptionsMutableList.size}"
        rvBanners.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val snapHelper: SnapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(rvBanners)
        rvBanners.adapter = contactPgmAdapter
        contactPgmAdapter.submitList(contactToPgmOptionsMutableList)
        rvBanners.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                when (newState) {
                    AbsListView.OnScrollListener.SCROLL_STATE_IDLE -> {
                        val currentPosition = (rvBanners.layoutManager as LinearLayoutManager).findFirstVisibleItemPosition()
                        tvTitle.text = contactToPgmOptionsMutableList[currentPosition].characterName.toString()
                        tvContent.text = contactToPgmOptionsMutableList[currentPosition].characterDescription.toString()
                        tvPage.text = "${contactToPgmOptionsMutableList[currentPosition].id} / ${contactToPgmOptionsMutableList.size}"
                    }
                }
            }
        })
        tvContent.setOnClickListener { Toast.makeText(this@MainActivity, "Yeaah", Toast.LENGTH_SHORT).show() }
    }
}