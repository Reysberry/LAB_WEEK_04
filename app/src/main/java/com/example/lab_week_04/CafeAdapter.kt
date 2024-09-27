package com.example.lab_week_04

import android.provider.Settings.Global.getString
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

val TABS_FIXED = listOf(
    R.string.starbucks_title,
    R.string.janjijiwa_title,
    R.string.kopikenangan_title,
)

val TABS_DETAIL = listOf(
    R.string.starbucks_desc,
    R.string.janjijiwa_desc,
    R.string.kopikenangan_desc
)
class CafeAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return TABS_FIXED.size
    }
    override fun createFragment(position: Int): Fragment
    {
        if(position == 1){
            return CafeDetailFragment().newInstance("Starbucks Corporation is an American\n" +
                    "multinational chain of coffeehouses and roastery reserves headquartered in\n" +
                    "Seattle, Washington. It is the world\\'s largest coffeehouse\n" +
                    "chain.")
        }else if(position == 2){
            return CafeDetailFragment().newInstance("It is undeniable that Janji Jiwa outlets have\n" +
                    "spread to various corners. Janji Jiwa is a local coffee brand that is popular among\n" +
                    "students, students, workers and even families. Carrying the jargon \"coffee from the\n" +
                    "heart\", Janji Jiwa is committed to serving coffee with a classic taste for coffee\n" +
                    "lovers.")
        }else{
            return CafeDetailFragment().newInstance("At Kopi Kenangan, their dream is to serve high\n" +
                    "quality coffee, made with the freshest local ingredients to customers across\n" +
                    "Indonesia - and the rest of the world")
        }

    }
}