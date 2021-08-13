package com.example.justfriends

import RecyclerAdapterFav
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_list_fav.*


class ListFragmentFav : Fragment() {

    private lateinit var mAdapter : RecyclerAdapterFav
    private var listener : (Product) ->Unit = {}


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // infla el layout para este Fragment
        return inflater.inflate(R.layout.fragment_list_fav, container, false)
    }

    //generamos datos dummy con este método
    private fun getProducts(): MutableList<Product>{
        var products:MutableList<Product> = ArrayList()

        products.add(Product("Negro Nocturno", "Sudadera negra", R.drawable.favorites))
        products.add(Product("Arena", "Playera fresca", R.drawable.arena))
        products.add(Product("BOOM", "Sticker explosivo", R.drawable.boom))
        products.add(Product("COOL", "Sticker Cool", R.drawable.cool))
        products.add(Product("Baraja", "Juego de mesa", R.drawable.baraja))
        products.add(Product("Tigre Toño", "Playera con estampado", R.drawable.tigre))
        products.add(Product("Frescura Pura", "Playera deportiva", R.drawable.frescura))
        products.add(Product("Skull", "Sticker de calavera", R.drawable.skull))

        return products
    }

    //configuramos lo necesario para desplegar el RecyclerView
    private fun setUpRecyclerView(){
        // indicamos que tiene un tamaño fijo
        recyclerProducts.setHasFixedSize(true)
        // indicamos el tipo de layoutManager
        recyclerProducts.layoutManager = LinearLayoutManager(activity)
        //seteando el Adapter
        mAdapter = RecyclerAdapterFav( requireActivity(), getProducts(), listener)
        //asignando el Adapter al RecyclerView
        recyclerProducts.adapter = mAdapter
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setUpRecyclerView()
    }

    fun setListener(l: (Product) ->Unit){
        listener = l
    }
}