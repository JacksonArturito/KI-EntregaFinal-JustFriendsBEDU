package com.example.justfriends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PlayerasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playeras)
        //val bundleR = intent.extras

        val listFragment = supportFragmentManager.findFragmentById(R.id.fragmentListPlayera) as ListPlayeraFragment

        listFragment.setListener{
            val detailFragment = supportFragmentManager.findFragmentById(R.id.fragmentDetailPlayera) as? DetailPlayeraFragment

            // Pantalla grande, mostrar detalle en el fragment
            if(detailFragment!=null){
                detailFragment.showPlayera(it)
            } else{ //pantalla pequeña, navegar a un nuevo Activity
                val intent = Intent(this, DetailPlayerasActivity::class.java)
                intent.putExtra(DetailPlayerasActivity.PLAYERA,it)
                startActivity(intent)
            }
        }
    }
}