package com.example.odev6.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.odev6.R
import com.example.odev6.data.entity.Category
import com.example.odev6.databinding.CardCategoryDesignBinding
import com.google.android.material.snackbar.Snackbar

class CategoriesAdapter(var mContext: Context, var categoryList: List<Category> ): RecyclerView.Adapter<CategoriesAdapter.CardDesignHolder>() {

    inner class CardDesignHolder(var design: CardCategoryDesignBinding): RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        //binding = FragmentMainBinding.inflate(inflater, container, false)
        val binding = CardCategoryDesignBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardDesignHolder(binding)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val category = categoryList[position]
        val design = holder.design

        design.imageViewCategory.setImageResource(mContext.resources.getIdentifier(category.image,"drawable",mContext.packageName))
        design.textViewCName.text = "${category.name}"

        design.designCategory.setOnClickListener {
            Snackbar.make(it,"${category.name} seçildi",Snackbar.LENGTH_SHORT)
                .setTextColor(mContext.resources.getColor(R.color.mainColor))
                .setBackgroundTint(mContext.resources.getColor(R.color.secondaryColor, null))
                .show()
        }
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }


}