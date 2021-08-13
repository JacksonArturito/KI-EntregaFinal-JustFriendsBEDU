package com.example.justfriends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout

class principalScreenActivity : AppCompatActivity() {

    private lateinit var btnPl: Button
    private lateinit var btnSud: Button
    private lateinit var btnSti: Button
    private lateinit var btnJug: Button
    private lateinit var btnFavoritos: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal_screen)

       /* val appBar = findViewById<Toolbar>(R.id.app_bar)
        this.setSupportActionBar(appBar)

        setupDrawer(appBar)*/

        val bundleR = intent.extras

        val name = bundleR?.getString(USER_NAME)
        val email = bundleR?.getString(EMAIL)

        btnFavoritos=findViewById(R.id.buttonFavorites)

        /*Jazmin*/
        btnPl = findViewById(R.id.btnPlayera)
        btnSud = findViewById(R.id.btnSudadera)
        btnSti = findViewById(R.id.btnSticker)
        btnJug = findViewById(R.id.btnJuegos)

        btnFavoritos.setOnClickListener{
            val bundleFav = Bundle()
            val intent = Intent(this, FavoritesActivity::class.java).apply { putExtras(bundleFav) }
            startActivity(intent)
        }

        btnPl.setOnClickListener{
            val bundlePl = Bundle()
            val intent = Intent(this, PlayerasActivity::class.java).apply { putExtras(bundlePl) }
            startActivity(intent)
        }

        btnSud.setOnClickListener{
            val bundle = Bundle()
            val intent = Intent(this, SudaderaActivity::class.java).apply { putExtras(bundle) }
            startActivity(intent)
        }

        btnSti.setOnClickListener{
            val bundle = Bundle()
            val intent = Intent(this, StickerActivity::class.java).apply { putExtras(bundle) }
            startActivity(intent)
        }

      /*  btnJug.setOnClickListener{
            val bundle = Bundle()
            val intent = Intent(this, JuegosActivity::class.java).apply { putExtras(bundle) }
            startActivity(intent)
        }*/

    }

}

    /*override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }


    private fun setupDrawer(toolbar: Toolbar){
        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        val drawerToggle = ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer)
    }*/