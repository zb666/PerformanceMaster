package com.zb666.mechrevo.performancemaster

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.FrameLayout
import com.zb666.mechrevo.performancemaster.flyweight.FlyWeightFactory
import com.zb666.mechrevo.performancemaster.utils.LogUtils
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.ref.ReferenceQueue
import java.util.*
import android.opengl.ETC1.getHeight
import android.opengl.ETC1.getWidth
import android.content.Intent
import com.youth.banner.BannerConfig
import com.zb666.GlideImageLoader
import com.zb666.PhotoActivity
import com.zb666.RvActivity
import com.zb666.mechrevo.smooth.OriginalActivity
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {

    private val strLazy by lazy {
        "lazy data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme_After_Launch)
        setContentView(R.layout.activity_main)

        val ofo = FlyWeightFactory.getInstance().getOrderBike("ofo")
        ofo.getBikeStr("ofo 输出")

        val mobile = FlyWeightFactory.getInstance().getOrderBike("mobile")
        mobile.getBikeStr("mobile 输出")

        val ofoShare = FlyWeightFactory.getInstance().getOrderBike("ofo")
        ofoShare.getBikeStr("ofo 备份数据开始输出")

        val d = Log.d("LogUtils", strLazy)
        var list = ArrayList<String>()
        list.add("https://youimg1.c-ctrip.com/target/100310000000p6767262E.jpg")
        list.add("https://youimg1.c-ctrip.com/target/100310000000p6767262E.jpg")
        list.add("https://youimg1.c-ctrip.com/target/100310000000p6767262E.jpg")
        list.add("https://youimg1.c-ctrip.com/target/100310000000p6767262E.jpg")
        tv.setOnClickListener {
            jump()
        }

        banner.apply {
            setImageLoader(GlideImageLoader())
            setImages(list)
            isAutoPlay(false)
            setIndicatorGravity(BannerConfig.CENTER)
        }.start()

    }

    private fun jump() {
        val intent = Intent(this@MainActivity, RvActivity::class.java)
        startActivity(intent)
    }


}
