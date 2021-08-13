package com.example.justfriends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class FavoritesActivity : AppCompatActivity() {

    private lateinit var botoncar: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorites)

        //val bundleRFav = intent.extras

        val listFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentList) as ListFragmentFav

        listFragment.setListener {
            val detailFragment =
                supportFragmentManager.findFragmentById(R.id.fragmentDetail) as? DetailFragmentFav

            // Pantalla grande, mostrar detalle en el fragment
            if (detailFragment != null) {
                detailFragment.showProduct(it)
            } else { //pantalla pequeña, navegar a un nuevo Activity
                val intent = Intent(this, DetailActivityFav::class.java)
                intent.putExtra(DetailActivityFav.PRODUCT, it)
                startActivity(intent)
            }
        }

        /*botoncar = findViewById(R.id.buy_button)

            botoncar.setOnClickListener{
                val bundle = Bundle()
                val intent = Intent(this, PlayerasActivity::class.java).apply { putExtras(bundle) }
                startActivity(intent)
            }*/


    }
}

  /*  override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menufavorites, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item1 -> {
                Toast.makeText(this, "Buscando...", Toast.LENGTH_LONG).show()

                return true
            }

            R.id.item3 -> {
                Toast.makeText(this, "Elemento eliminado", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.subitem1 -> {
                Toast.makeText(this, "Compartir lista", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.subitem2 -> {
                Toast.makeText(this, "Compartir elemento", Toast.LENGTH_LONG).show()
                return true
            }

        }
        return super.onOptionsItemSelected(item)
    }*/