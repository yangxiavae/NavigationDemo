package cn.innovate.environment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation.findNavController

import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var finalHost:NavHostFragment?=null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    fun init() {
        val navController = findNavController(this,R.id.nav_host_fragment)
        NavigationUI.setupWithNavController(bn_menu,navController)
    }

    override fun onSupportNavigateUp(): Boolean= findNavController(this,R.id.nav_host_fragment).navigateUp()
}
