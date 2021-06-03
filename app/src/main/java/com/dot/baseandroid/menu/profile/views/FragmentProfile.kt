package com.dot.baseandroid.menu.profile.views

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.dot.baseandroid.databinding.FragmentProfileBinding
import com.dot.baseandroid.menu.profile.viewmodels.ProfileViewModel
import androidx.fragment.app.viewModels
import com.dot.baseandroid.R
import com.dot.baseandroid.menu.profile.models.DataProfileModel

class FragmentProfile: Fragment()  {

    private lateinit var binding: FragmentProfileBinding
    private val viewModel: ProfileViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_profile, container, false)
        binding.lifecycleOwner = this
        binding.profile = viewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        observeData()

        viewModel.getProfile()
    }

    private fun observeData(){
        viewModel.liveDataProfile.observe(viewLifecycleOwner, {
            setupComponent(it)
        })
    }

    private fun setupComponent(dataProfileModel: DataProfileModel){
        binding.username.text = dataProfileModel.username
        binding.fullname.text = dataProfileModel.fullname
        binding.email.text = dataProfileModel.email
        binding.phone.text = dataProfileModel.phone
//        binding.imageprofile.s = dataProfileModel.avatar
    }

}