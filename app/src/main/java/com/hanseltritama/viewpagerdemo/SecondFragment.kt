package com.hanseltritama.viewpagerdemo

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.first_fragment.*

class SecondFragment() : Fragment() {

    companion object {
        private lateinit var title: String
        private var page = 0

        fun newInstance(page: Int, title: String) : SecondFragment {
            val firstFragment = SecondFragment()
            val args = Bundle()
            args.putInt("someInt", page)
            args.putString("someTitle", title)
            firstFragment.arguments = args
            return firstFragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        page = arguments!!.getInt("someInt", 0)
        title = arguments!!.getString("someTitle").toString()
    }

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.second_fragment, container, false)
        tvLabel.text = "$page -- $title"
        return view
    }



}