package com.example.recylerviewapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MahasiswaAdapter(private val mahasiswaList: List<Mahasiswa>) : RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MahasiswaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_design, parent, false)
        return MahasiswaViewHolder(view)
    }

    override fun onBindViewHolder(holder: MahasiswaViewHolder, position: Int) {
        val mahasiswa = mahasiswaList[position]
        holder.gambar.setImageResource(mahasiswa.gambar)
        holder.nama.text = mahasiswa.nama
        holder.nim.text = mahasiswa.nim
    }

    override fun getItemCount(): Int {
        return mahasiswaList.size
    }

    inner class MahasiswaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gambar: ImageView = itemView.findViewById(R.id.gambar)
        val nama: TextView = itemView.findViewById(R.id.nama)
        val nim: TextView = itemView.findViewById(R.id.deskripsi)
    }
}
