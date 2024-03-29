package com.andronity.driver_jipuksampah



import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.andronity.driver_jipuksampah.Fragment.ComplateFragment
import com.andronity.driver_jipuksampah.Fragment.HandleFragment
import com.andronity.driver_jipuksampah.Fragment.RequestFragment

class MyPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm){

    // sebuah list yang menampung objek Fragment
    private val pages = listOf(
        RequestFragment(),
        HandleFragment(),
        ComplateFragment()
    )

    // menentukan fragment yang akan dibuka pada posisi tertentu
    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }



    // judul untuk tabs
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Request"
            1 -> "Handle"
            else -> "Complate"
        }
    }
}