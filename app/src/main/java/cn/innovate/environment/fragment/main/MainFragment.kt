package cn.innovate.environment.fragment.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import cn.innovate.environment.R
import kotlinx.android.synthetic.main.fragment_main.view.*

class MainFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view=inflater.inflate(R.layout.fragment_main,container,false)
        view.bt_detail.setOnClickListener{
            //第一种方式--针对view
           // Navigation.findNavController(it).navigate(R.id.detailFragment)
            //button
           // Navigation.createNavigateOnClickListener(R.id.detailFragment,null)
            //数据传递
            var bundle= bundleOf("data" to "你好")
            Navigation.findNavController(it).navigate(R.id.detailFragment,bundle)
        }
        return view
    }
}
