package com.dot.baseandroid.menu.list.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.core.view.get
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import androidx.viewpager2.widget.ViewPager2
import com.dot.baseandroid.R
import com.dot.baseandroid.databinding.FragmentListDetailMultipleBinding
import com.dot.baseandroid.menu.list.adapters.DetailMultipleAdapter
import com.dot.baseandroid.menu.list.viewmodels.ItemListViewModel
import com.dot.baseandroid.utils.ViewModelFragmentFactory

class FragmentListDetailMultiple: Fragment() {

    private val args: FragmentListDetailMultipleArgs by navArgs()
    private lateinit var binding: FragmentListDetailMultipleBinding
    private val viewModel: ItemListViewModel by viewModels { ViewModelFragmentFactory(args.dataDetailListMutiplePlace as Any) }

    private lateinit var adapter: DetailMultipleAdapter

    private lateinit var listImage: ArrayList<String>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_list_detail_multiple, container, false)
        binding.listDetailMultiple = viewModel

        listImage = args.dataDetailListMutiplePlace?.media!!

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = args.dataDetailListMutiplePlace?.media?.let { DetailMultipleAdapter(it) }!!
        binding.recyclerViewDetailImage.adapter = adapter

        setupIndicators()
        setCurrentIndicators(0)

        binding.recyclerViewDetailImage.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setCurrentIndicators(position)
            }
        })

    }

    fun setupIndicators(){
        val layoutParams: LinearLayout.LayoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        layoutParams.setMargins(15,0,15,0)
        binding.indicatorsListDetail.removeAllViews()
        for (i in listImage.indices){
            var imageView = ImageView(activity?.applicationContext)
            imageView.layoutParams = layoutParams
            imageView.setImageResource(R.drawable.indicator_inactive)
            binding.indicatorsListDetail.addView(imageView)
        }
    }

    fun setCurrentIndicators(index: Int){
        for (i in 0 until binding.indicatorsListDetail.childCount){
            val indicatorView = binding.indicatorsListDetail.getChildAt(i) as ImageView
            if (i == index){
                indicatorView.setImageResource(R.drawable.indicator_active)
            }else{
                indicatorView.setImageResource(R.drawable.indicator_inactive)
            }
        }
    }

}
