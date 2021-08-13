package com.example.justfriends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetailPlayerasActivity : AppCompatActivity() {
    companion object {
        val PLAYERA = "PLAYERA"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_playeras)

        val playera = intent.getParcelableExtra<Playera>(PLAYERA)
        val detailFragment = supportFragmentManager.findFragmentById(R.id.fragmentDetailPlayera) as? DetailPlayeraFragment
        if (playera != null) {
            detailFragment?.showPlayera(playera)
        }

    }
}