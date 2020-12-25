package com.example.materialdesign.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.materialdesign.R

class RvAdapter(
    private val mContext: Context,
    private val ulkelerDisaridanGelenListe: List<Ulkeler>
) : RecyclerView.Adapter<RvAdapter.CardViewTasarimNesneleriniTutucu>() {

    inner class CardViewTasarimNesneleriniTutucu(view: View) : RecyclerView.ViewHolder(view) {

        var satirCardView: CardView
        var satirYazi: TextView
        var imageViewNokta: ImageView

        init {

            satirCardView = view.findViewById(R.id.cardViewSatir);
            satirYazi = view.findViewById(R.id.textViewSatirYazi);
            imageViewNokta = view.findViewById(R.id.imageViewNokta);
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewTasarimNesneleriniTutucu {

        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.card_tasarimi, parent, false)
        return CardViewTasarimNesneleriniTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardViewTasarimNesneleriniTutucu, position: Int) {
        val ulke = ulkelerDisaridanGelenListe[position]
        holder.satirYazi.text = ulke.ulkeAdi

        holder.satirCardView.setOnClickListener {
            Toast.makeText(mContext, "Seçtiğiniz Ülke : ${ulke.ulkeAdi}", Toast.LENGTH_LONG).show()
        }

        holder.imageViewNokta.setOnClickListener {

            val popup = PopupMenu(mContext, holder.imageViewNokta)
            popup.menuInflater.inflate(R.menu.popup_menu, popup.menu)
            popup.show()


            popup.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action_sil -> {
                        Toast.makeText(mContext, "Sil : ${ulke.ulkeAdi}", Toast.LENGTH_LONG).show()
                        true
                    }

                    R.id.action_duzenle -> {
                        Toast.makeText(mContext, "Düzenle : ${ulke.ulkeAdi}", Toast.LENGTH_LONG).show()
                        false
                    }
                    else -> false
                }
            }
        }


    }

    override fun getItemCount(): Int {
        return ulkelerDisaridanGelenListe.size
    }
}