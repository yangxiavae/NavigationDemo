package cn.innovate.environment.fragment.alarm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import cn.innovate.environment.R
import kotlinx.android.synthetic.main.activity_demo.view.*
import kotlinx.android.synthetic.main.fragment_alrm.view.*

class AlarmFragment : Fragment() {
    private lateinit var adapter: AlarmAdapter
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater.inflate(R.layout.fragment_alrm, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter= AlarmAdapter(childFragmentManager)
        view.vp_alarm.adapter=adapter
    }

    // Since this is an object collection, use a FragmentStatePagerAdapter,
    // and NOT a FragmentPagerAdapter.
    class AlarmAdapter(fm:FragmentManager):FragmentStatePagerAdapter(fm){
        override fun getItem(position: Int): Fragment {
            val fragment = DemoFragment()
            fragment.arguments = Bundle().apply {
                // Our object is just an integer :-P
                putInt(ARG_OBJECT, position + 1)
            }
            return fragment
        }

        override fun getCount(): Int=100

        override fun getPageTitle(position: Int): CharSequence? {
            return "hello${position}"
        }

    }
    class DemoFragment:Fragment(){
        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            var view = inflater.inflate(R.layout.activity_demo, container, false)
            return view
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {
                view.tv_demo.text=getInt(ARG_OBJECT).toString()
            }
        }
    }
   companion object {
       private const  val ARG_OBJECT = "object"
   }

}