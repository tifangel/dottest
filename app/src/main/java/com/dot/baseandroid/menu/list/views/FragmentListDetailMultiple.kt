package com.dot.baseandroid.menu.list.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.dot.baseandroid.R
import com.dot.baseandroid.databinding.FragmentListDetailMultipleBinding
import com.dot.baseandroid.main.MainActivity
import com.dot.baseandroid.menu.list.adapters.DetailMultipleAdapter
import com.dot.baseandroid.menu.list.viewmodels.ItemListViewModel
import com.dot.baseandroid.utils.ViewModelFragmentFactory

class FragmentListDetailMultiple: Fragment() {

    private val args: FragmentListDetailMultipleArgs by navArgs()
    private lateinit var binding: FragmentListDetailMultipleBinding
    private val viewModel: ItemListViewModel by viewModels { ViewModelFragmentFactory(args.dataDetailListMutiplePlace as Any) }

    private lateinit var adapter: DetailMultipleAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_list_detail_multiple, container, false)

        binding.listDetailMultiple = viewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = args.dataDetailListMutiplePlace?.media?.let { DetailMultipleAdapter(it) }!!
        binding.recyclerViewDetailImage.adapter = adapter
    }



}