package com.example.odev6.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.odev6.R
import com.example.odev6.data.entity.Category
import com.example.odev6.databinding.FragmentMainBinding
import com.example.odev6.ui.adapter.CategoriesAdapter

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.categoryRv.layoutManager = StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL)

        val categoriesList = ArrayList<Category>()
        val c1 = Category(1,"Beverages","beverages")
        val c2 = Category(2,"Fruits & Veggies","fruits_and_veggies")
        val c3 = Category(3,"Milk & Dairy","milk_and_dairy")
        val c4 = Category(4,"Baked Goods","baked_goods")
        val c5 = Category(5,"Snacks","snacks")
        val c6 = Category(6,"Ice Cream","ice_cream")
        val c7 = Category(7,"Food","food")
        val c8 = Category(8,"Breakfast","breakfast")
        val c9 = Category(9,"Ready to Eat","ready_to_eat")
        val c10 = Category(10,"Fit & Form","fit_and_form")
        val c11 = Category(11,"Personal Care","personal_care")
        val c12 = Category(12,"Home Care","home_care")
        val c13 = Category(13,"Home & Living","home_and_living")
        val c14 = Category(14,"Pet Food","pet_food")
        val c15 = Category(15,"Baby Care","baby_care")
        val c16 = Category(16, "Sex Health","sex_health")

        categoriesList.add(c1)
        categoriesList.add(c2)
        categoriesList.add(c3)
        categoriesList.add(c4)
        categoriesList.add(c5)
        categoriesList.add(c6)
        categoriesList.add(c7)
        categoriesList.add(c8)
        categoriesList.add(c9)
        categoriesList.add(c10)
        categoriesList.add(c11)
        categoriesList.add(c12)
        categoriesList.add(c13)
        categoriesList.add(c14)
        categoriesList.add(c15)
        categoriesList.add(c16)

        val categoriesAdapter = CategoriesAdapter(requireContext(),categoriesList)
        binding.categoryRv.adapter = categoriesAdapter



        return binding.root
    }
}