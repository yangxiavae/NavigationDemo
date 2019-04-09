package cn.innovate.environment.fragment.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import cn.innovate.environment.R
import kotlinx.android.synthetic.main.fragment_main_detail.view.*

/**
 *created by yang on 2019-04-04
 *
 **/
class DetailFragment:Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view=inflater.inflate(R.layout.fragment_main_detail,container,false)
        //view.tv_detail.text=arguments?.getString("data")
        return view
    }
}