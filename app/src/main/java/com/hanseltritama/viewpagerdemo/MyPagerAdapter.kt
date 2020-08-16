package com.hanseltritama.viewpagerdemo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    companion object {
        private const val NUM_ITEMS = 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FirstFragment.newInstance(0, "Page # 1")
            1 -> FirstFragment.newInstance(1, "Page # 2")
            2 -> SecondFragment.newInstance(2, "Page # 3")
            else -> throw Exception("Fragment Not Found!")
        }
    }

    override fun getCount(): Int {
        return NUM_ITEMS
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return "Page $position"
    }

}