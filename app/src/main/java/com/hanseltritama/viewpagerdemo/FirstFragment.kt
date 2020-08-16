package com.hanseltritama.viewpagerdemo

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.first_fragment.*

class FirstFragment : Fragment() {

    private lateinit var title: String
    private var page = 0

    companion object {

        fun newInstance(page: Int, title: String) : FirstFragment {
            val firstFragment = FirstFragment()
            val args = Bundle().apply {
                putInt("someInt", page)
                putString("someTitle", title)
            }
            firstFragment.arguments = args
            return firstFragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        page = arguments?.getInt("someInt")!!
        title = arguments?.getString("someTitle")!!
    }

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.first_fragment, container, false)
//        tv_first_fragment.text = "$page -- $title"
        return view
    }

}