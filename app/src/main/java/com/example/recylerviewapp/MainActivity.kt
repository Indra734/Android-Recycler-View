package com.example.recylerviewapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MahasiswaAdapter
    private val mahasiswaList = mutableListOf<Mahasiswa>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerview)
        adapter = MahasiswaAdapter(mahasiswaList)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        addDataMahasiswa()
    }

    private fun addDataMahasiswa() {
        mahasiswaList.add(Mahasiswa("Abmi Sukma Edri", "12250120341", R.drawable.amiii))
        mahasiswaList.add(Mahasiswa("Ahmad Kurniawan", "12250111514", R.drawable.ahmad))
        mahasiswaList.add(Mahasiswa("Aufa Hajati", "12250120338", R.drawable.aufa))
        mahasiswaList.add(Mahasiswa("Daffa Finanda", "12250111603", R.drawable.user))
        mahasiswaList.add(Mahasiswa("Daffa Ikhwan Nurfauzan", "12250110979", R.drawable.dafuq))
        mahasiswaList.add(Mahasiswa("Dwi Jelita Adhliyah", "12250120331", R.drawable.jelita))
        mahasiswaList.add(Mahasiswa("Dwi Mahdini", "12250111298", R.drawable.dwik))
        mahasiswaList.add(Mahasiswa("Fajri", "12250110382", R.drawable.fajri))
        mahasiswaList.add(Mahasiswa("Fakhri", "12250111381", R.drawable.fakhri))
        mahasiswaList.add(Mahasiswa("Farras Lathief", "12250111328", R.drawable.farras))
        mahasiswaList.add(Mahasiswa("Gilang Ramadhan Indra ", "12250111323", R.drawable.gilang))
        mahasiswaList.add(Mahasiswa("Hafidz Alhadid Rahman ", "12250111794", R.drawable.hafidz))
        mahasiswaList.add(Mahasiswa("Haritsah Naufaldy", "12250110361", R.drawable.aldy))
        mahasiswaList.add(Mahasiswa("M. Nabil Dawami", "12250111527", R.drawable.nabil))
        mahasiswaList.add(Mahasiswa("Muh. Zaki Erbai Syas", "12250111134", R.drawable.zaki))
        mahasiswaList.add(Mahasiswa("Muhammad Aditya Rinaldi", "12250111048", R.drawable.adit))
        mahasiswaList.add(Mahasiswa("Muhammad Dhimas Hadid", "12250111231", R.drawable.dms))
        mahasiswaList.add(Mahasiswa("Muhammad Faruq", "12250111791", R.drawable.faruq))
        mahasiswaList.add(Mahasiswa("Muhammad Rafly Wirayudha", "12250111489", R.drawable.rafly))
        mahasiswaList.add(Mahasiswa("Nurika Dwi Wahyuni", "12250120360", R.drawable.nurika))
        mahasiswaList.add(Mahasiswa("Ogya Secio Noegroho.s", "12250111346", R.drawable.ogi))
        mahasiswaList.add(Mahasiswa("Rahma Laksita", "12250124357", R.drawable.rahma))
        mahasiswaList.add(Mahasiswa("Surya Hidayatullah Firdaus", "12250111759", R.drawable.surya))
        adapter.notifyDataSetChanged()
    }
}

