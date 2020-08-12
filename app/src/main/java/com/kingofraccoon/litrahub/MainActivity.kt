package com.kingofraccoon.litrahub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.kingofraccoon.litrahub.fragments.MenuFragment
import com.mxn.soul.flowingdrawer_core.ElasticDrawer
import com.mxn.soul.flowingdrawer_core.FlowingDrawer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var flowingDrawer: FlowingDrawer = findViewById(R.id.drawerlayout)
        flowingDrawer.setTouchMode(ElasticDrawer.TOUCH_MODE_BEZEL)
        flowingDrawer.setOnDrawerStateChangeListener(object :ElasticDrawer.OnDrawerStateChangeListener{
            override fun onDrawerStateChange(oldState: Int, newState: Int) {
                when(newState){
                    ElasticDrawer.STATE_CLOSED -> Log.d("MainActivity", "Drawer STATE_CLOSED")
                    ElasticDrawer.STATE_OPENING -> setFragment(MenuFragment())
                }
            }

            override fun onDrawerSlide(openRatio: Float, offsetPixels: Int) {
                Log.d("MainActivity", "openRatio=" + openRatio + " ,offsetPixels=" + offsetPixels)
            }

        })
    }

private fun setFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .add(R.id.menu, fragment)
            .commit()
    }
}